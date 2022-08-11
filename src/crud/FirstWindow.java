package crud;

import java.awt.Cursor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano Aldax
 */
public class FirstWindow extends javax.swing.JFrame {

    FunctionsClass functionsClass = new FunctionsClass();

    public FirstWindow() {
        initComponents();
        functionsClass.readSQL();           //Extract data to connect to the SQL server
        DefaultTableModel data = (DefaultTableModel) jTableClients.getModel();
        functionsClass.showClients(data);    //View data on JTable
        this.setLocationRelativeTo(null);      //Center the window
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClients = new javax.swing.JTable();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableClients.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTableClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Telefono"
            }
        ));
        jTableClients.setRowHeight(19);
        jTableClients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClients);
        if (jTableClients.getColumnModel().getColumnCount() > 0) {
            jTableClients.getColumnModel().getColumn(0).setMinWidth(1);
            jTableClients.getColumnModel().getColumn(0).setPreferredWidth(1);
            jTableClients.getColumnModel().getColumn(0).setMaxWidth(70);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 500, 212));

        jTextFieldPhone.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextFieldPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextFieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 150, 30));

        jTextFieldName.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jTextFieldName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 30));

        jButtonSave.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSave.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jButtonSave.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personalization/guardar.png"))); // NOI18N
        jButtonSave.setText("GUARDAR");
        jButtonSave.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButtonSave.setFocusPainted(false);
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 130, 50));

        jButtonDelete.setBackground(new java.awt.Color(255, 102, 102));
        jButtonDelete.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personalization/cancel.png"))); // NOI18N
        jButtonDelete.setText("ELIMINAR");
        jButtonDelete.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 210, 50));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel1.setText("CLIENTES:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        jLabel4.setText("TELÉFONO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria Math", 0, 24)); // NOI18N
        jLabel5.setText("CRUD");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/personalization/FondoPanel.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        setCursor(new Cursor(Cursor.WAIT_CURSOR) {
        });
        DefaultTableModel datos = (DefaultTableModel) jTableClients.getModel();
        String name = jTextFieldName.getText();
        String phone = jTextFieldPhone.getText();

        functionsClass.save(name, phone, datos);  //Function for save data in database SQL

        jTextFieldName.setText("");  //Clean 
        jTextFieldPhone.setText("");

        setCursor(new Cursor(Cursor.DEFAULT_CURSOR) {
        });
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTableClientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientsMouseClicked

    }//GEN-LAST:event_jTableClientsMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        setCursor(new Cursor(Cursor.WAIT_CURSOR) {
        });
        int rsel = 0;
        rsel = jTableClients.getSelectedRow();
        if (rsel >= 1) {
            String idclient = jTableClients.getValueAt(rsel, 0).toString();
            DefaultTableModel data = (DefaultTableModel) jTableClients.getModel();

            functionsClass.deleteData(rsel, data, idclient);
        } else {

            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente para eliminarlo", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        setCursor(new Cursor(Cursor.DEFAULT_CURSOR) {
        });
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FirstWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClients;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
