package LAYOUTS;

import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class gridLayout {
    JFrame frame;
    final int no=4;
    public gridLayout(){
        frame=new JFrame("GridLayout");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(no, no));


        JPanel jp=new JPanel();
        jp.setLayout(new GridLayout(no, no));

        for (int i = 0; i < no; i++) {
            for (int j = 0; j < no; j++) {
                jp.add(new JButton("Button: "+i+j));
            }



        }

        JScrollPane sc=new JScrollPane(jp);
        frame.add(sc);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new gridLayout();
            }
        });
    }
}
