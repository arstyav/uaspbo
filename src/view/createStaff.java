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
import model.staff;
import controller.constructorStaff;


public class createStaff extends javax.swing.JFrame {
        private JTextField idStaffField;
        private JTextField namaField;
        private JTextField alamatField;
        private JTextField nomorTeleponField;
        private JTextField bidangPekerjaanField;


    public createStaff() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ex = new javax.swing.JButton();
        save = new javax.swing.JButton();
        name = new javax.swing.JFormattedTextField();
        address = new javax.swing.JFormattedTextField();
        phone = new javax.swing.JFormattedTextField();
        occupation = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ex.setContentAreaFilled(false);
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 343, 100, 30));

        save.setAutoscrolls(true);
        save.setContentAreaFilled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 80, 30));

        name.setBorder(null);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 220, -1));

        address.setBorder(null);
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 220, -1));

        phone.setBorder(null);
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 226, 210, 20));

        occupation.setBorder(null);
        occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationActionPerformed(evt);
            }
        });
        jPanel1.add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 264, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (33).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        constructorStaff st = new constructorStaff();
        st.nama = name.getText();
        st.alamat = address.getText();
        st.nomorTelepon = phone.getText();
        st.bidangPekerjaan = occupation.getText();
        
        if (st.create()) {
          JOptionPane.showMessageDialog(null, "Data Successfully Saved!");  
        } else {
            JOptionPane.showMessageDialog(null, "Data Failed"); 
        }
        
        name.setText("");
        address.setText("");
        phone.setText("");
        occupation.setText("");
    }//GEN-LAST:event_saveActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        menustaff ms = new menustaff();
        ms.setVisible(true);
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
//            java.util.logging.Logger.getLogger(createStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(createStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(createStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(createStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new createStaff().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField address;
    private javax.swing.JButton ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField name;
    private javax.swing.JFormattedTextField occupation;
    private javax.swing.JFormattedTextField phone;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
