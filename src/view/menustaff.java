/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

public class menustaff extends javax.swing.JFrame {

    public menustaff() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        showStaff = new javax.swing.JButton();
        addStaff = new javax.swing.JButton();
        updateStaff = new javax.swing.JButton();
        deleteStaff = new javax.swing.JButton();
        exitStaff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showStaff.setContentAreaFilled(false);
        showStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStaffActionPerformed(evt);
            }
        });
        jPanel1.add(showStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 180, 50));

        addStaff.setContentAreaFilled(false);
        addStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffActionPerformed(evt);
            }
        });
        jPanel1.add(addStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 180, 50));

        updateStaff.setContentAreaFilled(false);
        updateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStaffActionPerformed(evt);
            }
        });
        jPanel1.add(updateStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 190, 40));

        deleteStaff.setContentAreaFilled(false);
        deleteStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStaffActionPerformed(evt);
            }
        });
        jPanel1.add(deleteStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 190, 40));

        exitStaff.setContentAreaFilled(false);
        exitStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitStaffActionPerformed(evt);
            }
        });
        jPanel1.add(exitStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (12).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffActionPerformed
        createStaff cr = new createStaff();
        cr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addStaffActionPerformed

    private void exitStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitStaffActionPerformed
        menu1 mn1 = new menu1();
        mn1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitStaffActionPerformed

    private void showStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStaffActionPerformed
    showStaff ss = new showStaff();
    ss.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_showStaffActionPerformed

    private void deleteStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStaffActionPerformed
    deleteStaff dls = new deleteStaff();
    dls.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_deleteStaffActionPerformed

    private void updateStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStaffActionPerformed
     updateStaff up = new updateStaff();
     up.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_updateStaffActionPerformed

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
//            java.util.logging.Logger.getLogger(menustaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(menustaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(menustaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(menustaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new menustaff().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStaff;
    private javax.swing.JButton deleteStaff;
    private javax.swing.JButton exitStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton showStaff;
    private javax.swing.JButton updateStaff;
    // End of variables declaration//GEN-END:variables
}
