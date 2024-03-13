package AWT;

import java.awt.*;
import java.awt.event.*;


//PG> 1296
//modified the example

class win extends Frame{
    int minSize=150;
    int maxSize=1000;
    Dimension d;

    public class but implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            d=getSize();
            // TODO Auto-generated method stub
            if (e.getActionCommand()=="yes"){
                int width=(d.width<minSize)?maxSize:((d.width>maxSize)?maxSize:d.width-25);
                int height=(d.height<minSize)?maxSize:((d.height>maxSize)?maxSize:d.height-25);
                setSize(width,height);
            }

            //this is METH 1 to HANDLE ACTIONEVENT FOR button "no"

            // else if (e.getActionCommand()=="no"){
            //     int width=(d.width<minSize)?maxSize:((d.width>maxSize)?maxSize:d.width+25);
            //     int height=(d.height<minSize)?maxSize:((d.height>maxSize)?maxSize:d.height+25);
            //     setSize(width,height);
            // }
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }

    }

    public win(){
        //closing window
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

        setLayout(new FlowLayout());

        Button b1=new Button("yes");
        Button b2=new Button("no");
        Button b3=new Button("Undecided");

        add(b1);
        add(b2);
        add(b3);

        but butt=new but();



        //meth 1 using defined classes (see but class)
        b1.addActionListener(butt);


        //meth 2 tohandle ActionEvent
        //lambda expression
        b2.addActionListener((ae) /*automatically ae becomes ActionEvent object */ ->{
            Dimension d=getSize();
            int width=(d.width<minSize)?maxSize:((d.width>maxSize)?maxSize:d.width+25);
            int height=(d.height<minSize)?maxSize:((d.height>maxSize)?maxSize:d.height+25);
            setSize(width,height);
        });
        b3.addActionListener(butt);

    }

}


public class button {
    public static void main(String[] args) {
        win win1=new win();
        win1.setSize(500,500);
        win1.setVisible(true);
    }
}
