
package dbcontact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Model {
//mengkoneksikan ke database
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbcontact";//nama database kita di slash terakhir
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;//untuk perintah query

    public Model() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    public void insertContact(String nama, String noHP, String umur, String email){
        try {
           String query = "INSERT INTO `contact`(`nama`, `noHP`, `umur`,`email`) VALUES ('"+nama+"','"+noHP+"','"+umur+"','"+email+"')";
           statement = koneksi.createStatement();
           statement.executeUpdate(query); //execute querynya
            System.out.println("Berhasil ditambahkan");
            JOptionPane.showMessageDialog(null, "Data Berhasil");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public String[][] readContact(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][4];
            
            String query = "Select * from`contact`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                data[jmlData][0] = resultSet.getString("nama"); //kolom nama harus sama besar kecilnya dgn database
                data[jmlData][1] = resultSet.getString("noHp");                
                data[jmlData][2] = resultSet.getString("umur");
                data[jmlData][3] = resultSet.getString("email");
                jmlData++; //barisnya berpindah terus
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getBanyakData(){//menghitung jumlah baris
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from `contact`"; //pengambilan dara dalam java dari database
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ //lanjut kedata selanjutnya jmlData bertambah
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public void updateContact(String nama, String noHP, String umur, String email) {
        try {
            statement = koneksi.createStatement();
            String query = "Update `contact` noHp ='"+noHP+"',umur = '"+umur+"', email='"+email+"' where nama = '"+nama+"'";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
    }
    
    public void deleteContact (String nama) {
        try{
            String query = "DELETE FROM `contact` WHERE `nama` = '"+nama+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}
