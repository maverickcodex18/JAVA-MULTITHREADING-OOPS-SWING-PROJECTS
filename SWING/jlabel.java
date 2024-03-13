package SWING;

import javax.swing.*;

public class jlabel {
    public jlabel(){
        JFrame frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1600,1600);
        frame.setVisible(true);
        ImageIcon ii=new ImageIcon("/C://Users//ASUS//OneDrive//Desktop//vk+goals.jpg");
        JLabel l=new JLabel("Random Image",ii,JLabel.CENTER);
        frame.add(l);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new jlabel();
            }
        });
    }
}
