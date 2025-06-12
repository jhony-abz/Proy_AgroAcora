package com.mycompany.proy_agroacora;

import com.mycompany.proy_agroacora.Controlador.ControlIngreso;
import com.mycompany.proy_agroacora.Modelo.ValidacionIngreso;
import com.mycompany.proy_agroacora.Vista.VenIngreso;

public class App {

    public static void main(String[] args) {
        VenIngreso vista = new VenIngreso();
        ValidacionIngreso modelo = new ValidacionIngreso();
        new ControlIngreso(vista, modelo);
        vista.setVisible(true);
    }

}
