package SWING;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class event {

    JLabel jtxt;

    public event(){
        JFrame frame1=new JFrame("Event Handling in Swing");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(600,600);
        frame1.setVisible(true);
        frame1.setLayout(new FlowLayout());

        JButton alpha=new JButton("Alpha");

        JButton beta=new JButton("Beta");
        jtxt=new JLabel("Press Any Button");
        frame1.add(alpha);
        frame1.add(beta);
        frame1.add(jtxt);

        alpha.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                jtxt.setText("Alpha Pressed");
            }

        });

        beta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                jtxt.setText("Beta Pressed");
            }

        });


    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new event();
            }
        });
    }
}
