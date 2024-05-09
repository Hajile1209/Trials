package trial;

import javax.swing.JFrame;
import javax.swing.*;

public class TrialFWT{
    
    TrialFWT(){
        JFrame jframeFWT = new JFrame();
        JButton btnET = new JButton("Expiration Tracking");
        JButton btnWT = new JButton("Waste Tracking");
        JLabel lblFWT;
        
        
        jframeFWT.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframeFWT.setSize(750,500);
        
        lblFWT = new JLabel("Food Waste Tracking");
        lblFWT.setBounds(5, 50, 180, 120);
        
        jframeFWT.add(lblFWT);
        jframeFWT.add(btnET);
        jframeFWT.add(btnWT);
        
        btnET.setBounds(300, 200, 150, 80);
        btnWT.setBounds(300, 100, 150, 80);
        
        jframeFWT.setLayout(null);
        jframeFWT.setVisible(true);
                
    }
}