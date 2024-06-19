package frame;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author depou
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        Update_Delete_Member = new javax.swing.JButton();
        Payment = new javax.swing.JLabel();
        NewMember = new javax.swing.JLabel();
        jLabelWellcome = new javax.swing.JLabel();
        ListOfMember = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 118, 221));

        Update_Delete_Member.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Update_Delete_Member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update & delete member.png"))); // NOI18N
        Update_Delete_Member.setText("Update&Delete Member");
        Update_Delete_Member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Delete_MemberActionPerformed(evt);
            }
        });

        Payment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/payment.png"))); // NOI18N
        Payment.setText("Payment");
        Payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PaymentMousePressed(evt);
            }
        });

        NewMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NewMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new member.png"))); // NOI18N
        NewMember.setText("New Member");
        NewMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NewMemberMousePressed(evt);
            }
        });

        jLabelWellcome.setFont(new java.awt.Font("Bahnschrift", 1, 90)); // NOI18N
        jLabelWellcome.setText("WELCOME");

        ListOfMember.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ListOfMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/list of members.png"))); // NOI18N
        ListOfMember.setText("List Of Member");
        ListOfMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListOfMemberMousePressed(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        Logout.setText("Logout");

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        Exit.setText("Exit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NewMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Update_Delete_Member)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListOfMember)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Payment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addComponent(jLabelWellcome)
                .addGap(452, 452, 452))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Update_Delete_Member, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NewMember, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ListOfMember, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Payment, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(273, 273, 273)
                .addComponent(jLabelWellcome)
                .addGap(0, 331, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1382, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private Connection connect = null;
    private JDialog jDialog = new JDialog();
    
    public void setCon(Connection connect){
        this.connect = connect;
    }
    
    public void setDialog(JDialog jDialog){
        this.jDialog = jDialog;
    }
    
    public Connection getCon(){
        return connect;
    }
    
    public JDialog getjDialog(){
        return jDialog;
    }
    
    private void Update_Delete_MemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Delete_MemberActionPerformed
        // TODO add your handling code here:
        new UpdateDeleteMember().setVisible(true);
    }//GEN-LAST:event_Update_Delete_MemberActionPerformed

    private void NewMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewMemberMousePressed
        // TODO add your handling code here:
        new NewMember().setVisible(true);
    }//GEN-LAST:event_NewMemberMousePressed

    private void ListOfMemberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListOfMemberMousePressed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "Nama", "Nomor Handphone", "Email", "Gender", "GYM Time", "ID Member", "Umur", "Bayaran"}, 0);
        JTable table = new JTable(model);
        
        JPanel panel = new JPanel();
        JScrollPane sp = new JScrollPane(table);
        
        panel.add(sp);
        jDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jDialog.setContentPane(panel);
        jDialog.pack();
        jDialog.setVisible(true);
        
        try{
            if(connect == null || connect.isClosed()) {
                connect = Koneksi.getConnection();
            }
            Statement stm = connect.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tb_member");
            
            while (rs.next()) {
                int no = rs.getInt("id");
                String nama = rs.getString("nama");
                String noHP = rs.getString("no_hp");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                String gymTime = rs.getString("gym_time");
                String member_id = rs.getString("id_member");
                String age = rs.getString("age");
                String bayar = rs.getString("bayaran");
                model.addRow(new Object[]{no, nama, noHP, email, gender, gymTime, member_id, age, bayar});
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_ListOfMemberMousePressed

    private void PaymentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentMousePressed
        // TODO add your handling code here:
        new Payment().setVisible(true);
    }//GEN-LAST:event_PaymentMousePressed

    private void membershipButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel ListOfMember;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel NewMember;
    private javax.swing.JLabel Payment;
    private javax.swing.JButton Update_Delete_Member;
    private javax.swing.JLabel jLabelWellcome;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
