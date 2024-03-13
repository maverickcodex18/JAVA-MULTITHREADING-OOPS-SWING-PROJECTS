package AWT;

import java.awt.*;
import java.awt.event.*;

class win extends Frame implements ActionListener,ItemListener{
    String infoActionEvent="";
    String infoItemEventSports="";
    String infoItemEventBalls="";
    List sports;
    List balls;

    public win(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());
        sports=new List(3,true);
        balls=new List(2);
        sports.add("Cricket");
        sports.add("football");
        sports.add("rugby");
        sports.add("chess");
        sports.add("hockey");

        add(sports);
        sports.addActionListener(this);
        sports.addItemListener(this);

        balls.add("sg");
        balls.add("kookaboora");
        balls.add("dukes");
        balls.add("ss");

        add(balls);
        balls.addActionListener(this);
        balls.addItemListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //CALLS WHEN DOUBLE CLICKED
        infoActionEvent="ActionEvent(Double CLicked): "+e.getActionCommand();

        repaint();
    }



    public void paint(Graphics g){
        g.drawString(infoActionEvent, 200,200);
        g.drawString(infoItemEventSports, 200,220);
        g.drawString(infoItemEventBalls, 200,240);


        //Printing Selected Items in sports
        String namesSports="";
        namesSports+=("Selected In Sports: ");
        String arr[]=sports.getSelectedItems();
        for(String i:arr){
            namesSports+=i+" ";
        }
        g.drawString(namesSports, 200,260);

        //Printing Selected Items in balls
        String namesBalls="";
        namesBalls+=("Selected In Balls: ");
        arr=balls.getSelectedItems();
        for(String i:arr){
            namesBalls+=i+" ";
        }
        g.drawString(namesBalls, 200,280);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        infoItemEventSports="ItemEvent(Single CLicked) in Sports: "+sports.getSelectedItem();
        infoItemEventBalls="ItemEvent(Single CLicked) in Balls: "+balls.getSelectedItem();

        repaint();
    }

}

public class list {
    public static void main(String[] args) {
        win win1=new win();
        win1.setSize(800,800);
        win1.setVisible(true);
    }
}
