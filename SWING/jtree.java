package SWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.tree.DefaultMutableTreeNode;


public class jtree {
    JScrollPane jsp;
    JTree tree;
    JLabel jl;
    public jtree(){
        JFrame frame = new JFrame("Frame");
        frame.setSize(600,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JPanel jp=new JPanel();
        jp.setLayout(new FlowLayout());

        DefaultMutableTreeNode top=new DefaultMutableTreeNode("top");
        DefaultMutableTreeNode a=new DefaultMutableTreeNode("a");
        DefaultMutableTreeNode a1=new DefaultMutableTreeNode("a1");
        DefaultMutableTreeNode a2=new DefaultMutableTreeNode("a2");
        DefaultMutableTreeNode b=new DefaultMutableTreeNode("b");
        DefaultMutableTreeNode b1=new DefaultMutableTreeNode("b1");
        DefaultMutableTreeNode b2=new DefaultMutableTreeNode("b2");
        DefaultMutableTreeNode b3=new DefaultMutableTreeNode("b3");
        tree=new JTree(top);

        top.add(a);
        top.add(b);
        a.add(a1);
        a.add(a2);
        b.add(b1);
        b.add(b2);
        b.add(b3);
        jp.add(tree);
        jsp=new JScrollPane(jp);
        jsp.setPreferredSize(new Dimension(100,100));
        frame.add(jsp);
        jl=new JLabel("Click: ");
        frame.add(jl);

        tree.addTreeExpansionListener(new TreeExpansionListener() {

            @Override
            public void treeExpanded(TreeExpansionEvent event) {
                // TODO Auto-generated method stub
                jl.setText("Expanded: "+tree.getSelectionPath());
            }

            @Override
            public void treeCollapsed(TreeExpansionEvent event) {
                // TODO Auto-generated method stub
                jl.setText("Collapsed: "+tree.getSelectionPath());
            }

        });

        tree.addTreeSelectionListener(new TreeSelectionListener() {

            @Override
            public void valueChanged(TreeSelectionEvent e) {
                // TODO Auto-generated method stub
                jl.setText("Selected: "+tree.getSelectionPath());
            }

        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new jtree();
            }
        });
    }
}



