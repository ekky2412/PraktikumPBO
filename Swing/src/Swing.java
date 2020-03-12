import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


public class Swing {
        public static void main(String[] args) {
        GUIClass g = new GUIClass();
    }
}

class GUIClass extends JFrame {
    public GUIClass(){
        JPanel navbar = new JPanel();
        JLabel pesbuk = new JLabel("Pesbuuk");
        JLabel emailnav = new JLabel("E-mail");
        JTextField emailnavtxt = new JTextField();
        JPasswordField passnavtxt = new JPasswordField();
        JLabel passnav = new JLabel("Password");
        JButton submit = new JButton("Login");
        JPanel body = new JPanel();
        JLabel passconfbody = new JLabel("Confirm Password");
        JLabel h1 = new JLabel("Platform Media Sosial Terbesar di Dunia #1");
        JLabel emailbody = new JLabel("E-mail");
        JTextField emailbodytxt = new JTextField();
        JLabel passbody = new JLabel("Password");
        JPasswordField passbodytxt = new JPasswordField();
        JPasswordField passconftxt = new JPasswordField();
        JButton daftar = new JButton("Daftar Sekarang");
        
        setLayout(null);
        setSize(1280,720);
        add(navbar);
        add(pesbuk);
        add(emailnav);
        add(emailnavtxt);
        add(passnavtxt);
        add(passnav);
        add(submit);
        add(body);
        add(passconfbody);
        add(h1);
        add(emailbody);
        add(emailbodytxt);
        add(passbody);
        add(passbodytxt);
        add(passconftxt);
        add(daftar);
        
        //Font
        pesbuk.setFont(new Font("Segoe UI", 1, 36));
        emailnav.setFont(new Font("Segoe UI", 0, 14));
        passnav.setFont(new Font("Segoe UI", 0, 14));
        h1.setFont(new Font("Segoe UI", 1, 36));
        emailbody.setFont(new Font("Segoe UI", 0, 24));
        passbody.setFont(new Font("Segoe UI", 0, 24));
        passconfbody.setFont(new Font("Segoe UI", 0, 24));
        
        //Posisi
        pesbuk.setBounds(31, 20, 200, 60);
        emailnav.setBounds(700, 21, 45, 20);
        emailnavtxt.setBounds(700, 51, 125, 20);
        passnav.setBounds(866, 21, 70, 20);
        passnavtxt.setBounds(866, 51, 125, 20);
        submit.setBounds(1026, 36, 110, 44);
        
        h1.setBounds(73, 144, 735, 65);
        emailbody.setBounds(73, 200, 77, 60);
        emailbodytxt.setBounds(73, 260, 300, 30);
        passbody.setBounds(73, 300, 100, 65);
        passbodytxt.setBounds(73, 360, 300, 30);
        passconfbody.setBounds(73, 400, 300, 65);
        passconftxt.setBounds(73, 460, 300, 30);
        daftar.setBounds(73, 530, 150, 40);
        
        setDefaultCloseOperation(3);
        setVisible(true);
    }
}    
