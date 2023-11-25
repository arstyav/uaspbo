/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

public class menuKelas extends javax.swing.JFrame {

    public menuKelas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createClass = new javax.swing.JButton();
        deleteClass = new javax.swing.JButton();
        readClass = new javax.swing.JButton();
        updateClass = new javax.swing.JButton();
        ex = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createClass.setContentAreaFilled(false);
        createClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClassActionPerformed(evt);
            }
        });
        jPanel1.add(createClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 50));

        deleteClass.setContentAreaFilled(false);
        deleteClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClassActionPerformed(evt);
            }
        });
        jPanel1.add(deleteClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, 40));

        readClass.setContentAreaFilled(false);
        readClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readClassActionPerformed(evt);
            }
        });
        jPanel1.add(readClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 200, 40));

        updateClass.setContentAreaFilled(false);
        updateClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateClassActionPerformed(evt);
            }
        });
        jPanel1.add(updateClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 193, 210, 50));

        ex.setContentAreaFilled(false);
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel1.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 263, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (35).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClassActionPerformed
        createKelas ck = new createKelas();
        ck.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createClassActionPerformed

    private void deleteClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClassActionPerformed
        deleteKelas dk = new deleteKelas();
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_deleteClassActionPerformed

    private void updateClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateClassActionPerformed
        updateMenu um = new updateMenu();
        um.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updateClassActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        menu1 mn1 = new menu1();
        mn1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exActionPerformed

    private void readClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readClassActionPerformed
        showKelas sk = new showKelas();
        sk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_readClassActionPerformed

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
//            java.util.logging.Logger.getLogger(menuKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(menuKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(menuKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(menuKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new menuKelas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createClass;
    private javax.swing.JButton deleteClass;
    private javax.swing.JButton ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton readClass;
    private javax.swing.JButton updateClass;
    // End of variables declaration//GEN-END:variables
}
