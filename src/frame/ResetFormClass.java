package frame;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox; // Add this import statement

public class ResetFormClass extends UpdateDeleteMember {
    
    public ResetFormClass(){
        
    }
    
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
