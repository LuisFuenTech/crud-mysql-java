/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author gilberto cuadro
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigo_tf = new javax.swing.JTextField();
        nombre_tf = new javax.swing.JTextField();
        precio_tf = new javax.swing.JTextField();
        cantidad_tf = new javax.swing.JTextField();
        guardar_bt = new javax.swing.JButton();
        modificar_bt = new javax.swing.JButton();
        eliminar_bt = new javax.swing.JButton();
        limpiar_bt = new javax.swing.JButton();
        buscar_bt = new javax.swing.JButton();
        id_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("ABeeZee", 0, 13)); // NOI18N
        jLabel1.setText("Codigo:");

        jLabel2.setFont(new java.awt.Font("ABeeZee", 0, 13)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("ABeeZee", 0, 13)); // NOI18N
        jLabel3.setText("Precio:");

        jLabel4.setFont(new java.awt.Font("ABeeZee", 0, 13)); // NOI18N
        jLabel4.setText("Cantidad:");

        codigo_tf.setFont(new java.awt.Font("ABeeZee", 0, 13)); // NOI18N

        nombre_tf.setFont(new java.awt.Font("ABeeZee", 0, 13)); // NOI18N

        precio_tf.setFont(new java.awt.Font("ABeeZee", 0, 13)); // NOI18N

        cantidad_tf.setFont(new java.awt.Font("ABeeZee", 0, 13)); // NOI18N

        guardar_bt.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        guardar_bt.setText("Guardar");

        modificar_bt.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        modificar_bt.setText("Modificar");

        eliminar_bt.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        eliminar_bt.setText("Eliminar");

        limpiar_bt.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        limpiar_bt.setText("Limpiar");

        buscar_bt.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        buscar_bt.setText("Buscar");
        buscar_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btActionPerformed(evt);
            }
        });

        id_tf.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(precio_tf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre_tf)
                    .addComponent(codigo_tf)
                    .addComponent(cantidad_tf))
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(guardar_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificar_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar_bt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiar_bt)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(id_tf, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buscar_bt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_bt))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(precio_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cantidad_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar_bt)
                    .addComponent(modificar_bt)
                    .addComponent(eliminar_bt)
                    .addComponent(limpiar_bt))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btActionPerformed
      
    }//GEN-LAST:event_buscar_btActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buscar_bt;
    public javax.swing.JTextField cantidad_tf;
    public javax.swing.JTextField codigo_tf;
    public javax.swing.JButton eliminar_bt;
    public javax.swing.JButton guardar_bt;
    public javax.swing.JTextField id_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JButton limpiar_bt;
    public javax.swing.JButton modificar_bt;
    public javax.swing.JTextField nombre_tf;
    public javax.swing.JTextField precio_tf;
    // End of variables declaration//GEN-END:variables
}
