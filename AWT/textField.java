package AWT;

import java.awt.*;
import java.awt.event.*;

public class textField extends Frame implements ActionListener,ItemListener{

    TextField txt1;
    TextField txt2;
    Checkbox passwordMode;

    @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if ("true".equals(txt1.getText())) txt2.setEditable(true);
            else txt2.setEditable(false);
            repaint();
        }

    @Override
        public void itemStateChanged(ItemEvent e) {
            // TODO Auto-generated method stub
            if (passwordMode.getState()) txt2.setEchoChar('*');
            else txt2.setEchoChar((char)0);
        }


    public textField(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

    setLayout(new FlowLayout());
    txt1= new TextField("Field should be Edited: FALSE",50);
    passwordMode=new Checkbox("Password Mode ON",false);
    txt2=new TextField("Edit ME",75);
    txt2.setEditable(false);

    add(txt1);
    add(passwordMode);
    add(txt2);
    txt1.addActionListener(this);
    passwordMode.addItemListener(this);
    txt2.addActionListener(this);

    // addMouseMotionListener(new MouseMotionAdapter() {
    //     public void mouseMoved(MouseEvent me){
    //         repaint();
    //     }
    // });


    }

    public void paint(Graphics g){
        g.drawString("Txt Field 1 : "+txt1.getText(),400,400);
        //to make Selected Text display more responsive WE WILL USE MOUSEMOVED feature
        g.drawString("Selected Text in Field 1: "+txt1.getSelectedText(), 400,420);
        g.drawString("Txt Field 2: "+txt2.getText(),400,440);
        g.drawString("Selected Text in Field 2: ", 400,460);
    }


    public static void main(String[] args) {
        textField tf=new textField();
        tf.setSize(800,800);
        tf.setVisible(true);
    }






}
