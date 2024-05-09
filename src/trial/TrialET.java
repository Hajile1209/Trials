package trial;
import javax.swing.*;

public class TrialET {
    
   TrialET() {
       JFrame jframewr = new JFrame();
       JLabel lblProd = new JLabel("Product");
       JLabel lblQuan = new JLabel("Quantity");
       JLabel lblRQuan = new JLabel("Remaining Quantity");
       JLabel lblED = new JLabel("Expiration Date");
       
       jframewr.setSize(750,500);
       
       lblProd.setBounds(5, 100, 180, 120);
       lblQuan.setBounds(110, 100, 180, 120);
       lblRQuan.setBounds(220, 100, 180, 120);
       lblED.setBounds(400, 100, 180,120);
       
       jframewr.add(lblProd);
       jframewr.add(lblQuan);
       jframewr.add(lblRQuan);
       jframewr.add(lblED);
       
       jframewr.setLayout(null);
       jframewr.setVisible(true);
       
       System.out.print("HELLO");
   }
       
}