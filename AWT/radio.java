package AWT;

import java.awt.*;
import java.awt.event.*;


class win extends Frame implements ItemListener{

    CheckboxGroup checkGrp;
    Checkbox windows;
    Checkbox mac;
    Checkbox linux;

    public void itemStateChanged(ItemEvent ie){
        repaint();
    }

    public void paint(Graphics g){
        g.drawString("Windows: "+windows.getState(), 400,400);
        g.drawString("mac: "+mac.getState(), 400,420);
        g.drawString("Linux: "+linux.getState(), 400,440);
    }

    public win(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        checkGrp=new CheckboxGroup();

        windows=new Checkbox("Windows",checkGrp,false);
        mac=new Checkbox("mac",checkGrp,false);
        linux=new Checkbox("linux",checkGrp,false);

        add(windows);
        add(mac);
        add(linux);

        windows.addItemListener(this);
        mac.addItemListener(this);
        linux.addItemListener(this);
    }
}

public class radio {

    //checkBoc group

    public static void main(String[] args) {
        win win1=new win();
        win1.setSize(1000,1000);
        win1.setVisible(true);
    }

}
