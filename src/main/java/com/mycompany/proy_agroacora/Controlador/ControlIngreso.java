package com.mycompany.proy_agroacora.Controlador;

import com.mycompany.proy_agroacora.Modelo.UsuarioDAO;
import com.mycompany.proy_agroacora.Vista.VenIngreso;
import com.mycompany.proy_agroacora.Vista.VenMenu;
import javax.swing.JOptionPane;

public class ControlIngreso {
//Controlador para manejar el ingreso de los usuarios con su validación de datos

    private VenIngreso vista;
    private UsuarioDAO modelo;

    public ControlIngreso(VenIngreso vista) {
        this.vista = vista;
        this.modelo = new UsuarioDAO();

        this.vista.getBotIngreso().addActionListener(e -> validarIngreso());
    }
//Función que valida los datos de la bd con los ingresados

    private void validarIngreso() {
        String usuario = vista.getFieldUsuario().getText();
        String contrasena = String.valueOf(vista.getFieldContrasena().getPassword());

        if (modelo.verificarUsuario(usuario, contrasena)) {
            JOptionPane.showMessageDialog(vista, "Datos correctos");
            vista.dispose();
            new VenMenu().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
