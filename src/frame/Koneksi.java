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
            Class.forName("com.mysql.cj.jdbc.Driver");
            String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/data_ojol_yarsi?"+unicode, "root", "");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("couldn't connect!");
            throw new RuntimeException(ex);
    }
        }
        return connection;
    }
}
