package SWING;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class menus {
    public menus(){
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar bar=new JMenuBar();
        frame.setJMenuBar(bar);

        JMenu m1=new JMenu("M1");
        JMenu m2=new JMenu("M2");
        JMenu m3=new JMenu("M3");

        bar.add(m1);
        bar.add(m2);
        bar.add(m3);

        JMenuItem i1=new JMenuItem("I1");
        m1.add(i1);
        JMenuItem i2=new JMenuItem("I2",KeyEvent.VK_2);
        i2.setDisplayedMnemonicIndex(1);
        m1.add(i2);
        JMenuItem i3=new JMenuItem("I3");
        i3.setToolTipText("I3");
        m1.add(i3);
        JMenuItem i4=new JMenuItem("I4",KeyEvent.VK_4);
        //i4.setDisplayedMnemonicIndex(3);
        m1.add(i4);


        JRadioButtonMenuItem rm1=new JRadioButtonMenuItem("RM1");
        m2.add(rm1);

        JRadioButtonMenuItem rm2=new JRadioButtonMenuItem("RM2");
        m2.add(rm2);

        JRadioButtonMenuItem rm3=new JRadioButtonMenuItem("RM1");
        m2.add(rm3);


        JCheckBoxMenuItem cm1=new JCheckBoxMenuItem("cb1");
        m3.add(cm1);
        JCheckBoxMenuItem cm2=new JCheckBoxMenuItem("cb2");
        m3.add(cm2);
        JCheckBoxMenuItem cm3=new JCheckBoxMenuItem("cb3");
        m3.add(cm3);






        JPopupMenu pop=new JPopupMenu();
        JMenuItem il1=new JMenuItem("i1");
        pop.add(il1);
        frame.add(pop);

        frame.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                if(e.isPopupTrigger()) pop.show(e.getComponent(),e.getX(),e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
            }

        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                new menus();
            }

        });
    }
}
