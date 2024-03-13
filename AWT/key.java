package AWT;

import java.awt.*;
import java.awt.event.*;

class keyFrame extends Frame implements KeyListener {
    String msg="";
    public void keyPressed(KeyEvent ke){
        //when any key is PRESSED
        msg="Key Pressed";
        int key=ke.getKeyCode();
        switch(key){
            case KeyEvent.VK_ALT:
                msg+=" : Alt";
                break;
            case KeyEvent.VK_CONTROL:
                msg+=" : Control";
                break;
            case KeyEvent.VK_DOWN:
                msg+=" : Down";
                break;
        }
        repaint();
    }
    public void keyReleased(KeyEvent ke){
        //when any key is RELEASED
        msg="Key Released";
        repaint();

    }
    public void keyTyped(KeyEvent ke){
        //when any key GENERATES CHARACTER
        msg+=" : " + ke.getKeyChar();
        repaint();

    }
    public void paint(Graphics g){
        g.drawString(msg,300,200);
    }

    public class close extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    }

    public keyFrame(){
        addKeyListener(this);
        close closed=new close();
        addWindowListener(closed);
    }
}

public class key{
    public static void main(String[] args) {
        keyFrame kf=new keyFrame();
        kf.setSize(800,800);
        kf.setVisible(true);
    }
}
