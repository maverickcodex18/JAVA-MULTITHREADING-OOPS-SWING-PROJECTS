package AWT;

import java.awt.*;
import java.awt.event.*;

class xor extends Frame{

    private int x=100;
    private int y=100;

    public class mouse extends MouseMotionAdapter{
        public void mouseMoved(MouseEvent me){
            x=me.getX();
            y=me.getY();
            repaint();
        }
    }

    public xor(){
        mouse mouse1=new mouse();
        addMouseMotionListener(mouse1);
    }

    public void paint (Graphics g){
        g.fillRect(200,200,200,200);

        //normal mode
        // g.drawLine(x-10,y+10,x+10,y-10);
        // g.drawLine(x-10,y-10,x+10,y+10);

        //changing color of X (OVER RIDES)
        // g.setColor(Color.red);
        // g.drawLine(x-10,y+10,x+10,y-10);
        // g.drawLine(x-10,y-10,x+10,y+10);

        //xorMODE
        g.setXORMode(Color.orange);
        /*
         * IF CURRENT COLOR NOT MENTIONED, IT SETS IT IN SUCH A WAY SO THAT THE XORED COLOR IS AS PASSED
         * IF CURRENT COLOR MENTIONED, IT WILL ALTER THE XORED COLOR BY ACTUALLY XORING WITH OBJECTS COLOR
         */
        g.drawLine(x-10,y+10,x+10,y-10);
        g.drawLine(x-10,y-10,x+10,y+10);
        g.setPaintMode();

    }
}

public class xorMode {
    public static void main(String[] args) {
        xor fr=new xor();
        fr.setSize(760,760);
        fr.setVisible(true);
    }
}
