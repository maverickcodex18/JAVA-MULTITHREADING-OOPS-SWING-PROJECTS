package PROJECTS;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ticTacToe {



    //declaring everything in Private
    private JFrame frame;
    private CardLayout cardIO;
    private JPanel deck;
    private JPanel cardSelect;
    private JButton o;
    private JButton x;
    private JPanel cardPlay;
    private JPanel cardResult;
    private boolean OTurn;
    private char[] values;
    JLabel result;
    private int count;





    //class cardPlay
    public class classCardPlay implements ActionListener{

        //winning condition
        final boolean gameOver(){
            for (int i = 0; i < 9; i++) {
                System.out.print(i);
                System.out.print(" ");
                System.out.println(values[i]);

            }
            System.out.println();
            //checking for X
            if ((values[0]=='X' && values[4]=='X' && values[8]=='X') ||(values[2]=='X' && values[4]=='X' && values[6]=='X') || (values[0]=='X' && values[1]=='X' && values[2]=='X') || (values[3]=='X' && values[4]=='X' && values[5]=='X') || (values[6]=='X' && values[7]=='X' && values[8]=='X') || (values[0]=='X' && values[3]=='X' && values[6]=='X') || (values[1]=='X' && values[4]=='X' && values[7]=='X') || (values[2]=='X' && values[5]=='X' && values[8]=='X')){
                result.setText("X Won");
                return true;
            }
            else if ((values[0]=='O' && values[4]=='O' && values[8]=='O')||(values[2]=='O' && values[4]=='O' && values[6]=='O') || (values[0]=='O' && values[1]=='O' && values[2]=='O') || (values[3]=='O' && values[4]=='O' && values[5]=='O') || (values[6]=='O' && values[7]=='O' && values[8]=='O') || (values[0]=='O' && values[3]=='O' && values[6]=='O') || (values[1]=='O' && values[4]=='O' && values[7]=='O') || (values[2]=='O' && values[5]=='O' && values[8]=='O')) {
                result.setText("O Won");
                return true;
            }

            return false;
        }


        //constructor
        public classCardPlay(){


            cardPlay=new JPanel();
            cardPlay.setLayout(new FlowLayout());
            deck.add(cardPlay,"cardPlay");
                //grid PlayBoard
                JPanel grid=new JPanel();
                grid.setLayout(new GridLayout(3,3));
                grid.setPreferredSize(new Dimension(600,600));
                cardPlay.add(grid);
                    //adding buttons
                    JButton b1=new JButton("1");
                    JButton b2=new JButton("2");
                    JButton b3=new JButton("3");
                    JButton b4=new JButton("4");
                    JButton b5=new JButton("5");
                    JButton b6=new JButton("6");
                    JButton b7=new JButton("7");
                    JButton b8=new JButton("8");
                    JButton b9=new JButton("9");

                    grid.add(b1);
                    grid.add(b2);
                    grid.add(b3);
                    grid.add(b4);
                    grid.add(b5);
                    grid.add(b6);
                    grid.add(b7);
                    grid.add(b8);
                    grid.add(b9);

                    b1.addActionListener(this);
                    b2.addActionListener(this);
                    b3.addActionListener(this);
                    b4.addActionListener(this);
                    b5.addActionListener(this);
                    b6.addActionListener(this);
                    b7.addActionListener(this);
                    b8.addActionListener(this);
                    b9.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JButton button=(JButton)e.getSource();
            ++count;
            if (OTurn){

                values[Integer.parseInt(button.getText())-1]='O';
                button.setText("O");
                OTurn=false;

            }
            else{

                values[Integer.parseInt(button.getText())-1]='X';
                button.setText("X");
                OTurn=true;

            }

        button.setEnabled(false);
        if (gameOver() || count>=9 ) cardIO.next(deck);
        }

    }




    //constructor
    public ticTacToe(){
        count=0;
        OTurn=true;
        values=new char[9];
        for (int i = 0; i < 9; i++) {
            values[i]='Y';
        }

        //frame preparation
        frame=new JFrame("Tic Tac Toe");
        frame.setSize(900,900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());


        //card layout
        cardIO=new CardLayout();
        deck=new JPanel();
        deck.setLayout(cardIO);
            //creating CardSelect
            cardSelect=new JPanel();
            cardSelect.setLayout(new FlowLayout());
            JLabel select=new JLabel("Select Your Card: O will get First Chance ");
            cardSelect.add(select);
                //adding buttons
                o=new JButton("O");
                o.setBackground(Color.CYAN);
                o.setPreferredSize(new Dimension(200,200));
                cardSelect.add(o);
                x=new JButton("X");
                x.setBackground(Color.GREEN);
                x.setPreferredSize(new Dimension(200,200));
                cardSelect.add(x);
                o.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        cardIO.next(deck);
                    }

                });
                x.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // TODO Auto-generated method stub
                        cardIO.next(deck);
                    }

                });




            //creating cardPlay
            new classCardPlay();





            //creating cardResult
            cardResult=new JPanel();
            cardResult.setLayout(new FlowLayout());
            result=new JLabel();
            result.setText("Match Drawn");
            deck.add(result,"CardResult");






        //adding to deck
        deck.add(cardSelect,"cardSelect");


        //adding to frame
        frame.add(deck);
        cardIO.show(deck, "cardSelect");


    }


    //run
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new ticTacToe();
            }
        });
    }
}
