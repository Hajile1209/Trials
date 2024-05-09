package trial;
import javax.swing.*;

public class TrialLogic extends JFrame {
    
    TrialLogic(){
        setTitle("J&J Restaurant");
        
    JButton be = new JButton("Employee");
    JButton bm = new JButton("Manager");
    
    ImageIcon image = new ImageIcon("BakG.jpg");
     JLabel lblpic = new JLabel();
        lblpic.setIcon(image);
        lblpic.setSize(750, 500);
        lblpic.setVisible(true);
        
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setSize(750, 500);
        this.setVisible(true);
        
        this.add(lblpic);
        this.setResizable(false);
        this.add(be);
        this.add(bm);

        be.setBounds(300, 200, 100, 70);
        bm.setBounds(300, 100, 100, 70);

        be.setVisible(true);
        bm.setVisible(true);

        setVisible(true);
}

}