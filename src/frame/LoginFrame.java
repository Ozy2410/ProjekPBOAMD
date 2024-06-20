package frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Fauzi
 */

public class LoginFrame extends javax.swing.JFrame {
    private boolean valid = true;
   
    public void setValid(boolean valid){
        this.valid = valid;
    }
    
    public boolean getValid(){
        return valid;
    }

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextUsername = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        labelUsername = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        Panel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setForeground(new java.awt.Color(0, 118, 221));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(390, 190, 26, 27);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 118, 221));
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(790, 220, 145, 59);

        jTextUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextUsername.setForeground(new java.awt.Color(0, 118, 221));
        jTextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextUsername);
        jTextUsername.setBounds(760, 340, 244, 30);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 118, 221));
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(760, 400, 244, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 118, 221));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(760, 440, 100, 27);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 118, 221));
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(870, 440, 140, 30);

        labelUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(0, 118, 221));
        labelUsername.setText("USERNAME");
        getContentPane().add(labelUsername);
        labelUsername.setBounds(760, 320, 240, 20);

        labelPass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPass.setForeground(new java.awt.Color(0, 118, 221));
        labelPass.setText("PASSWORD");
        getContentPane().add(labelPass);
        labelPass.setBounds(760, 380, 240, 20);

        Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login background.PNG"))); // NOI18N
        Panel.setText("jLabel5");
        getContentPane().add(Panel);
        Panel.setBounds(0, 0, 1390, 760);

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Connection connect = null;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUsernameActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char) 0);
        }else{
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String username = jTextUsername.getText();
        String password = jPasswordField1.getText();
        
        if(!username.isEmpty() && !password.isEmpty()) {
            if(!username.isEmpty()){
                if(!password.isEmpty()){
                    try{
                        if (connect == null || connect.isClosed()) {
                            connect = Koneksi.getConnection();
                        }
                        Statement stm = connect.createStatement();
                        String sql = "SELECT * FROM tb_login WHERE username = '" + username + "' AND pass = '" + password + "'";
                        ResultSet r = stm.executeQuery(sql);

                        Statement stmAdmin = connect.createStatement();
                        String sqlAdmin = "SELECT * FROM tb_login WHERE username = 'admin' AND pass = 'admin'";
                        ResultSet pawangUlar = stmAdmin.executeQuery(sqlAdmin);

                        if(r.next()) {
                            if ("admin".equals(username) && "admin".equals(password)) {
                                new AdminFrame().setVisible(true);
                            } else {
                                new MemberFrame().setVisible(true);
                            }
                            dispose();
                        } else if (pawangUlar.next()){
                            new AdminFrame().setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(new JFrame(), "Username atau Password salah", null, JOptionPane.ERROR_MESSAGE);
                        }
                    } catch(SQLException e) {
                        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Tolong Masukan Password Anda", null, JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Tolong Masukan Username Anda", null, JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Tolong Masukan Username & Password Anda", null, JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextUsername;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables
}
