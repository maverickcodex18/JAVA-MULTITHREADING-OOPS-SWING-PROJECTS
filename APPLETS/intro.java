package APPLETS;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class intro extends Frame implements ActionListener{

    Label l;

    public intro(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        Button b=new Button("Press");
        b.addActionListener(this);
        add(b);
        l=new Label("Press BUtton");
        add(l);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        l.setText("Pressed");
    }

    public static void main(String[] args) {
        intro i=new intro();
        i.setSize(300,300);
        i.setVisible(true);
    }

}
