package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jcombobox {

    private String images[]={"img1","img2","img3","img4"};
    private JLabel image;
    private JComboBox<String> jcb;


    public jcombobox(){
        JFrame frame=new JFrame("JCombobox");
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jcb=new JComboBox<String>(images);
        image=new JLabel(new ImageIcon("img1.jpg"));

        frame.add(jcb);
        frame.add(image);

        jcb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String s=(String)jcb.getSelectedItem();
                image.setIcon(new ImageIcon(s+".jpg"));
                //image.setText(s+".png");
            }

        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new jcombobox();
            }
        });
    }
}
