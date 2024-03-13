package AWT;

import java.awt.*;
import java.awt.event.*;

public class scroll extends Frame implements AdjustmentListener {
    Scrollbar sbv;
    Scrollbar sbh;
    String status="";

    public scroll(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());

        //thumb size: reduces MAX size

        sbh=new Scrollbar(Scrollbar.HORIZONTAL,20,12,0,100);
        sbh.setPreferredSize(new Dimension(100,20));
        add(sbh);
        sbh.addAdjustmentListener(this);

        sbv=new Scrollbar(Scrollbar.VERTICAL,20,10,0,100);
        sbv.setPreferredSize(new Dimension(20,100));
        add(sbv);
        sbv.addAdjustmentListener(this);

        //using mouse draggin to change the values
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me){
                sbh.setValue(me.getX()%(sbh.getMaximum()-sbh.getMinimum()));
                sbv.setValue(me.getY()%(sbv.getMaximum()-sbv.getMinimum()));
                repaint();
            }
        });

    }


    @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            // TODO Auto-generated method stub
            int whatHappened=e.getAdjustmentType();
            switch(whatHappened){
                case (AdjustmentEvent.BLOCK_DECREMENT):
                    status="Page Down";
                    break;
                case(AdjustmentEvent.BLOCK_INCREMENT):
                    status="Page Up";
                    break;
                case (AdjustmentEvent.TRACK):
                    status="Track";
                    break;
                case (AdjustmentEvent.UNIT_DECREMENT):
                    status="Line Down Button Pressed";
                    break;
                case (AdjustmentEvent.UNIT_INCREMENT):
                    status="Line Up Button Pressed";
                    break;
            }
            repaint();
        }

        public void paint(Graphics g){
            g.drawString("H Scroll: "+sbh.getValue(), 400,400);
            g.drawString("H Scroll MAX: "+sbh.getMaximum(), 400,420);
            g.drawString("H Scroll MIN: "+sbh.getMinimum(), 400,440);

            g.drawString("V Scroll: "+sbv.getValue(), 400,460);
            g.drawString("V Scroll MAX: "+sbv.getMaximum(), 400,480);
            g.drawString("V Scroll MIN: "+sbv.getMinimum(), 400,500);

            g.drawString("Status: " +status, 400,520);
        }


    public static void main(String[] args) {
        scroll sb=new scroll();
        sb.setSize(800,800);
        sb.setVisible(true);
    }



}
