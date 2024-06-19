/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

/**
 *
 * @author depou
 */

import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static java.sql.Connection connection;
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