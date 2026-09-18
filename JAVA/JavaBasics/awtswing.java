// java's Swing method.


import javax.swing.*;
public class awtswing {
    public static void main(String[] args){
        JFrame f = new JFrame("Java Swing");
        JButton b = new JButton("Click");
        JLabel l = new JLabel("name:", SwingConstants.CENTER);
        JTextField t = new JTextField(10);
    
        f.add(l);
        f.add(t);
        f.add(b);
        f.setSize(200,300);
        f.setVisible(true);

    }
    
}


// Java's awt method 

// import java.awt.*;
// import java.awt.event.*;

// public class awtswing{
//     public static void main(String[] args){
//         Frame f = new Frame("Java Awt");
//         Button b = new Button("Fack You..");
//         f.add(b);
//         f.setSize(600, 700);
//         f.setVisible(true);

//     }
// }