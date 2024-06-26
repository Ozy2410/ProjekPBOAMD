/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Kelas ini mengimplementasikan fungsi untuk mengupdate dan menghapus data member gym.
 * Dapat mencari data member berdasarkan ID, mengupdate data, menghapus data, serta melakukan reset form.
 * Kelas ini merupakan turunan dari JFrame dan mengimplementasikan interface Reset.
 * 
 * Fitur utama:
 * - Cari data member berdasarkan ID
 * - Update data member
 * - Hapus data member
 * - Reset form input
 * 
 * Kelas ini menggunakan database MySQL untuk menyimpan data member.
 * 
 * Komponen GUI yang digunakan:
 * - JTextField untuk input teks (nama, nomor HP, email, ID member, dan jumlah bayaran)
 * - JComboBox untuk pilihan (jenis kelamin dan waktu gym)
 * - JDateChooser untuk memilih tanggal lahir
 * - JButton untuk melakukan aksi (cari, update, hapus, reset)
 * 
 * Cara penggunaan:
 * - Isi ID member pada field Member ID, lalu tekan tombol Search untuk mencari data member.
 * - Data member akan ditampilkan di input fields yang sesuai.
 * - Update data member dengan mengubah nilai di input fields, lalu tekan tombol Update.
 * - Hapus data member dengan menekan tombol Delete setelah konfirmasi.
 * - Reset form dengan menekan tombol Reset.
 * 
 * Aplikasi ini menggunakan JDBC untuk menghubungkan ke database MySQL. Pastikan database sudah tersedia dan konfigurasi koneksi sudah benar.
 * 
 * Proyek ini dibuat untuk memenuhi kebutuhan manajemen data member gym secara efektif dan efisien.
 * 
 * Referensi: OpenJDK Documentation, Stack Overflow, Oracle Java Tutorials
 * 
 * @author rifar
 * 
 */
public class UpdateDeleteMember extends javax.swing.JFrame implements Reset {

    /**
     * Method ini akan mereset semua input field pada form UpdateDeleteMember.
     * Menggunakan instance dari ResetFormClass untuk melakukan reset.
     */
    @Override
    public void resetForm() {
        ResetFormClass resetFormInstance = new ResetFormClass();
        resetFormInstance.resetForm(searchField, fieldNama, fieldNo_hp, fieldEmail, fieldGender, fieldGymTime, fieldUniqueID, null, fieldBayaran);
    }
    
    /**
     * Konstruktor untuk membuat objek UpdateDeleteMember.
     * Inisialisasi komponen GUI yang ada di dalam frame.
     */
    public UpdateDeleteMember() {
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldNo_hp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldUniqueID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fieldBayaran = new javax.swing.JTextField();
        fieldGender = new javax.swing.JComboBox<>();
        fieldGymTime = new javax.swing.JComboBox<>();
        jDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(175, 100));
        setResizable(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 118, 221));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update & delete member.png"))); // NOI18N
        jLabel1.setText("UPDATE & DELETE MEMBER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 118, 221));
        jLabel2.setText("Member ID:");

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 118, 221));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 118, 221));
        jLabel3.setText("Name:");

        fieldNama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fieldNama.setForeground(new java.awt.Color(0, 118, 221));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 118, 221));
        jLabel4.setText("Mobile Number:");

        fieldNo_hp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fieldNo_hp.setForeground(new java.awt.Color(0, 118, 221));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 118, 221));
        jLabel5.setText("Email:");

        fieldEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fieldEmail.setForeground(new java.awt.Color(0, 118, 221));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 118, 221));
        jLabel6.setText("Gender:");

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 118, 221));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 118, 221));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 118, 221));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 118, 221));
        jLabel7.setText("Gym Time:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 118, 221));
        jLabel8.setText("Unique ID:");

        fieldUniqueID.setEditable(false);
        fieldUniqueID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fieldUniqueID.setForeground(new java.awt.Color(0, 118, 221));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 118, 221));
        jLabel9.setText("Birth Date:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 118, 221));
        jLabel10.setText("Amount to pay/month:");

        fieldBayaran.setEditable(false);
        fieldBayaran.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fieldBayaran.setForeground(new java.awt.Color(0, 118, 221));

        fieldGender.setBackground(new java.awt.Color(204, 204, 204));
        fieldGender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fieldGender.setForeground(new java.awt.Color(0, 118, 221));
        fieldGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose:", "Male", "Female" }));

        fieldGymTime.setBackground(new java.awt.Color(204, 204, 204));
        fieldGymTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fieldGymTime.setForeground(new java.awt.Color(0, 118, 221));
        fieldGymTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Package:", "1 Month", "3 Month", "12 Month" }));
        fieldGymTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldGymTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addComponent(fieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                            .addComponent(fieldNo_hp)
                            .addComponent(fieldEmail)
                            .addComponent(fieldGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(fieldUniqueID, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addComponent(fieldBayaran)
                                .addComponent(fieldGymTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldGymTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldNo_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldBayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnReset)))
                    .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
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

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Connection connect = null;
        
    /**
     * Method untuk melakukan pencarian data member berdasarkan ID member.
     * Jika ditemukan, data member akan ditampilkan di input fields yang sesuai.
     * Jika tidak ditemukan, akan ditampilkan pesan kesalahan.
     * @param evt Event action yang terjadi (dalam hal ini, klik tombol Search)
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String memberID = searchField.getText().trim();
        
        if (memberID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tolong isi ID Member terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            if (connect == null || connect.isClosed()) {
                connect = Koneksi.getConnection();
            }

            Statement stm = connect.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM tb_member WHERE id_member = '" + memberID + "'");
            
            if(rs.next()){                
                String nama = rs.getString("nama");
                String noHP = rs.getString("no_hp");
                String email = rs.getString("email");
                String gender = rs.getString("gender");
                String gymTime = rs.getString("gym_time");
                String member_id = rs.getString("id_member");
                String tgl_lahir_str = rs.getString("tgl_lahir");
                String bayar = rs.getString("bayaran");
                
                fieldNama.setText(nama);
                fieldNo_hp.setText(noHP);
                fieldEmail.setText(email);
                fieldGender.setSelectedItem(gender);
                fieldGymTime.setSelectedItem(gymTime);
                fieldUniqueID.setText(member_id);
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
                Date tgl_lahir = dateFormat.parse(tgl_lahir_str);
                jDate.setDate(tgl_lahir);
                
                fieldBayaran.setText(bayar);
            } else {
                JOptionPane.showMessageDialog(this, "Member Tidak Dapat Ditemukan!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Error parsing date from database: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * Method untuk melakukan update data member berdasarkan ID member yang dicari.
     * Data yang telah diubah pada input fields akan disimpan ke dalam database.
     * Akan ditampilkan pesan keberhasilan jika update sukses.
     * @param evt Event action yang terjadi (dalam hal ini, klik tombol Update)
     */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String memberID = searchField.getText().trim();
        if (memberID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tolong isi ID Member terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try{
            if (connect == null || connect.isClosed()) {
                connect = Koneksi.getConnection();
            }
            String sql = "UPDATE tb_member SET nama = ?, no_hp = ?, email = ?, gender = ?, gym_time = ?, tgl_lahir = ?, bayaran = ? WHERE id_member = '"  + memberID + "'";
            try(PreparedStatement p = connect.prepareStatement(sql)){
                p.setString(1, fieldNama.getText());
                p.setString(2, fieldNo_hp.getText());
                p.setString(3, fieldEmail.getText());
                p.setString(4, fieldGender.getSelectedItem().toString());
                p.setString(5, fieldGymTime.getSelectedItem().toString());
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
                String tanggal_lahir = dateFormat.format(jDate.getDate());

                p.setString(6, tanggal_lahir);
                p.setString(7, fieldBayaran.getText());
                int berhasilUpdate = p.executeUpdate();
                if(berhasilUpdate > 0){
                    JOptionPane.showMessageDialog(this, "Member Berhasil Diperbarui!");
                    resetForm();
                }
            } 
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * Method untuk menghapus data member berdasarkan ID member yang dicari.
     * Akan muncul dialog konfirmasi sebelum data dihapus.
     * Akan ditampilkan pesan keberhasilan jika hapus sukses.
     * @param evt Event action yang terjadi (dalam hal ini, klik tombol Delete)
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String memberID = searchField.getText().trim();
        if (memberID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tolong isi Member ID terlebih dahulu.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int opsi = JOptionPane.showConfirmDialog(this, "Apakah kamu yakin ingin menghapus member ini?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if(opsi == JOptionPane.YES_OPTION){
            try{
                if (connect == null || connect.isClosed()) {
                connect = Koneksi.getConnection();
                }
                
                String sql = "DELETE FROM tb_member WHERE id_member = ?";
                try(PreparedStatement p = connect.prepareStatement(sql)) {
                    p.setString(1, memberID);
                    int berhasilHapus = p.executeUpdate();
                    
                    if(berhasilHapus > 0){
                        JOptionPane.showMessageDialog(this, "Member Sukses Dihapus!");
                        resetForm();
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to delete member. Member ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    } 
                } 
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * Method untuk mereset form input menjadi kosong.
     * Memanggil method resetForm() untuk melakukan reset.
     * @param evt Event action yang terjadi (dalam hal ini, klik tombol Reset)
     */
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * Method untuk menyesuaikan jumlah bayaran berdasarkan paket gym yang dipilih.
     * Akan mengisi otomatis field bayaran berdasarkan paket yang dipilih.
     * @param evt Event action yang terjadi (dalam hal ini, memilih item dari combo box Gym Time)
     */
    private void fieldGymTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldGymTimeActionPerformed
        // TODO add your handling code here:
        String selectedPack = (String) fieldGymTime.getSelectedItem();
        
        if(selectedPack != null){
            switch(selectedPack){
                case "1 Month":
                    fieldBayaran.setText("Rp. 100.000");
                    break;
                case "3 Month":
                    fieldBayaran.setText("Rp. 250.000");
                    break;
                case "12 Month":
                    fieldBayaran.setText("Rp. 750.000");
                    break;
                default:
                    fieldBayaran.setText("");
                    break;
            }
        }
    }//GEN-LAST:event_fieldGymTimeActionPerformed
    
    /**
     * Method utama untuk menjalankan aplikasi UpdateDeleteMember.
     * Mengatur tampilan frame, dan memulai event handling.
     * @param args Argumen dari command line
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
            java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDeleteMember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteMember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField fieldBayaran;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JComboBox<String> fieldGender;
    private javax.swing.JComboBox<String> fieldGymTime;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNo_hp;
    private javax.swing.JTextField fieldUniqueID;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
