package com.mycompany.proy_agroacora.Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class VenAgregarCliente extends javax.swing.JFrame {

    private VenModPedido vistaModPedido;

    public VenAgregarCliente() {
        initComponents();

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public VenAgregarCliente(String dni, String nombre, String direccion, String telefono, String correo, VenModPedido vistaModPedido) {
        initComponents();
        this.vistaModPedido = vistaModPedido;

        // Rellena los campos con lo que el usuario ya ingresó
        TFDni.setText(dni);
        TFNom.setText(nombre);
        TFDirec.setText(direccion);
        TFTelf.setText(telefono);
        TFCorreo.setText(correo);
    }

    //Getter para darle funcionalidades mediante el controlador ControlAgregarCliente
    public JButton getBotAgregar() {
        return BotAgregar;
    }

    public JButton getBotCerrar() {
        return BotCerrar;
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

    public JTextField getTFNom() {
        return TFNom;
    }

    public JTextField getTFTelf() {
        return TFTelf;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFNom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFDirec = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFTelf = new javax.swing.JTextField();
        BotAgregar = new javax.swing.JButton();
        BotCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(194, 213, 141));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Cliente");

        TFNom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RUC/DNI:");

        TFDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección:");

        TFDirec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");

        TFCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teléfono:");

        TFTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        BotAgregar.setBackground(new java.awt.Color(135, 166, 75));
        BotAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotAgregar.setText("Agregar");

        BotCerrar.setBackground(new java.awt.Color(135, 166, 75));
        BotCerrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotCerrar.setText("Cerrar");
        BotCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDirec))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(136, 136, 136))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFTelf)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFNom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(TFDni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(TFTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_BotCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotAgregar;
    private javax.swing.JButton BotCerrar;
    private javax.swing.JTextField TFCorreo;
    private javax.swing.JTextField TFDirec;
    private javax.swing.JTextField TFDni;
    private javax.swing.JTextField TFNom;
    private javax.swing.JTextField TFTelf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
