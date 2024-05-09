package trial;
import javax.swing.*;
public class TrialLogin extends JFrame {
    
    TrialLogin(){
        setSize(750,500);
        setTitle("Login Cashier");
        
        JLabel JlblHeader = new JLabel("Login Employee");
        JLabel JlblUser = new JLabel("Username");
        JLabel JlblPass = new JLabel("Password");
        JTextField JtxtUser = new JTextField();
        JTextField JtxtPass = new JTextField();
        JButton JbtnLogin = new JButton("Login");
        
        add(JlblHeader);
        add(JlblUser);
        add(JlblPass);
        add(JbtnLogin);
        
        
        JtxtUser.setBounds(100,4000,100,60);
        JtxtPass.setBounds(150,500,100,60);
        setLayout(null);
        
        setVisible(true);
        
    }
}