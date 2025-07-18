package com.mycompany.proy_agroacora.Vista;

public class VenEditarCliente extends javax.swing.JDialog {

    public VenEditarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // ✅ Asegúrate de que no haya pack() si usarás setSize()
        setSize(600, 350); // Tamaño deseado
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(194, 213, 141));
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
        BotGuardar = new javax.swing.JButton();
        BotCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 350));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(194, 213, 141));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        TFNom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(TFNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, 25));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RUC/DNI:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        TFDni.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(TFDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 115, 25));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dirección:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        TFDirec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(TFDirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 247, 25));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        TFCorreo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(TFCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, 25));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teléfono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        TFTelf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(TFTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 91, 25));

        BotGuardar.setBackground(new java.awt.Color(135, 166, 75));
        BotGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotGuardar.setText("Guardar");
        BotGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(BotGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 115, 35));

        BotCancelar.setBackground(new java.awt.Color(135, 166, 75));
        BotCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotCancelar.setText("Cancelar");
        BotCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BotCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 115, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotCancelarActionPerformed

    private void BotGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotCancelar;
    private javax.swing.JButton BotGuardar;
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

    public javax.swing.JTextField getTFNom() {
        return TFNom;
    }

    public javax.swing.JTextField getTFDni() {
        return TFDni;
    }

    public javax.swing.JTextField getTFDirec() {
        return TFDirec;
    }

    public javax.swing.JTextField getTFTelf() {
        return TFTelf;
    }

    public javax.swing.JTextField getTFCorreo() {
        return TFCorreo;
    }

    public javax.swing.JButton getBtnGuardar() {
        return BotGuardar;
    }

    public javax.swing.JButton getBtnCancelar() {
        return BotCancelar;
    }

}
