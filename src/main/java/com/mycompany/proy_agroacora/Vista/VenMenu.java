package com.mycompany.proy_agroacora.Vista;

import java.awt.BorderLayout;

public class VenMenu extends javax.swing.JFrame {
//Ventana principal con JPanel que varía acorde a las ventanas a utilizar

    VenPresentaci0n venPres = new VenPresentaci0n();
    VenModPedido venMPed = new VenModPedido();
    VenModAlmacen venMAlm = new VenModAlmacen();

    public VenMenu() {
        initComponents();
        //Utilidades para mostrar las otras ventanas dentro del JPanel
        venPres.setSize(720, 570);
        venPres.setLocation(0, 0);
        contenido.removeAll(); // Limpia el contenido actual
        contenido.add(venPres, BorderLayout.CENTER); // Añade el nuevo panel
        contenido.revalidate(); // Vuelve a validar los componentes
        contenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotPedidos = new javax.swing.JButton();
        BotAlmacen = new javax.swing.JButton();
        BotSalir = new javax.swing.JButton();
        contenido = new javax.swing.JPanel();
        BotClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(135, 166, 75));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO");

        BotPedidos.setBackground(new java.awt.Color(169, 193, 122));
        BotPedidos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotPedidos.setForeground(new java.awt.Color(255, 255, 255));
        BotPedidos.setText("Pedidos");
        BotPedidos.setBorderPainted(false);
        BotPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotPedidosActionPerformed(evt);
            }
        });

        BotAlmacen.setBackground(new java.awt.Color(169, 193, 122));
        BotAlmacen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        BotAlmacen.setText("Almacén");
        BotAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotAlmacenActionPerformed(evt);
            }
        });

        BotSalir.setBackground(new java.awt.Color(169, 193, 122));
        BotSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotSalir.setText("Salir");
        BotSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BotClientes.setBackground(new java.awt.Color(169, 193, 122));
        BotClientes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        BotClientes.setForeground(new java.awt.Color(255, 255, 255));
        BotClientes.setText("Clientes");
        BotClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(BotPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(BotAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(BotClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(BotSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Función para mostrar la ventana VenPedidos
    private void BotPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotPedidosActionPerformed
        venMPed.setSize(720, 570);
        venMPed.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(venMPed, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        new com.mycompany.proy_agroacora.Controlador.ControlModPedido(venMPed);
    }//GEN-LAST:event_BotPedidosActionPerformed

    private void BotSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotSalirActionPerformed
    //Funcion para mostrar la ventana VenAlmacen - Pendiente a codificar
    private void BotAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotAlmacenActionPerformed
        venMAlm.setSize(720, 570);
        venMAlm.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(venMAlm, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_BotAlmacenActionPerformed
    //Función que apertura la ventana VenClientes de manera independiente
    private void BotClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotClientesActionPerformed
        VenClientes venClientes = new VenClientes();
        new com.mycompany.proy_agroacora.Controlador.ControlClientes(venClientes);
        venClientes.setVisible(true);
    }//GEN-LAST:event_BotClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAlmacen;
    private javax.swing.JButton BotClientes;
    private javax.swing.JButton BotPedidos;
    private javax.swing.JButton BotSalir;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
