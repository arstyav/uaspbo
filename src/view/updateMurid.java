/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.constructormurid;
import javax.swing.JOptionPane;

public class updateMurid extends javax.swing.JFrame {

    public updateMurid() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idMurid = new javax.swing.JFormattedTextField();
        address = new javax.swing.JFormattedTextField();
        svBtn = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        idKelas = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idMurid.setBorder(null);
        jPanel1.add(idMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 206, 220, 20));

        address.setBorder(null);
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 210, 20));

        svBtn.setContentAreaFilled(false);
        svBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svBtnActionPerformed(evt);
            }
        });
        jPanel1.add(svBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 343, 90, 30));

        ex.setContentAreaFilled(false);
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 100, 30));

        idKelas.setBorder(null);
        jPanel1.add(idKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 252, 220, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (32).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void svBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svBtnActionPerformed
    constructormurid cm = new constructormurid();
    String updateId = idMurid.getText();
    cm.find(updateId);
//    cm.fkIdKelas = idKelas.getText();
    cm.alamat = address.getText();
    if (cm.updateMurid()) {
        JOptionPane.showMessageDialog(null, "Data Successfully Updated!");  
        } else {
        JOptionPane.showMessageDialog(null, "Data Failed"); 
    }
    
    idMurid.setText("");
    address.setText("");
    idKelas.setText("");
    }//GEN-LAST:event_svBtnActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        menuMurid mm = new menuMurid();
        mm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exActionPerformed

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
//            java.util.logging.Logger.getLogger(updateMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(updateMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(updateMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(updateMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new updateMurid().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField address;
    private javax.swing.JButton ex;
    private javax.swing.JFormattedTextField idKelas;
    private javax.swing.JFormattedTextField idMurid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton svBtn;
    // End of variables declaration//GEN-END:variables
}
