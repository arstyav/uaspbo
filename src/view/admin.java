/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package view;

import java.sql.*;
import javax.swing.JOptionPane;
import database.database;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import controller.constructormurid;

public class admin extends javax.swing.JFrame {
    private final database db;
   
    public admin() {
        initComponents();   
        db = new database(); 
        db.openConnection();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit2 = new javax.swing.JLabel();
        passwordLogin = new javax.swing.JPasswordField();
        usernameLogin = new javax.swing.JFormattedTextField();
        adminbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit bottom.png"))); // NOI18N
        exit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit2MouseClicked(evt);
            }
        });
        jPanel1.add(exit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, 30));

        passwordLogin.setBorder(null);
        jPanel1.add(passwordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 230, 30));

        usernameLogin.setBorder(null);
        usernameLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameLoginFocusGained(evt);
            }
        });
        jPanel1.add(usernameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 192, 200, 30));

        adminbutton.setContentAreaFilled(false);
        adminbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(adminbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staff (6).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameLoginFocusGained

    }//GEN-LAST:event_usernameLoginFocusGained

    private void exit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit2MouseClicked
        dispose();
    }//GEN-LAST:event_exit2MouseClicked

    private void adminbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbuttonActionPerformed

        String username = usernameLogin.getText();
        String password = new String(passwordLogin.getPassword()); 

        String sql = "SELECT * FROM admin WHERE username=? AND password=?";
        Connection conn = db.connection; 

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                constructormurid st = new constructormurid();
                st.fkUsername = usernameLogin.getText();
                JOptionPane.showMessageDialog(null, "Welcome " + username);
            menu1 mn1 = new menu1();
            mn1.setVisible(true);
            this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Login failed");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error while closing the connection: " + e.getMessage());
                }
            }
        }

    }//GEN-LAST:event_adminbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbutton;
    private javax.swing.JLabel exit2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordLogin;
    private javax.swing.JFormattedTextField usernameLogin;
    // End of variables declaration//GEN-END:variables
}
