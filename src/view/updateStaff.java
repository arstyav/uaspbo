/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.constructorStaff;
import javax.swing.JOptionPane;
import controller.constructorStaff;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import database.database;
import model.staff;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import controller.constructorStaff;
import model.staff;

public class updateStaff extends javax.swing.JFrame {

    public updateStaff() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idStaff = new javax.swing.JFormattedTextField();
        occupationStaff = new javax.swing.JFormattedTextField();
        svBtn = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idStaff.setBorder(null);
        idStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idStaffActionPerformed(evt);
            }
        });
        jPanel1.add(idStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 152, 210, 20));

        occupationStaff.setBorder(null);
        occupationStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationStaffActionPerformed(evt);
            }
        });
        jPanel1.add(occupationStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 210, -1));

        svBtn.setContentAreaFilled(false);
        svBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svBtnActionPerformed(evt);
            }
        });
        jPanel1.add(svBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 100, 30));

        ex.setContentAreaFilled(false);
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 90, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (26).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idStaffActionPerformed

    private void occupationStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationStaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationStaffActionPerformed

    private void svBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svBtnActionPerformed
    constructorStaff st = new constructorStaff();
    String updateId = idStaff.getText();
    st.find(updateId);
    st.bidangPekerjaan = occupationStaff.getText();
    if (st.updateStaff()) {
        JOptionPane.showMessageDialog(null, "Data Successfully Updated!");  
        } else {
        JOptionPane.showMessageDialog(null, "Data Failed"); 
    }
    
    idStaff.setText("");
    occupationStaff.setText("");
    }//GEN-LAST:event_svBtnActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        menustaff mns = new menustaff();
        mns.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(updateStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(updateStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(updateStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(updateStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new updateStaff().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ex;
    private javax.swing.JFormattedTextField idStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField occupationStaff;
    private javax.swing.JButton svBtn;
    // End of variables declaration//GEN-END:variables
}
