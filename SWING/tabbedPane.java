package SWING;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tabbedPane {

    public class indians extends JPanel{
        JLabel jl;
        Choice li;

        public indians(){
            jl=new JLabel("Choose: ");
            add(jl);
            li=new Choice();
            li.add("vk");
            li.add("rs");
            li.add("msd");
            add(li);
            li.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {
                    // TODO Auto-generated method stub
                    jl.setText("Selected: "+li.getSelectedItem());
                }

            });
        }

    }

    public class aussies extends JPanel implements ActionListener{
        JLabel jl;
        public aussies(){
            JRadioButton r1=new JRadioButton("Steve Smith");
            JRadioButton r2=new JRadioButton("Pat Cummins");
            JRadioButton r3=new JRadioButton("Glenn Maxwell");

            add(r1);
            add(r2);
            add(r3);
            jl=new JLabel("Select Any: ");
            add(jl);
            r1.addActionListener(this);
            r2.addActionListener(this);
            r3.addActionListener(this);


        }
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            jl.setText("Selected: "+e.getActionCommand());

        }
    }




    public tabbedPane(){
        JFrame jf=new JFrame("Tabbed Pane");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.setLayout(new FlowLayout());

        JTabbedPane tb=new JTabbedPane();
        tb.addTab("India", new indians());
        tb.addTab("Aussies", new aussies());

        jf.add(tb);

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                new tabbedPane();
            }

        });
    }

}
