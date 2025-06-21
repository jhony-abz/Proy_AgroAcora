package com.mycompany.proy_agroacora.Controlador;

import com.mycompany.proy_agroacora.Modelo.Cliente;
import com.mycompany.proy_agroacora.Modelo.ClienteDAO;
import com.mycompany.proy_agroacora.Vista.VenAgregarCliente;

import javax.swing.*;

public class ControlAgregarCliente {
//Controlador para manejar la VenAgregarCliente

    private VenAgregarCliente vista;
    private ClienteDAO modelo;

    public ControlAgregarCliente(VenAgregarCliente vista) {
        this.vista = vista;
        this.modelo = new ClienteDAO();
//Llamado de funciones declaradas más abajo
        this.vista.getBotAgregar().addActionListener(e -> insertarCliente());
        this.vista.getBotCerrar().addActionListener(e -> vista.dispose());
    }
//Función que inserta los datos ingresados en la ventana y validad por las funciones en el ClienteDAO

    private void insertarCliente() {
        String nombre = vista.getTFNom().getText().trim();
        String dni = vista.getTFDni().getText().trim();
        String direccion = vista.getTFDirec().getText().trim();
        String telefono = vista.getTFTelf().getText().trim();
        String correo = vista.getTFCorreo().getText().trim();

        if (nombre.isEmpty() || dni.isEmpty()) {
            JOptionPane.showMessageDialog(vista, "Nombre y DNI son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setDNI(dni);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setEmail(correo);

        boolean exito = modelo.insertar(cliente);
        if (exito) {
            JOptionPane.showMessageDialog(vista, "Cliente registrado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            vista.dispose(); // Cierra la ventana tras registrar
        } else {
            JOptionPane.showMessageDialog(vista, "No se pudo registrar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
