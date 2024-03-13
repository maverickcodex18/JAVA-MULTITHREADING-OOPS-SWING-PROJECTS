package LAYOUTS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class flowLayout  implements ItemListener{

    //swing
    JFrame frame;
    CheckboxGroup cbg;
    Checkbox left;
    Checkbox right;
    Checkbox center;
    Checkbox trailing;
    Checkbox leading;

    public flowLayout(){
        frame=new JFrame("FlowLayout");
        frame.setSize(400,400);
        frame.setVisible(true);
        //closing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //layout
        frame.setLayout(new FlowLayout());

        CheckboxGroup align=new CheckboxGroup();
        left=new Checkbox("Left",align,false);
        right= new Checkbox("Right",align,false);
        center=new Checkbox("Center",align,true);
        trailing=new Checkbox("Trailing",align,false);
        leading= new Checkbox("Leading",align,false);

        frame.add(left);
        frame.add(right);
        frame.add(center);
        frame.add(trailing);
        frame.add(leading);

        left.addItemListener(this);
        right.addItemListener(this);
        center.addItemListener(this);
        leading.addItemListener(this);
        trailing.addItemListener(this);

        //components


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new flowLayout();
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        if (left.getState()) frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        else if (right.getState()) frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        else if (center.getState()) frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        else if (leading.getState()) frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        else if (trailing.getState()) frame.setLayout(new FlowLayout(FlowLayout.TRAILING));

        //Updates frame Layout
        frame.validate();
        }



}
