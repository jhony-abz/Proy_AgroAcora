package com.mycompany.proy_agroacora.Controlador;

import com.mycompany.proy_agroacora.Modelo.*;
import com.mycompany.proy_agroacora.Vista.VenPedidos;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControlPedidos {

    private VenPedidos vista;
    private PedidoDAO pedidoDAO = new PedidoDAO();
    private ClienteDAO clienteDAO = new ClienteDAO();
    private DetallePedidoDAO detalleDAO = new DetallePedidoDAO();
    private ProductoDAO productoDAO = new ProductoDAO();

    public ControlPedidos(VenPedidos vista) {
        this.vista = vista;

        this.vista.getBotFiltro().addActionListener(e -> filtrarPedidos());
        this.vista.getBotActualizar().addActionListener(e -> actualizarTabla());
        this.vista.getBotVerRes().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verResumenPDF();
            }
        });
        this.vista.getBotEliminar().addActionListener(e -> eliminarPedido());

        listarPedidos();
    }

    private void listarPedidos() {
        System.out.println("Llamando a listarPedidos...");
        DefaultTableModel modelo = (DefaultTableModel) vista.getTPedidos().getModel();
        modelo.setRowCount(0);

        for (Pedido pedido : pedidoDAO.listar()) {
            System.out.println("Pedido ID: " + pedido.getIdPedido());

            Cliente cliente = clienteDAO.buscarPorId(pedido.getIdCliente());
            if (cliente == null) {
                System.out.println("Cliente no encontrado: " + pedido.getIdCliente());
                continue;
            }

            List<DetallePedido> detalles = detalleDAO.listarPorPedido(pedido.getIdPedido());
            System.out.println("Productos encontrados: " + detalles.size());

            List<String> nombresProductos = new ArrayList<>();
            for (DetallePedido d : detalles) {
                Producto p = productoDAO.buscarPorId(d.getIdProducto());
                if (p != null) {
                    nombresProductos.add(p.getNombre());
                }
            }

            String productos = String.join(", ", nombresProductos);

            modelo.addRow(new Object[]{
                pedido.getIdPedido(),
                cliente.getNombre(),
                cliente.getDNI(),
                cliente.getTelefono(),
                productos,
                pedido.getFechaPedido(),
                cliente.getDireccion(),
                pedido.getTotal()
            });
        }
    }

    private void filtrarPedidos() {
        String criterio = vista.getCBFiltro().getSelectedItem().toString();
        String valor = vista.getTFFiltro().getText().trim().toLowerCase();

        DefaultTableModel modelo = (DefaultTableModel) vista.getTPedidos().getModel();
        modelo.setRowCount(0); // Limpiar tabla

        for (Pedido pedido : pedidoDAO.listar()) {
            Cliente cliente = clienteDAO.buscarPorId(pedido.getIdCliente());
            if (cliente == null) {
                continue;
            }

            boolean coincide = switch (criterio.toLowerCase()) {
                case "id" ->
                    String.valueOf(pedido.getIdPedido()).equals(valor);
                case "dni" ->
                    cliente.getDNI().toLowerCase().contains(valor);
                case "nombre" ->
                    cliente.getNombre().toLowerCase().contains(valor);
                default ->
                    false;
            };

            if (!coincide) {
                continue;
            }

            List<DetallePedido> detalles = detalleDAO.listarPorPedido(pedido.getIdPedido());
            List<String> nombresProductos = new ArrayList<>();
            for (DetallePedido d : detalles) {
                Producto p = productoDAO.buscarPorId(d.getIdProducto());
                if (p != null) {
                    nombresProductos.add(p.getNombre());
                }
            }

            String productos = String.join(", ", nombresProductos);

            modelo.addRow(new Object[]{
                pedido.getIdPedido(),
                cliente.getNombre(),
                cliente.getDNI(),
                cliente.getTelefono(),
                productos,
                pedido.getFechaPedido(),
                cliente.getDireccion(),
                pedido.getTotal()
            });
        }
    }

    private void actualizarTabla() {
        vista.getTFFiltro().setText(""); // Limpiar campo de texto
        vista.getCBFiltro().setSelectedIndex(0); // Seleccionar primera opción
        listarPedidos(); // Recargar todos los pedidos
    }

    private void verResumenPDF() {
        int filaSeleccionada = vista.getTPedidos().getSelectedRow();

        if (filaSeleccionada != -1) {
            // Obtener el ID del pedido seleccionado
            String idPedidoStr = vista.getTPedidos().getValueAt(filaSeleccionada, 0).toString();
            int idPedido = Integer.parseInt(idPedidoStr);

            // Formato del nombre del archivo
            String nombreArchivo = String.format("E%04d.pdf", idPedido);
            String rutaPDF = "reportes/" + nombreArchivo;

            try {
                File archivo = new File(rutaPDF);
                if (archivo.exists()) {
                    Desktop.getDesktop().open(archivo);
                } else {
                    JOptionPane.showMessageDialog(vista,
                            "El archivo PDF no fue encontrado:\n" + rutaPDF,
                            "Archivo no encontrado",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(vista,
                        "Ocurrió un error al intentar abrir el PDF.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(vista,
                    "Por favor selecciona un pedido de la tabla.",
                    "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void eliminarPedido() {
        int fila = vista.getTPedidos().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Seleccione un pedido para eliminar.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(vista, "¿Está seguro de eliminar este pedido?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        DefaultTableModel modelo = (DefaultTableModel) vista.getTPedidos().getModel();
        int idPedido = (int) modelo.getValueAt(fila, 0);

        // 1. Eliminar los detalles
        boolean detallesOk = detalleDAO.eliminarDetallesPorIdPedido(idPedido);
        if (!detallesOk) {
            JOptionPane.showMessageDialog(vista, "No se pudo eliminar los detalles del pedido.");
            return;
        }

        // 2. Eliminar el pedido
        boolean pedidoOk = pedidoDAO.eliminarPedido(idPedido);
        if (pedidoOk) {
            JOptionPane.showMessageDialog(vista, "Pedido eliminado correctamente.");
            listarPedidos(); // Recarga la tabla
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo eliminar el pedido.");
        }
    }

}
