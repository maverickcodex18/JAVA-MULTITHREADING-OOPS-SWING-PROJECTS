package eventHandling;

import java.awt.*;
import java.awt.event.*;



//first of all create subclass of Frame
class mouseEvent extends Frame {

    int mouseX=200;
    int mouseY=200;
    String msg="";

    //closing window
    public class close extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    }

    //mouse event
    public class mouse extends MouseMotionAdapter{
        //getting coordinates
        public void mouseMoved(MouseEvent me){
            mouseX=me.getX();
            mouseY=me.getY();
            msg="( "+ mouseX + ","+mouseY+" )";
            repaint();
        }

        public void mouseDragged(MouseEvent me){
            mouseX=me.getX();
            mouseY=me.getY();
            msg="dragged";
            //changes the window size
            int x=700;
            int y =700;
            setSize(x-25,y-25);
            repaint();
        }

        public void mouseEntered(MouseEvent me){
            mouseX=me.getX();
            mouseY=me.getY();
            msg=msg+"Mouse Entered";
            repaint();
        }

        public void mousePressed(MouseEvent me){
            mouseX=me.getX();
            mouseY=me.getY();
            msg="Mouse Pressed";
            repaint();
        }
        public void mouseReleased(MouseEvent me){
            mouseX=me.getX();
            mouseY=me.getY();
            msg="Mouse Released";
            repaint();
        }
        public void mouseExited(MouseEvent me){
            mouseX=me.getX();
            mouseY=me.getY();
            msg="Mouse Exited";
            repaint();
        }
    }

    public class moused extends MouseAdapter{
        public void mouseClicked(MouseEvent me){
            mouseX=me.getX();
            mouseY=me.getY();
            msg=msg+" --Mouse Clicked";
            repaint();
        }
    }

    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }


    //constructor
    public mouseEvent(){
        mouse mouse1=new mouse();
        close closed=new close();
        moused mouse2=new moused();
        addMouseMotionListener(mouse1);
        addMouseListener(mouse2);
        addWindowListener(closed);

    }
}



public class mouseListenerANDmouseMotionListener {
    //mouseMouseListener
    //mouseListener
    public static void main(String[] args) {
        mouseEvent me=new mouseEvent();
        me.setSize(800,800);
        me.setVisible(true);
    }

}
