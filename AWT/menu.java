package AWT;

import java.awt.*;
import java.awt.event.*;


class win extends Frame implements ItemListener{
    Choice sports;

    public void itemStateChanged(ItemEvent ie){
        repaint();
    }

    public void paint(Graphics g){
        g.drawString("Selected: "+sports.getSelectedItem(),300,300);
    }

    public win(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        sports=new Choice();

        sports.add("Cricket");
        sports.add("FootBall");
        sports.add("Badminton");

        add(sports);
        sports.addItemListener(this);

    }

}

public class menu {

    public static void main(String[] args) {
        win win1=new win();
        win1.setSize(800,800);
        win1.setVisible(true);
    }

}
