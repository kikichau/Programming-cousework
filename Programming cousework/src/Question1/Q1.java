package Question1;
// import statements
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q1 extends JFrame implements ActionListener {
// declare text fields and button
    private JTextField jtfWeight		= new JTextField(10);
    private JTextField jtfHeight   		= new JTextField(10);
    private JTextField jtfCofficient            = new JTextField(20);
    private JTextField jtfResult   		= new JTextField(20);
    private JButton jbCompute  			= new JButton("Compute");
    double H, W, Q1;
    String Height, Weight;

// Main method
public static void main(String[ ] args) {
    Q1 q1 = new Q1();
    Q1 frame = new Q1( );
    frame.pack();
    frame.setTitle("Fat Coefficient");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
}
public Q1( ) {
    
    // Panel p1 to hold labels and text fields using GridLayout
    JPanel p1 = new JPanel( );
    p1.setLayout(new GridLayout(4, 2));

    // add components here
    p1.add(new JLabel("Weight (kg)"));
    p1.add(jtfWeight);
    p1.add(new JLabel("Height (m)"));
    p1.add(jtfHeight);											
    p1.add(new JLabel("Coefficient, good if 15 to 25"));
    p1.add(jtfCofficient);										
    jtfCofficient.setEditable(false);
    p1.add(new JLabel("Result"));								
    p1.add(jtfResult);
    jtfResult.setEditable(false);
    p1.add(jbCompute);

    this.getContentPane().setLayout(new BorderLayout());
    // Add p1 to the CENTER region of the frame
    this.getContentPane().add(p1,BorderLayout.CENTER);

    // Add compute button to the SOUTH region of the frame
    this.getContentPane().add(jbCompute,BorderLayout.SOUTH);

    // Register the current frame to be the actionListener of the button
    jbCompute.addActionListener(this);
}


 public void calculateQ1(double H, double W) {
     
     Q1 = ( W / (H * H));
     
 }

// Handle ActionEvent
public void actionPerformed(ActionEvent e) {
    
    // calculate the FC and display results
    
    Height = jtfHeight.getText();
    Weight = jtfWeight.getText();
    String C = Integer.toString((int) Q1);
    jtfCofficient.setText(C);
    H = Double.parseDouble(Height);
    W = Double.parseDouble(Weight);//exception may come out
    calculateQ1(H, W);

    
    if (Q1 > 25) {
        
        jtfResult.setText("Too Fat, need to keep fit!");

    }
    else if (Q1 < 15) {
        
        jtfResult.setText("Too Thin, need to keep fat!");
        
    }

    else {
        
        jtfResult.setText("Just fit, keep on!");
    
    }
    
    
} // end of ActionPerformed

} // end of Q1
