/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.constructormurid;
import javax.swing.JOptionPane;


public class createMurid extends javax.swing.JFrame {

    public createMurid() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameMurid = new javax.swing.JFormattedTextField();
        DOBMurid = new javax.swing.JFormattedTextField();
        alamatMurid = new javax.swing.JFormattedTextField();
        parentsMurid = new javax.swing.JFormattedTextField();
        svBtn = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        phoneMurid = new javax.swing.JFormattedTextField();
        adminStaff = new javax.swing.JFormattedTextField();
        idClass = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameMurid.setBorder(null);
        nameMurid.setToolTipText("jika offline masukan lokasi");
        jPanel1.add(nameMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 200, -1));

        DOBMurid.setBorder(null);
        jPanel1.add(DOBMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 136, 190, 20));

        alamatMurid.setBorder(null);
        alamatMurid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatMuridActionPerformed(evt);
            }
        });
        jPanel1.add(alamatMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 190, 20));

        parentsMurid.setBorder(null);
        parentsMurid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentsMuridActionPerformed(evt);
            }
        });
        jPanel1.add(parentsMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 200, -1));

        svBtn.setContentAreaFilled(false);
        svBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svBtnActionPerformed(evt);
            }
        });
        jPanel1.add(svBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 100, 30));

        ex.setContentAreaFilled(false);
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 100, 20));

        phoneMurid.setBorder(null);
        phoneMurid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneMuridActionPerformed(evt);
            }
        });
        jPanel1.add(phoneMurid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 190, -1));

        adminStaff.setBorder(null);
        jPanel1.add(adminStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 282, 190, 20));

        idClass.setBorder(null);
        idClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idClassActionPerformed(evt);
            }
        });
        jPanel1.add(idClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (29).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void svBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svBtnActionPerformed
        constructormurid cm = new constructormurid();
        cm.nama = nameMurid.getText();
        cm.tanggalLahir = DOBMurid.getText();
        cm.alamat = alamatMurid.getText();
        cm.namaOrangTua = parentsMurid.getText();
        cm.nomorOrangTua = phoneMurid.getText();
        cm.fkUsername = adminStaff.getText();
        cm.fkIdKelas = idClass.getText();

        if (cm.create()) {
            JOptionPane.showMessageDialog(null, "Data Successfully Saved!");  
        } else {
            JOptionPane.showMessageDialog(null, "Data Failed"); 
        }        

        nameMurid.setText("");
        DOBMurid.setText("");
        alamatMurid.setText("");
        parentsMurid.setText("");
        phoneMurid.setText("");
        adminStaff.setText("");
        idClass.setText("");
    }//GEN-LAST:event_svBtnActionPerformed

    private void alamatMuridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatMuridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatMuridActionPerformed

    private void phoneMuridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneMuridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneMuridActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        menuMurid mn = new menuMurid();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exActionPerformed

    private void idClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idClassActionPerformed

    private void parentsMuridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentsMuridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_parentsMuridActionPerformed

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
//            java.util.logging.Logger.getLogger(createMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(createMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(createMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(createMurid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new createMurid().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DOBMurid;
    private javax.swing.JFormattedTextField adminStaff;
    private javax.swing.JFormattedTextField alamatMurid;
    private javax.swing.JButton ex;
    private javax.swing.JFormattedTextField idClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField nameMurid;
    private javax.swing.JFormattedTextField parentsMurid;
    private javax.swing.JFormattedTextField phoneMurid;
    private javax.swing.JButton svBtn;
    // End of variables declaration//GEN-END:variables
}
