package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//wrap every component inside JSCROLLPANE


public class scroll {
    public scroll(){
        JFrame jf=new JFrame("Scrolling");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,200);
        jf.setVisible(true);
        JPanel jp=new JPanel();
        jp.setLayout(new GridLayout(20,20));
        int b=0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                jp.add(new JButton("Button: "+b));
                ++b;
            }
        }
        JScrollPane jsb=new JScrollPane(jp);



        jf.add(jsb,BorderLayout.CENTER);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new scroll();
            }
        });
    }
}
