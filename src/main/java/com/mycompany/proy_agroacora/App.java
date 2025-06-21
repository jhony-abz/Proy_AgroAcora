package com.mycompany.proy_agroacora;

import com.mycompany.proy_agroacora.Controlador.ControlIngreso;
import com.mycompany.proy_agroacora.Vista.VenIngreso;

public class App {
//Inicio del sistema

    public static void main(String[] args) {
        VenIngreso vista = new VenIngreso();
        new ControlIngreso(vista);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
    }
}
