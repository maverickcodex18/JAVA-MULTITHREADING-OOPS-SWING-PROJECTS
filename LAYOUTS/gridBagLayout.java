package LAYOUTS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gridBagLayout {

    JFrame frame;

    public gridBagLayout(){
        frame=new JFrame("Q3>C");
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints constraints=new GridBagConstraints();


        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                constraints.gridy=i;
                constraints.gridx=j;
                constraints.insets=new Insets(3,3,3,3);
                frame.add(new JButton("B: "+(i+j)),constraints);
            }
        }


        JButton b2=new JButton("Pane2");

        constraints.fill=GridBagConstraints.VERTICAL;
        //constraints.gridwidth=GridBagConstraints.REMAINDER;
        constraints.gridx=3;
        constraints.gridy=0;
        constraints.gridheight=4;
        frame.add(b2,constraints);


        constraints.gridy=3;
        constraints.gridx=0;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        constraints.gridwidth=3;
        frame.add(new JButton(),constraints);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new gridBagLayout();
            }
        });
    }
}
