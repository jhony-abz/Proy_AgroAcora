package com.mycompany.proy_agroacora.Controlador;

import com.mycompany.proy_agroacora.Modelo.*;
import com.mycompany.proy_agroacora.Vista.VenAgregarCliente;
import com.mycompany.proy_agroacora.Vista.VenModPedido;
import com.mycompany.proy_agroacora.Vista.VenPedidos;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ControlModPedido {

    //Controlador de la ventana VenModPedido
    private VenModPedido vista;
    private ClienteDAO clienteDAO;
    private Map<String, Producto> productosMap;
    private DefaultTableModel modeloTabla;

    public ControlModPedido(VenModPedido vista) {
        this.vista = vista;
        this.clienteDAO = new ClienteDAO();

        configurarTabla(); // ✅
        //Llamado de funciones
        this.vista.getBotVerPedidos().addActionListener(e -> abrirVentanaPedidos());
        this.vista.getBotBuscar().addActionListener(e -> buscarClientePorDNI());
        this.vista.getBotAgregar().addActionListener(e -> agregarProductoATabla());
        this.vista.getBotEliminar().addActionListener(e -> eliminarProductoSeleccionado());
        this.vista.getBotElTod().addActionListener(e -> eliminarTodosLosProductos());
        vista.getBotReaPedido().addActionListener(e -> registrarPedido());

        cargarProductosEnComboBox();
        vista.getCBProducto().addActionListener(e -> mostrarPrecioProducto());
    }
    //Función para aperturar la ventana VenPedidos

    private void abrirVentanaPedidos() {
        VenPedidos ventanaPedidos = new VenPedidos();
        new ControlPedidos(ventanaPedidos);
        ventanaPedidos.setVisible(true);
    }

    //Función que da la función de buscar al botón @
    private void buscarClientePorDNI() {
        String dni = vista.getTFDni().getText().trim();

        if (!dni.isEmpty()) {
            Cliente c = clienteDAO.buscarPorDNI(dni);
            if (c != null) {
                vista.getTFNombre().setText(c.getNombre());
                vista.getTFDirec().setText(c.getDireccion());
                vista.getTFTelefono().setText(c.getTelefono());
                vista.getTFCorreo().setText(c.getEmail());

                javax.swing.JOptionPane.showMessageDialog(vista, "Datos encontrados");
            } else {
                int opcion = javax.swing.JOptionPane.showOptionDialog(
                        vista,
                        "No se encuentran los datos buscados. ¿Desea agregar al cliente?",
                        "Cliente no encontrado",
                        javax.swing.JOptionPane.YES_NO_OPTION,
                        javax.swing.JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{"Continuar", "Cerrar"},
                        "Continuar"
                );

                if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                    abrirVentanaAgregarCliente();
                }
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(vista, "Por favor ingrese un DNI");
        }
    }
    //Función posterior a la búsqueda en caso no se encuentre el dato ingresado - Apertura la ventana VenAgregarCliente

    private void abrirVentanaAgregarCliente() {
        String dni = vista.getTFDni().getText().trim();
        String nombre = vista.getTFNombre().getText().trim();
        String direccion = vista.getTFDirec().getText().trim();
        String telefono = vista.getTFTelefono().getText().trim();
        String correo = vista.getTFCorreo().getText().trim();

        VenAgregarCliente ventana = new VenAgregarCliente(dni, nombre, direccion, telefono, correo, vista);

        new ControlAgregarCliente(ventana);

        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

    //Función que jala los datos de la bd mediante el DAO y los pone en el combobox para su selección
    private void cargarProductosEnComboBox() {
        productosMap = new HashMap<>();
        List<Producto> lista = new ProductoDAO().listar(); // Asegúrate de tener esta clase

        vista.getCBProducto().removeAllItems();

        for (Producto p : lista) {
            vista.getCBProducto().addItem(p.getNombre());
            productosMap.put(p.getNombre(), p);
        }
    }

    //Función que muestra el precio del producto seleccionado en el ComboBox
    private void mostrarPrecioProducto() {
        String nombreSeleccionado = (String) vista.getCBProducto().getSelectedItem();
        if (nombreSeleccionado != null && productosMap.containsKey(nombreSeleccionado)) {
            Producto producto = productosMap.get(nombreSeleccionado);
            vista.getTFPrecio().setText(String.valueOf(producto.getPrecio()));
        } else {
            vista.getTFPrecio().setText("");
        }
    }

    //Función para modificar el diseño de la tabla
    private void configurarTabla() {
        modeloTabla = new DefaultTableModel(new Object[]{"Producto", "Cantidad", "Precio U.", "Subtotal"}, 0) {
            @Override
            //Función para no hacer editable las celdas de la tabla
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        vista.getTProdSeleccionados().setModel(modeloTabla);

        // Ajustar tamaños de columnas
        vista.getTProdSeleccionados().getColumnModel().getColumn(0).setPreferredWidth(150);
        vista.getTProdSeleccionados().getColumnModel().getColumn(1).setPreferredWidth(60);
        vista.getTProdSeleccionados().getColumnModel().getColumn(2).setPreferredWidth(80);
        vista.getTProdSeleccionados().getColumnModel().getColumn(3).setPreferredWidth(90);
    }

    //Función para agregar los datos a la tabla - Producto, precio unitario, cantidad y subtotal
    private void agregarProductoATabla() {
        String nombreProducto = (String) vista.getCBProducto().getSelectedItem();
        int cantidad = (int) vista.getSpCant().getValue();

        if (nombreProducto == null || cantidad <= 0) {
            JOptionPane.showMessageDialog(vista, "Seleccione un producto válido y una cantidad mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar si el producto ya fue agregado
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String nombreEnTabla = modeloTabla.getValueAt(i, 0).toString();
            if (nombreEnTabla.equals(nombreProducto)) {
                JOptionPane.showMessageDialog(vista, "El producto ya fue agregado", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        Producto producto = productosMap.get(nombreProducto);
        double precio = producto.getPrecio();
        double subtotal = precio * cantidad;

        modeloTabla.addRow(new Object[]{
            producto.getNombre(),
            cantidad,
            precio,
            subtotal
        });
        //Función llamada para actualizar la tabla automáticamente
        actualizarTotal();
    }

    // Función para eliminar producto ingresado en la tabla
    private void eliminarProductoSeleccionado() {
        int filaSeleccionada = vista.getTProdSeleccionados().getSelectedRow();

        if (filaSeleccionada != -1) {
            modeloTabla.removeRow(filaSeleccionada);
            actualizarTotal();
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione una fila para eliminar", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    //Función similar a la anterior, pero que limpia la tabla completa
    private void eliminarTodosLosProductos() {
        int totalFilas = modeloTabla.getRowCount();
        if (totalFilas == 0) {
            JOptionPane.showMessageDialog(vista, "No hay productos en la tabla", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //Mensaje de confirmación para la eliminación de los datos
        int confirmacion = JOptionPane.showConfirmDialog(
                vista,
                "¿Desea eliminar todos los productos seleccionados?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacion == JOptionPane.YES_OPTION) {
            modeloTabla.setRowCount(0);
            actualizarTotal(); //Recalcula el total
        }
    }

    //Función para actualizar la tabla con cada cambio realizado
    private void actualizarTotal() {
        double total = 0;
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            double subtotal = (double) modeloTabla.getValueAt(i, 3);
            total += subtotal;
        }
        vista.getTFTotal().setText(String.format("S/." + "%.2f", total));
    }

    private void registrarPedido() {
        // Validación
        if (modeloTabla.getRowCount() == 0) {
            JOptionPane.showMessageDialog(vista, "No hay productos seleccionados", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String dni = vista.getTFDni().getText().trim();
        Cliente cliente = clienteDAO.buscarPorDNI(dni);

        if (cliente == null) {
            JOptionPane.showMessageDialog(vista, "Debe ingresar un cliente válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double total = 0;
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            total += (double) modeloTabla.getValueAt(i, 3);
        }

        // Insertar pedido
        Pedido pedido = new Pedido();
        pedido.setIdCliente(cliente.getIdCliente());
        pedido.setTotal(total);

        PedidoDAO pedidoDAO = new PedidoDAO();
        int idPedidoGenerado = pedidoDAO.insertar(pedido);

        if (idPedidoGenerado == -1) {
            JOptionPane.showMessageDialog(vista, "No se pudo registrar el pedido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Insertar detalles
        DetallePedidoDAO detalleDAO = new DetallePedidoDAO();

        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String nombre = (String) modeloTabla.getValueAt(i, 0);
            int cantidad = (int) modeloTabla.getValueAt(i, 1);
            double subtotal = (double) modeloTabla.getValueAt(i, 3);

            Producto producto = productosMap.get(nombre);

            DetallePedido dp = new DetallePedido();
            dp.setIdPedido(idPedidoGenerado);
            dp.setIdProducto(producto.getIdProducto());
            dp.setCantidad(cantidad);
            dp.setSubtotal(subtotal);
            dp.setPrecioUnitario(producto.getPrecio()); // ✅ ¡ESTO FALTABA!

            detalleDAO.insertar(dp);

            // (Opcional) Descontar stock:
            producto.setStock(producto.getStock() - cantidad);
            new ProductoDAO().actualizar(producto);
        }
        // Mostrar mensaje de éxito
        JOptionPane.showMessageDialog(vista, "Pedido registrado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Ruta del PDF con código único
        String codigoPedido = String.format("E%04d", idPedidoGenerado);
        String rutaPDF = "reportes/" + codigoPedido + ".pdf"; // asegúrate de que exista la carpeta 'reportes'
        new File("reportes").mkdirs(); // Crea carpeta si no existe
        // Generar PDF
        GeneradorPDF.generarResumenPDF(cliente, modeloTabla, total, idPedidoGenerado, rutaPDF);

        // Limpiar tabla
        modeloTabla.setRowCount(0);
        actualizarTotal();
    }

}
