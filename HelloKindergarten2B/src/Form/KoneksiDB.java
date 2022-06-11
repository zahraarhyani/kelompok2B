package Form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class KoneksiDB {
    static Connection koneksi;
    public static Connection getcoConnection(){
        try {
          
            koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_datahellokindergarten", "root", "");
         
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Koneksi Gagal");
        }
        return koneksi;
    } 
}