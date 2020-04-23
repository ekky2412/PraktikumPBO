
package dbcontact;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class View extends JFrame{
    JPanel input = new JPanel();
    JPanel tabelP = new JPanel();
    JLabel lNama = new JLabel("Nama : ");
    JTextField tfNama = new JTextField();
    JLabel lnoHP = new JLabel ("No.HP: ");
    JTextField tfnoHP = new JTextField();
    JLabel lUmur = new JLabel ("Umur : ");
    JTextField tfUmur = new JTextField();
    JLabel lemail = new JLabel("E-mail");
    JTextField tfemail = new JTextField();
    
    JButton btnTambahPanel = new JButton("Tambah");
      
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;  //buat scroll
    Object namaKolom[] = {"nama","noHP","umur","email"}; //membuat kolom dalam array
    public View() {
        
        tableModel = new DefaultTableModel(namaKolom,0); //0 baris
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        Container contentPane = getContentPane();
        Container tablePane = getContentPane();
        contentPane.add(input, BorderLayout.WEST);
        tablePane.add(tabelP,BorderLayout.CENTER);
        input.setBackground(Color.CYAN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(800, 500);
        tabelP.setLayout(new BoxLayout(tabelP, BoxLayout.X_AXIS));
        input.setLayout(new BoxLayout(input, BoxLayout.PAGE_AXIS));
        input.add(Box.createRigidArea(new Dimension(0,0)));
        input.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        
        //TABEL
            input.add(lNama);
        //lNim.setBounds(20, 20, 90, 20);
            input.add(tfNama).setMaximumSize(new Dimension(300,25));
            //tfnim.setBounds(130, 25, 120, 20);
        input.add(lnoHP);
        //lNamaMhs.setBounds(20, 50, 90, 20);
            input.add(tfnoHP).setMaximumSize(new Dimension(300,25));
            //tfNamaMhs.setBounds(130, 50, 120, 20);
        input.add(lUmur);
        //lAlamatMhs.setBounds(20, 75, 90, 20);
            input.add(tfUmur).setMaximumSize(new Dimension(300,25));
            //tfAlamatMhs.setBounds(130, 75, 120, 20);
        input.add(lemail);
            input.add(tfemail).setMaximumSize(new Dimension(300,25));
        
        input.add(btnTambahPanel);
        //btnTambahPanel.setBounds(20, 105, 90, 20);
        
        tabelP.add(scrollPane);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
}
        public String getNama(){
            return tfNama.getText();
        }
        
        public String getNoHP(){
            return tfnoHP.getText();
        }
        
        public String getUmur(){
            return tfUmur.getText();
        }
        
        public String getEmail(){
            return tfemail.getText();
        }
    }
