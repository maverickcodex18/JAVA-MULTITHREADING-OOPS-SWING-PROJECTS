package SWING;

import javax.swing.*;


public class intro {
    public intro(){
        //JFrame
        JFrame frame1=new JFrame("Frame 1");
        //Title
        frame1.setTitle("Frame 1 ReTitled");
        //closing
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //size
        frame1.setSize(400,400);
        //visible
        frame1.setVisible(true);
        //DEFAULT LAYOUT: BORDER LAYOUT

        //Label
        JLabel label1=new JLabel("Label1");
        frame1.add(label1);


    }


    public static void main(String[] args) {
        //Event Dispatching Threading
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new intro();
            }
        });
    }
}
