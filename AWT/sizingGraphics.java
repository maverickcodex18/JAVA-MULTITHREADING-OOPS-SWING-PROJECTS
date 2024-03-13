package AWT;

import java.awt.*;
import java.awt.event.*;

//program to demostrate the increase of frame size on mouse clicks
//drawing x in whole screen
//PG> 1266

class resize extends Frame{

    //variables to increase width and height and constrained to max and min dimenstions
    final int minDimensions=200;
    final int maxDimensions=500;
    final int inc=25;
    Dimension d;

    //mouse event
    public class mouse extends MouseAdapter{
        public void mouseReleased(MouseEvent me){
            int newWidth=(d.width+inc>maxDimensions)?minDimensions:d.width+inc;
            int newHeight=(d.height+inc>maxDimensions)?minDimensions:d.height+inc;
            setSize(newWidth,newHeight);
        }
    }

    //constructor
    public resize(){
        //registering listener
        mouse listener=new mouse();
        addMouseListener(listener);

    }
    public void paint(Graphics g){
        /*
         * INSECTS::
         * i.left:LEFT ABSCISSA OF TITLE
         * i.right:RIGHT ABSCISSA OF TITLE
         * i.bottom: BOTTOM ORDIANTE OF TITLE
         * i.top: TOP ORDINATE OF TITLE
         */
        Insets i=getInsets();
        this.d=getSize();

        Color c1=new Color(20,167,144);
        Color c2= new Color(230,112,100);

        g.setColor(c1);
        g.drawLine(i.left,i.top,d.width,d.height);

        g.setColor(c2);
        g.drawLine(i.left,d.height-i.bottom,d.width,i.top);

        //backGround color
        Color c=new Color(184,222,111);
        setBackground(c);
    }
}

public class sizingGraphics {
    public static void main(String[] args) {

        resize win1=new resize();
        win1.setSize(200,200);
        win1.setTitle("ResizeMe");
        win1.setVisible(true);


    }

}
