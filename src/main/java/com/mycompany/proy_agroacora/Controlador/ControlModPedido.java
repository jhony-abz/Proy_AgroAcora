package com.mycompany.proy_agroacora.Controlador;

import com.mycompany.proy_agroacora.Vista.VenModPedido;
import com.mycompany.proy_agroacora.Vista.VenPedidos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlModPedido {

    private VenModPedido vista;

    public ControlModPedido(VenModPedido vista) {
        this.vista = vista;

        this.vista.getBotVerPedidos().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirVentanaPedidos();
            }
        });
    }

    private void abrirVentanaPedidos() {
        VenPedidos ventanaPedidos = new VenPedidos();
        ventanaPedidos.setVisible(true);
    }
}
