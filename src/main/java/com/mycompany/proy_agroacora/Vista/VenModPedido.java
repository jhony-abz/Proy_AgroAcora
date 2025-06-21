package com.mycompany.proy_agroacora.Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class VenModPedido extends javax.swing.JPanel {
//Ventana que maneja la interfaz del módulo de Pedidos

    public VenModPedido() {
        initComponents();
        TFPrecio.setEditable(false);
        TFTotal.setEditable(false);
        SpCant.setModel(new javax.swing.SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));

    }

    //Getters para manejar las funcionalides mediante el controlador ControlModPedido
    public JButton getBotBuscar() {
        return BotBuscar;
    }

    public JTextField getTFCorreo() {
        return TFCorreo;
    }

    public JTextField getTFDirec() {
        return TFDirec;
    }

    public JTextField getTFDni() {
        return TFDni;
    }

    public JTextField getTFNombre() {
        return TFNombre;
    }

    public JTextField getTFTelefono() {
        return TFTelefono;
    }

    public JComboBox<String> getCBProducto() {
        return CBProducto;
    }

    public JTextField getTFPrecio() {
        return TFPrecio;
    }

    public JTable getTProdSeleccionados() {
        return TProdSeleccionados;
    }

    public JSpinner getSpCant() {
        return SpCant;
    }

    public JButton getBotAgregar() {
        return BotAgregar;
    }

    public JTextField getTFTotal() {
        return TFTotal;
    }

    public JButton getBotEliminar() {
        return BotEliminar;
    }

    public JButton getBotElTod() {
        return BotElTod;
    }

    public JButton getBotReaPedido() {
        return BotReaPedido;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TFNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFDni = new javax.swing.JTextField();
        BotBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TFDirec = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CBProducto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        BotAgregar = new javax.swing.JButton();
        SpCant = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        TProdSeleccionados = new javax.swing.JTable();
        BotReaPedido = new javax.swing.JButton();
        BotVerPedidos = new javax.swing.JButton();
        BotEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TFTotal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TFPrecio = new javax.swing.JTextField();
        BotElTod = new javax.swing.JButton();

        setBackground(new java.awt.Color(194, 213, 141));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Módulo de Gestión de Pedidos");

        TFNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teléfono:");

        TFTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RUC/DNI:");

        TFDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        BotBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotBuscar.setText("@");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dirección:");

        TFDirec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo:");

        TFCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Producto:");

        CBProducto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cantidad:");

        BotAgregar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        BotAgregar.setText("Agregar");

        SpCant.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        TProdSeleccionados.setBackground(new java.awt.Color(255, 255, 255));
        TProdSeleccionados.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TProdSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TProdSeleccionados);

        BotReaPedido.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        BotReaPedido.setText("Realizar Pedido");

        BotVerPedidos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        BotVerPedidos.setText("Ver Pedidos");

        BotEliminar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        BotEliminar.setText("Eliminar");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total:");

        TFTotal.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Precio:");

        TFPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        BotElTod.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        BotElTod.setText("Eliminar todo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotBuscar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(TFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TFDirec)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CBProducto, 0, 224, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotReaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpCant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BotElTod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(BotVerPedidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(TFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(TFDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CBProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SpCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BotAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(BotElTod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotVerPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(TFTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(BotReaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAgregar;
    private javax.swing.JButton BotBuscar;
    private javax.swing.JButton BotElTod;
    private javax.swing.JButton BotEliminar;
    private javax.swing.JButton BotReaPedido;
    private javax.swing.JButton BotVerPedidos;
    private javax.swing.JComboBox<String> CBProducto;
    private javax.swing.JSpinner SpCant;
    private javax.swing.JTextField TFCorreo;
    private javax.swing.JTextField TFDirec;
    private javax.swing.JTextField TFDni;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTextField TFPrecio;
    private javax.swing.JTextField TFTelefono;
    private javax.swing.JTextField TFTotal;
    private javax.swing.JTable TProdSeleccionados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBotVerPedidos() {
        return BotVerPedidos;
    }

}
