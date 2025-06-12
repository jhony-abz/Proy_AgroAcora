package com.mycompany.proy_agroacora.Controlador;

import com.mycompany.proy_agroacora.Modelo.ValidacionIngreso;
import com.mycompany.proy_agroacora.Vista.VenIngreso;
import com.mycompany.proy_agroacora.Vista.VenMenu;
import javax.swing.JOptionPane;

public class ControlIngreso {

    private VenIngreso vista;
    private ValidacionIngreso modelo;

    public ControlIngreso(VenIngreso vista, ValidacionIngreso modelo) {
        this.vista = vista;
        this.modelo = modelo;

        // Asociar botón
        this.vista.getBotIngreso().addActionListener(e -> validarIngreso());
    }

    private void validarIngreso() {
        String contrasena = String.valueOf(vista.getFieldPassIngreso().getPassword());

        if (modelo.validarContrasena(contrasena)) {
            vista.dispose();  // Cierra la ventana actual
            new VenMenu().setVisible(true);  // Abre la ventana principal
        } else {
            JOptionPane.showMessageDialog(vista, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
