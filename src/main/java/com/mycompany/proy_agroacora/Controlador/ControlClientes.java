package com.mycompany.proy_agroacora.Controlador;

import com.mycompany.proy_agroacora.Modelo.ClienteDAO;
import com.mycompany.proy_agroacora.Modelo.Cliente;
import com.mycompany.proy_agroacora.Vista.VenClientes;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ControlClientes {
//Controlador para manejar la ventana VenCliente

    private VenClientes vista;
    private ClienteDAO modelo;

    public ControlClientes(VenClientes vista) {
        this.vista = vista;
        this.modelo = new ClienteDAO();
        cargarTablaClientes(); // Llenamos tabla al inicializar

        this.vista.getBotActualizar().addActionListener(e -> cargarTablaClientes());

        this.vista.getBotAgregar().addActionListener(e -> abrirFormularioAgregarCliente());
    }
//Función para aperturar la ventana VenAgregarCliente

    private void abrirFormularioAgregarCliente() {
        com.mycompany.proy_agroacora.Vista.VenAgregarCliente ventana = new com.mycompany.proy_agroacora.Vista.VenAgregarCliente();
        com.mycompany.proy_agroacora.Controlador.ControlAgregarCliente control = new com.mycompany.proy_agroacora.Controlador.ControlAgregarCliente(ventana);
        ventana.setLocationRelativeTo(null); // Centrar la ventana
        ventana.setVisible(true);
    }
//Función para cargar los datos de la bd a la tabla de la ventana

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
}
