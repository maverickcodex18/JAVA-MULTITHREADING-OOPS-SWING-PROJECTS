package LAYOUTS;

import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class cardlayout implements ActionListener{
    //~ JTabbedMenu
    // more Features than JTabbedMenu
    CardLayout cardLO;

    public cardlayout(){
        JFrame frame=new JFrame("Card Layout");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        cardLO=new CardLayout();

        JToggleButton tb=new JToggleButton("Windows");


        frame.add(tb);

        JPanel deck=new JPanel();
        deck.setLayout(cardLO);
        JPanel card1=new JPanel();
        card1.setLayout(new FlowLayout());
        card1.add(new Checkbox("Windows 10"));
        card1.add(new Checkbox("Windows 11"));
        deck.add(card1,"windows");
        JPanel card2=new JPanel();
        card2.add(new Checkbox("Linux"));
        card2.add(new Checkbox("Solaris"));
        card2.add(new Checkbox("Unix"));
        deck.add(card2,"others");
        // JScrollPane js=new JScrollPane(deck);
        // js.setLayout(new FlowLayout());
        frame.add(deck);

        tb.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                if (ItemEvent.DESELECTED == (e.getStateChange())) cardLO.show(deck, "windows");
                else cardLO.show(deck, "others");

            }

        });



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new cardlayout();
            }
        });
    }
}
