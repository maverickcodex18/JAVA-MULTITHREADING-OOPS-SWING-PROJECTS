package AWT;

import java.awt.*;
import java.awt.event.*;

class wind extends Frame{
    public wind(){

        setLayout(new FlowLayout());
        try{
            Label one=new Label("One",Label.CENTER);
            Label two=new Label("Two",Label.RIGHT);
            Label three=new Label("Three",Label.LEFT);
            //one.setText("one");
            add(one);
            add(two);
            add(three);

    }
        catch(Throwable e){
            System.out.println(e);
        }



        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });



    }
}

public class label {
    public static void main(String[] args) {
        wind win1=new wind();
        win1.setSize(700,700);
        win1.setVisible(true);
    }
}
