package com.mycompany.proy_agroacora.Controlador;

import com.mycompany.proy_agroacora.Modelo.Cliente;
import com.mycompany.proy_agroacora.Modelo.ClienteDAO;
import com.mycompany.proy_agroacora.Vista.VenClientes;
import com.mycompany.proy_agroacora.Vista.VenEditarCliente;

import javax.swing.*;
import javax.swing.table.*;
import java.util.List;

public class ControlClientes {

    private VenClientes vista;
    private ClienteDAO modelo;

    public ControlClientes(VenClientes vista) {
        this.vista = vista;
        this.modelo = new ClienteDAO();

        cargarTablaClientes(); // Mostrar clientes al inicio

        this.vista.getBotActualizar().addActionListener(e -> cargarTablaClientes());
        this.vista.getBotAgregar().addActionListener(e -> abrirFormularioAgregarCliente());
        this.vista.getBotFiltrar().addActionListener(e -> filtrarClientes());
        this.vista.getBotEliminar().addActionListener(e -> eliminarCliente());
        this.vista.getBotEditar().addActionListener(e -> abrirFormularioEditarCliente());
    }

    private void cargarTablaClientes() {
        List<Cliente> lista = modelo.listar();
        DefaultTableModel modeloTabla = (DefaultTableModel) vista.getTableClientes().getModel();
        modeloTabla.setRowCount(0); // Limpiar tabla

        for (Cliente c : lista) {
            modeloTabla.addRow(new Object[]{
                c.getIdCliente(),
                c.getNombre(),
                c.getDNI(),
                c.getDireccion(),
                c.getTelefono(),
                c.getEmail()
            });
        }
    }

    private void abrirFormularioAgregarCliente() {
        var ventana = new com.mycompany.proy_agroacora.Vista.VenAgregarCliente();
        var control = new com.mycompany.proy_agroacora.Controlador.ControlAgregarCliente(ventana);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        cargarTablaClientes(); // Actualizar luego de cerrar
    }

    private void filtrarClientes() {
        String filtro = vista.getTFFiltrar().getText().trim();
        String tipoFiltro = vista.getCBoxFiltro().getSelectedItem().toString();

        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) vista.getTableClientes().getModel());
        vista.getTableClientes().setRowSorter(sorter);

        int columna;

        switch (tipoFiltro) {
            case "Nombre":
                columna = 1;
                break;
            case "Telefono":
                columna = 4;
                break;
            default: // RUC/DNI
                columna = 2;
                break;
        }

        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + filtro, columna));
    }

    private void eliminarCliente() {
        int fila = vista.getTableClientes().getSelectedRow();
        if (fila != -1) {
            int id = Integer.parseInt(vista.getTableClientes().getValueAt(fila, 0).toString());
            int confirm = JOptionPane.showConfirmDialog(vista, "¿Eliminar este cliente?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                if (modelo.eliminar(id)) {
                    JOptionPane.showMessageDialog(vista, "Cliente eliminado.");
                    cargarTablaClientes();
                } else {
                    JOptionPane.showMessageDialog(vista, "Error al eliminar.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione un cliente para eliminar.");
        }
    }

    private void abrirFormularioEditarCliente() {
        int fila = vista.getTableClientes().getSelectedRow();
        if (fila != -1) {
            int id = Integer.parseInt(vista.getTableClientes().getValueAt(fila, 0).toString());
            String nombre = vista.getTableClientes().getValueAt(fila, 1).toString();
            String dni = vista.getTableClientes().getValueAt(fila, 2).toString();
            String direccion = vista.getTableClientes().getValueAt(fila, 3).toString();
            String telefono = vista.getTableClientes().getValueAt(fila, 4).toString();
            String correo = vista.getTableClientes().getValueAt(fila, 5).toString();

            // Crear ventana
            VenEditarCliente ventana = new VenEditarCliente(null, true);

            // Llenar campos excepto el ID (ya no existe el campo ID en el formulario)
            ventana.getTFNom().setText(nombre);
            ventana.getTFDni().setText(dni);
            ventana.getTFDirec().setText(direccion);
            ventana.getTFTelf().setText(telefono);
            ventana.getTFCorreo().setText(correo);

            // ⚠️ Pasa el id al controlador directamente
            new ControlEditarCliente(ventana, id);

            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);

            // Refrescar la tabla al cerrar
            cargarTablaClientes();
        } else {
            JOptionPane.showMessageDialog(vista, "Seleccione un cliente para editar.");
        }
    }

}
