package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class jtable {
    private JTable jt;
    private String[] columnHead={"Name","Roll No"};
    private String[][] data={{"VK","18"},{"RS","45"},{"MSD","7"}};
    public jtable(){
        JFrame frame=new JFrame("JTable");
        frame.setSize(900,900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        jt=new JTable(data,columnHead);
        JScrollPane jsp=new JScrollPane(jt);
        jsp.setLayout(new FlowLayout());
        frame.add(jsp);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new jtable();
            }
        });
    }
}
