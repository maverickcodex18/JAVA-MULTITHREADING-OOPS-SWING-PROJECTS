package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jbutton implements ActionListener{

    JLabel jl;

    public jbutton(){
        JFrame jf=new JFrame("JButton");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(new FlowLayout());
        ImageIcon i1=new ImageIcon("img1.jpg");
        ImageIcon i2=new ImageIcon("img2.jpg");
        ImageIcon i3=new ImageIcon("img3.jpg");
        ImageIcon i4=new ImageIcon("img4.jpg");

        JButton b1=new JButton("b1", i1);
        JButton b2=new JButton("b2", i2);
        JButton b3=new JButton("b3", i3);
        JButton b4=new JButton("b4", i4);

        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        jl=new JLabel("Press");
        jf.add(jl);


    }
    @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            jl.setText("Pressed: "+e.getActionCommand());

        }

        public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new jbutton();
            }
        });
    }
    }
