import java.awt.Font;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        GUI g = new GUI();
    }
}

class GUI extends JFrame {
    public GUI(){
        Font font1 = new Font("SansSerif",0,18);
        setTitle("Form Login");
        JLabel title = new JLabel("Silahkan Login terlebih dahulu!");
        JTextField usernameField = new JTextField(10);
        JPasswordField passwordField = new JPasswordField(10);
        JLabel username = new JLabel("Username : ");
        JLabel password =  new JLabel("Password : ");
        JButton login = new JButton("Login");
        JButton exit = new JButton("Exit");
        
        //Nambahin Layout
        setLayout(null);
        setSize(1280,720);
        add(title);
        add(username);
        add(usernameField);
        add(password);
        add(passwordField);
        add(login);
        add(exit);
        
        //Atur Posisi
        title.setBounds(500,200,300,20);
        title.setFont(font1);
        username.setBounds(500,250,100,20);
        usernameField.setBounds(600,250,120,20);
        password.setBounds(500,300,100,20);
        passwordField.setBounds(600,300,120,20);
        login.setBounds(525,350,80,20);
        exit.setBounds(625,350,80,20);
        setDefaultCloseOperation(3);
        setVisible(true);
    }
}