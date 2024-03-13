package SWING;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class jlist implements ListSelectionListener,ItemListener{
    private JList<String> list1;
    private JLabel jl;
    private String [] cities={"London","Delhi","Mumbai","NewYork","Sydney","Auckland","Amsterdam","Paris","Tokyo","Dubai"};
    CheckboxGroup selectionModes;
    Checkbox singleSelection;
    Checkbox singleIntervalSelection;
    Checkbox multipleIntervalSelection;




    public jlist(){
        JFrame frame=new JFrame("JList");
        frame.setSize(700,700);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        selectionModes=new CheckboxGroup();

        singleSelection=new Checkbox("SingleSelectionMode", selectionModes, false);
        singleIntervalSelection=new Checkbox("singleIntervalSelection", selectionModes, false);
        multipleIntervalSelection=new Checkbox("multipleIntervalSelection", selectionModes, true);

        frame.add(singleSelection);
        frame.add(singleIntervalSelection);
        frame.add(multipleIntervalSelection);

        singleSelection.addItemListener(this);
        singleIntervalSelection.addItemListener(this);
        multipleIntervalSelection.addItemListener(this);




        list1=new JList<String>(cities);
        list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //deault mode
        JScrollPane scroll1=new JScrollPane(list1);
        scroll1.setPreferredSize(new Dimension(600,70));
        frame.add(scroll1);
        list1.addListSelectionListener(this);
        jl=new JLabel("Select: ");
        frame.add(jl);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub
        //runs when ANY SELECTION/DESELECTION IS DONE
        jl.setText("Selected: "+list1.getSelectedValue());
    }


    @Override
        public void itemStateChanged(ItemEvent e) {
            // TODO Auto-generated method stub
            if (singleSelection.getState()) list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            else if (singleIntervalSelection.getState()) list1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            else list1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new jlist();
            }
        });
    }


}



