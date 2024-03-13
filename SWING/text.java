package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class text {
    JLabel enter;
    JLabel currentText;
    public text(){
        JFrame jf=new JFrame("JTextField");
        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        enter=new JLabel("Enter:");
        jf.add(enter);
        currentText =new JLabel("Current Text: ");
        jf.add(currentText);


        JTextField txt=new JTextField("txt");
        jf.add(txt);
        txt.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //enter pressed
                enter.setText("Entered: "+e.getActionCommand());

            }

        });

        txt.addCaretListener(new CaretListener() {

            @Override
            public void caretUpdate(CaretEvent e) {
                // TODO Auto-generated method stub
                //cursor moved
                currentText.setText("Current Text: "+txt.getText());

            }

        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new text();
            }
        });
    }
}

