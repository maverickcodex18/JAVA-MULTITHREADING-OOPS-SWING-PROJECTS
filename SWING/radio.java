package SWING;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class radio implements ActionListener {
    JLabel jl;
    public radio(){
        JFrame jf = new JFrame("Radio");
        jf.setSize(600,600);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        jl=new JLabel("Select One: ");
        jf.add(jl);

        JRadioButton r1=new JRadioButton("F1");
        JRadioButton r2=new JRadioButton("Cricket");
        JRadioButton r3=new JRadioButton("Football");

        ButtonGroup grp=new ButtonGroup();
        grp.add(r1);
        grp.add(r2);
        grp.add(r3);

        jf.add(r1);
        jf.add(r2);
        jf.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        jl.setText("Selected: "+e.getActionCommand());
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new radio();
            }
        });
    }


}
