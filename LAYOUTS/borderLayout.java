package LAYOUTS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class borderLayout {
    JFrame frame;
    JLabel north;
    JLabel south;
    JLabel east;
    JLabel west;
    JLabel center;

    public borderLayout(){
        frame = new JFrame("BorderLayout");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(200,25));

        north=new JLabel("North");
        south=new JLabel("south");
        east=new JLabel("East");
        west=new JLabel("West");
        center=new JLabel("Center");

        frame.add(north,BorderLayout.NORTH);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(west,BorderLayout.WEST);
        frame.add(east,BorderLayout.EAST);
        frame.add(center,BorderLayout.CENTER);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new borderLayout();
            }
        });
    }
}
