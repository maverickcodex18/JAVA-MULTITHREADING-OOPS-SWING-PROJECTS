package SWING;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class toggle implements ItemListener{
    JToggleButton tb;
    JLabel jl;

    public toggle(){
        JFrame frame=new JFrame("Toggle");
        frame.setSize(700,700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        tb=new JToggleButton("toggle");
        jl=new JLabel("Toggle OFF");

        frame.add(tb);
        tb.addItemListener(this);
        frame.add(jl);


    }

    @Override
        public void itemStateChanged(ItemEvent e) {
            // TODO Auto-generated method stub
            jl.setText("Toggle "+tb.isSelected());

        }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new toggle();
            }
        });
    }


}



