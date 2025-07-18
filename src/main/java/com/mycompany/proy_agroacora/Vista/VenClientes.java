package com.mycompany.proy_agroacora.Vista;
import javax.swing.JFrame;
import javax.swing.JButton; 
import javax.swing.JTable;

public class VenClientes extends javax.swing.JFrame {

    public VenClientes() {
        initComponents();
        setTitle("Gestión de Clientes");
        setSize(650, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //Diseño de la tabla
        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"ID", "Nombre", "DNI", "Dirección", "Teléfono", "Correo"}
        ) {
            @Override
            //Función para hacerlo no editable
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        // Ajustar tamaño de columnas
        TableClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TableClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
        TableClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
        TableClientes.getColumnModel().getColumn(2).setPreferredWidth(80);
        TableClientes.getColumnModel().getColumn(3).setPreferredWidth(200);
        TableClientes.getColumnModel().getColumn(4).setPreferredWidth(80);
        TableClientes.getColumnModel().getColumn(5).setPreferredWidth(200);
    }
    // Getters para que el controlador pueda acceder a los componentes

    public JTable getTableClientes() {
        return TableClientes;
    }

    public JButton getBotActualizar() {
        return BotActualizar;
    }

    public JButton getBotAgregar() {
        return BotAgregar;
    }

    public JButton getBotEditar() {
        return BotEditar;
    }

    public JButton getBotEliminar() {
        return BotEliminar;
    }

    public JButton getBotFiltrar() {
        return BotFiltrar;
    }

    public javax.swing.JTextField getTFFiltrar() {
        return TFFiltrar;
    }

    public javax.swing.JComboBox<String> getCBoxFiltro() {
        return CBoxFiltro;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CBoxFiltro = new javax.swing.JComboBox<>();
        TFFiltrar = new javax.swing.JTextField();
        BotFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableClientes = new javax.swing.JTable();
        BotActualizar = new javax.swing.JButton();
        BotAgregar = new javax.swing.JButton();
        BotEditar = new javax.swing.JButton();
        BotEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(194, 213, 141));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTA DE CLIENTES");

        CBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUC/DNI", "Nombre", "Telefono" }));

        TFFiltrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        BotFiltrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotFiltrar.setText("Filtrar");

        TableClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableClientes);

        BotActualizar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotActualizar.setText("Actualizar");

        BotAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotAgregar.setText("Agregar");

        BotEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotEditar.setText("Editar");

        BotEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BotEliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(202, 202, 202))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(CBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TFFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BotFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BotEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(BotEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TFFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotActualizar;
    private javax.swing.JButton BotAgregar;
    private javax.swing.JButton BotEditar;
    private javax.swing.JButton BotEliminar;
    private javax.swing.JButton BotFiltrar;
    private javax.swing.JComboBox<String> CBoxFiltro;
    private javax.swing.JTextField TFFiltrar;
    private javax.swing.JTable TableClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
