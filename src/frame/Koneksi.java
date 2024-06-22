/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

/**
 * Kelas ini bertanggung jawab untuk mengelola koneksi ke database MySQL.
 * Singleton pattern digunakan di sini untuk memastikan hanya ada satu
 * koneksi aktif yang digunakan dalam aplikasi.
 * 
 * Koneksi ini menggunakan JDBC untuk terhubung ke database 'db_user_gym'
 * di localhost pada port 3306, dengan username 'root' dan tanpa password.
 * 
 * Koneksi ini hanya akan dibuat sekali dan kemudian digunakan kembali
 * selama aplikasi berjalan, jika koneksi masih terbuka.
 * 
 * Jika terjadi kesalahan saat koneksi ke database, sebuah RuntimeException
 * akan dibangkitkan dengan pesan kesalahan yang sesuai.
 * 
 * @author Fauzi
 */

import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static java.sql.Connection connection;
    
    /**
     * Metode untuk mendapatkan objek Connection yang menghubungkan ke database.
     * Jika koneksi belum ada, koneksi baru akan dibuat menggunakan URL, username,
     * dan password yang telah ditentukan.
     * 
     * @return Objek Connection yang menghubungkan ke database 'db_user_gym'.
     * @throws RuntimeException Jika tidak dapat membuat koneksi atau terjadi kesalahan lainnya.
     */
    public static java.sql.Connection getConnection(){
        if (connection == null){
            try{
                String url = "jdbc:mysql://localhost:3306/db_user_gym";
                String user = "root";
                String pass = "";
                connection = DriverManager.getConnection(url, user, pass);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                System.out.println("couldn't connect!");
                throw new RuntimeException(ex);
            }
        }
        return connection;
    }
}