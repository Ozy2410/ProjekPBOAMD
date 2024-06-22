package frame;

import javax.swing.JTextField;
import javax.swing.JComboBox; // Add this import statement

/**
 * Kelas ResetFormClass merupakan kelas untuk mereset formulir data member.
 * Kelas ini memiliki metode-metode untuk mengosongkan nilai-nilai pada komponen-komponen
 * yang digunakan dalam form, seperti JTextField dan JComboBox.
 */
public class ResetFormClass extends UpdateDeleteMember{
    private JTextField searchField;
    private JTextField fieldNama;
    private JTextField fieldNo_hp;
    private JTextField fieldEmail;
    private JComboBox fieldGender;
    private JComboBox fieldGymTime;
    private JTextField fieldUniqueID;
    private JTextField fieldAge;
    private JTextField fieldBayaran;
    
    /**
     * Konstruktor default untuk kelas ResetFormClass.
     */
    public ResetFormClass(){
        
    }
    
    /**
     * Metode untuk mengosongkan nilai pada semua komponen form.
     * Digunakan ketika ingin mereset form ke nilai-nilai default.
     */
    public void resetForm() {
        searchField.setText("");
        fieldNama.setText("");
        fieldNo_hp.setText("");
        fieldEmail.setText("");
        fieldGender.setSelectedItem("Choose:");
        fieldGymTime.setSelectedItem("Select Package:");
        fieldUniqueID.setText("");
        fieldAge.setText("");
        fieldBayaran.setText("");
    }
    
    /**
     * Metode untuk mengosongkan nilai pada komponen form yang diberikan sebagai parameter.
     * Metode juga menerapkan Overload.
     * 
     * @param searchField   JTextField untuk kolom pencarian.
     * @param fieldNama     JTextField untuk kolom nama.
     * @param fieldNo_hp    JTextField untuk kolom nomor hp.
     * @param fieldEmail    JTextField untuk kolom email.
     * @param fieldGender   JComboBox untuk pilihan jenis kelamin.
     * @param fieldGymTime  JComboBox untuk pilihan waktu gym.
     * @param fieldUniqueID JTextField untuk kolom ID unik.
     * @param fieldAge      JTextField untuk kolom umur.
     * @param fieldBayaran  JTextField untuk kolom bayaran.
     */
    public void resetForm(JTextField searchField, JTextField fieldNama, JTextField fieldNo_hp, JTextField fieldEmail, JComboBox fieldGender, JComboBox fieldGymTime, JTextField fieldUniqueID, JTextField fieldAge, JTextField fieldBayaran) {
        searchField.setText("");
        fieldNama.setText("");
        fieldNo_hp.setText("");
        fieldEmail.setText("");
        fieldGender.setSelectedItem("Choose:");
        fieldGymTime.setSelectedItem("Select Package:");
        fieldUniqueID.setText("");
        fieldAge.setText("");
        fieldBayaran.setText("");
    }
    
}

/**
 * Kelas ResetFormClass2 merupakan subclass dari kelas NewMember.
 * Kelas ini mengimplementasikan beberapa atribut tambahan dan sebuah metode main
 * untuk menunjukkan contoh penggunaan pewarisan (inheritance) dan downcasting.
 */
class ResetFormClass2 extends NewMember{
    private int unique_id;// Atribut ID unik
    private String ID_FILE_PATH;// Path file ID
    
    /**
     * Konstruktor default untuk kelas ResetFormClass2.
     */
    public ResetFormClass2(){
        
    }
    
    /**
     * Konstruktor untuk inisialisasi atribut unique_id dan ID_FILE_PATH.
     *
     * @param unique_id     ID unik member.
     * @param ID_FILE_PATH  Path file ID.
     */
    public ResetFormClass2(int unique_id, String ID_FILE_PATH){
        super(unique_id , ID_FILE_PATH);
    }
    
    /**
     * Metode main untuk menjalankan contoh penggunaan downcasting.
     *
     * @param args  Argumen baris perintah yang diteruskan ke aplikasi.
     */
    public static void main(String args[]){
        ResetFormClass2 a = new ResetFormClass2();// Membuat objek ResetFormClass2
        NewMember b = new ResetFormClass2();// Menggunakan polymorphism untuk objek NewMember
        
        if(b instanceof ResetFormClass2){
            System.out.print("Downcast Berhasil!");
        } else {
            System.out.print("Downcast Gagal!");
        }
    }
}