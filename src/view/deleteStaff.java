/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.constructorStaff;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import database.database;

public class deleteStaff extends javax.swing.JFrame {

    static void setText(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        private JTextField idStaffField;
        private JTextField namaField;
        private JTextField alamatField;
        private JTextField nomorTeleponField;
        private JTextField bidangPekerjaanField;
        public deleteStaff() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        deleteStaff = new javax.swing.JFormattedTextField();
        svBtn = new javax.swing.JButton();
        exBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteStaff.setBorder(null);
        deleteStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStaffActionPerformed(evt);
            }
        });
        jPanel1.add(deleteStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 218, 220, 20));

        svBtn.setContentAreaFilled(false);
        svBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svBtnActionPerformed(evt);
            }
        });
        jPanel1.add(svBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 90, 40));

        exBtn.setContentAreaFilled(false);
        exBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 90, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (15).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exBtnActionPerformed
        menustaff mns = new menustaff();
        mns.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exBtnActionPerformed

    private void deleteStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStaffActionPerformed

    }//GEN-LAST:event_deleteStaffActionPerformed

    private void svBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svBtnActionPerformed
        constructorStaff st = new constructorStaff();
        String deleteId = deleteStaff.getText();
        st.find(deleteId);
        if (st.delete()) {
          JOptionPane.showMessageDialog(null, "Data Successfully Delete!");  
          deleteStaff.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "Data Failed"); 
        }
    }//GEN-LAST:event_svBtnActionPerformed

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
//            java.util.logging.Logger.getLogger(deleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(deleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(deleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(deleteStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new deleteStaff().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField deleteStaff;
    private javax.swing.JButton exBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton svBtn;
    // End of variables declaration//GEN-END:variables
}
