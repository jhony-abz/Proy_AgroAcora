package com.mycompany.proy_agroacora.Controlador;

import com.mycompany.proy_agroacora.Modelo.Cliente;
import com.mycompany.proy_agroacora.Modelo.ClienteDAO;
import com.mycompany.proy_agroacora.Vista.VenEditarCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControlEditarCliente {

    private VenEditarCliente vistaEditar;
    private ClienteDAO clienteDAO;
    private int idCliente; // 🔸 Aquí guardamos el ID fijo

    public ControlEditarCliente(VenEditarCliente vistaEditar, int idCliente) {
        this.vistaEditar = vistaEditar;
        this.clienteDAO = new ClienteDAO();
        this.idCliente = idCliente; // 🔸 Guardamos el ID

        this.vistaEditar.getBtnGuardar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarCambios();
            }
        });

        this.vistaEditar.getBtnCancelar().addActionListener(e -> vistaEditar.dispose());
    }

    private void guardarCambios() {
        String nombre = vistaEditar.getTFNom().getText().trim();
        String dni = vistaEditar.getTFDni().getText().trim();
        String direccion = vistaEditar.getTFDirec().getText().trim();
        String telefono = vistaEditar.getTFTelf().getText().trim();
        String correo = vistaEditar.getTFCorreo().getText().trim();

        Cliente cliente = new Cliente();
        cliente.setIdCliente(idCliente); // ✅ Lo usamos aquí directamente
        cliente.setNombre(nombre);
        cliente.setDNI(dni);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setEmail(correo);

        boolean actualizado = clienteDAO.actualizar(cliente);
        if (actualizado) {
            JOptionPane.showMessageDialog(vistaEditar, "Cliente actualizado correctamente.");
            vistaEditar.dispose();
        } else {
            JOptionPane.showMessageDialog(vistaEditar, "Error al actualizar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
