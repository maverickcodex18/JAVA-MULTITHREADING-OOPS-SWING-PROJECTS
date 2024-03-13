package AWT;

import java.awt.*; //import AWT CLASSES
import java.awt.event.*; //import AWT EVENTS

//creating SUBCLASS of Frame
class draw extends Frame{

    //closing window
    // class closing extends WindowAdapter{
    //     public void windowClosing(){
    //         System.exit(0);
    //     }
    // }
    

    public void paint(Graphics g){

        //line
        g.drawLine(560, 560, 700, 100);
        g.drawLine(440, 290, 545, 120);

        //rectangles
        g.drawRect(222,560, 66, 77);
        g.fillRect(122, 96,  231,111);

        //rounded rectangle
        g.drawRoundRect(45, 98, 18, 18,8, 8);
        g.fillRoundRect(10, 1, 23, 12, 6, 6);

        //ovals
        g.drawOval(35,90,39,95);
        g.fillOval(445,445,67,67);

        //draw Polygon
        int x[]={222,232,554,234,112};
        int y[]={454,516,232,444,654};
        g.drawPolygon(x, y, 5);

        int x2[]={534,567,456};
        int y2[]={611,665,771};
        g.fillPolygon(x2, y2, 3);

        //draw arc
        g.drawArc(330,330,120,120,180,180);
        g.fillArc(34,384,111,111,90,180);


    }



}


public class drawing {
    public static void main(String[] args) {
        draw draw1=new draw();
        draw1.setSize(new Dimension(760,760));
        draw1.setVisible(true);
    }
}
