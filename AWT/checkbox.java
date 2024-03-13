package AWT;

import java.awt.*;
import java.awt.event.*;

class win extends Frame implements ItemListener{
    Checkbox windows;
    Checkbox mac;
    Checkbox linux;
    public void itemStateChanged(ItemEvent ie){
        repaint();
    }

    public win(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        windows=new Checkbox("Windows",true);
        mac=new Checkbox("Mac");
        linux=new Checkbox("Linux");

        add(windows);
        add(mac);
        add(linux);

        windows.addItemListener(this);
        mac.addItemListener(this);
        linux.addItemListener(this);


    }

    public void paint(Graphics g){
        String msg="";
        g.drawString("States:\n", 500,500);
        msg="Windows: "+windows.getState();
        g.drawString(msg, 500,520);
        g.drawString("Mac: "+mac.getState(), 500,540);
        g.drawString("Linux: "+linux.getState(), 500,560);
    }


}

public class checkbox {
    public static void main(String[] args) {
        win win1=new win();
        win1.setSize(800,800);
        win1.setVisible(true);
    }
}
