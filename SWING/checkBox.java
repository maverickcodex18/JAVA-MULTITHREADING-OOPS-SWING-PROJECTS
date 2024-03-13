package SWING;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class checkBox {
    JCheckBox cb;
    JLabel jl;
    public checkBox(){
        JFrame jf=new JFrame("Check Box");
        jf.setSize(600,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        cb=new JCheckBox("JCheckBox");
        jl=new JLabel("Status: "+cb.isSelected());
        jf.add(cb);
        jf.add(jl);
        cb.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                jl.setText("Status: "+cb.isSelected());
            }

        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new checkBox();
            }
        });
    }
}
