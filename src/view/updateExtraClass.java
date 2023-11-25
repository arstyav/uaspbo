/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.constructorKelas;
import javax.swing.JOptionPane;

public class updateExtraClass extends javax.swing.JFrame {

    public updateExtraClass() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idKelas = new javax.swing.JFormattedTextField();
        selectedFeature = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        idOffline = new javax.swing.JFormattedTextField();
        idOnline = new javax.swing.JFormattedTextField();
        platform = new javax.swing.JComboBox<>();
        learning = new javax.swing.JComboBox<>();
        location = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idKelas.setBorder(null);
        idKelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        idKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idKelasActionPerformed(evt);
            }
        });
        jPanel1.add(idKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 210, -1));

        selectedFeature.setFont(new java.awt.Font("Segoe UI Variable", 0, 12)); // NOI18N
        selectedFeature.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Offline", "Online" }));
        jPanel1.add(selectedFeature, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 120, 20));

        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 100, 30));

        jButton2.setContentAreaFilled(false);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 110, 30));

        idOffline.setBorder(null);
        jPanel1.add(idOffline, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 200, -1));

        idOnline.setBorder(null);
        jPanel1.add(idOnline, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 142, 210, 20));

        platform.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zoom", "GMeet", " " }));
        jPanel1.add(platform, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 120, -1));

        learning.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baca", "Tulis ", "Hitung", " " }));
        jPanel1.add(learning, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 120, -1));

        location.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruang Gedung A", "Ruang Gedung B" }));
        jPanel1.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 120, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (44).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        constructorKelas ck = new constructorKelas();
        String pp1 = (String) selectedFeature.getSelectedItem();
        String pp2 = (String) platform.getSelectedItem();
        String pp3 = (String) learning.getSelectedItem();
        String pp4 = (String) location.getSelectedItem();
        ck.materiKhusus = pp3;
        ck.IdOnline = idOnline.getText();
        ck.IdOffline = idOffline.getText();
        ck.idKelas = idKelas.getText();
        String cc = idKelas.getText();
        ck.find(cc);
        if (ck.updateExtra(pp1,pp2, pp4)) {
            JOptionPane.showMessageDialog(null, "Data Successfully Updated!");  
        } else {
            JOptionPane.showMessageDialog(null, "Data Failed"); 
        }

        idKelas.setText("");
        idOnline.setText("");
        idOffline.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idKelasActionPerformed

    }//GEN-LAST:event_idKelasActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(updateExtraClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(updateExtraClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(updateExtraClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(updateExtraClass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new updateExtraClass().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField idKelas;
    private javax.swing.JFormattedTextField idOffline;
    private javax.swing.JFormattedTextField idOnline;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> learning;
    private javax.swing.JComboBox<String> location;
    private javax.swing.JComboBox<String> platform;
    private javax.swing.JComboBox<String> selectedFeature;
    // End of variables declaration//GEN-END:variables
}
