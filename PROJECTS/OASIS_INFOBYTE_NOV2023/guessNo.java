package PROJECTS.OASIS_INFOBYTE_NOV2023;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class guessNo {

    //everyting Defined here in PRIVATE
    private CardLayout cardIO;
    private JPanel deckOfCards;
    private JPanel inputPage;
    private JTextField minValue;
    private int minRange;
    private JTextField maxValue;
    private int maxRange;
    private int randomNumber;
    private JTextField guess;
    private int guessedNumber;

    public guessNo(){

        //defining JFrame
        JFrame frame=new JFrame("Guess The Number");
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //defining CardLayout
        cardIO=new CardLayout();
        deckOfCards=new JPanel();
        deckOfCards.setLayout(cardIO);

    //creating 1st Page (INPUT)

        //setting variables
        maxValue=new JTextField();
        maxValue.setEditable(false);
        guess=new JTextField();
        guess.setEditable(false);




        inputPage=new JPanel();
        inputPage.setBackground(Color.PINK);
        inputPage.setLayout(new GridBagLayout());
        GridBagConstraints constraints=new GridBagConstraints();
        JLabel range=new JLabel("Enter Range of Guess");
        constraints.gridwidth=GridBagConstraints.REMAINDER;
        inputPage.add(range,constraints);

        JLabel minL=new JLabel("Minimum: ");
        inputPage.add(minL);
        minValue=new JTextField();
        minValue.setBackground(Color.ORANGE);
        minValue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                minRange=Integer.parseInt(e.getActionCommand());
                System.out.println("MinRange: "+minRange);
                minValue.setEditable(false);
                minValue.setBackground(Color.GRAY);
                maxValue.setEditable(true);

            }

        });
        minValue.setPreferredSize(new Dimension(500,20));
        inputPage.add(minValue,constraints);


        JLabel maxL=new JLabel("Maximum: ");
        maxValue.setBackground(Color.ORANGE);
        JLabel error=new JLabel();
        error.setForeground(Color.RED);
        inputPage.add(maxL);
        maxValue.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //maxRange>=minRange
                int currValue=Integer.parseInt(e.getActionCommand());
                if (currValue>=minRange){
                    error.setText("");
                    maxRange=currValue;
                    System.out.println("MaxRange: "+maxRange);
                    maxValue.setBackground(Color.GRAY);
                    maxValue.setEditable(false);
                    guess.setEditable(true);


                    //generate RANDOM NUMBER

                    Random random=new Random();
                    randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                    System.out.println("CPU NUMBER: "+randomNumber);

                }else{
                    error.setText("ERROR: MAXIMUM < MINIMUM");
                }



            }

        });
        maxValue.setPreferredSize(new Dimension(500,20));
        inputPage.add(maxL);
        inputPage.add(maxValue,constraints);
        inputPage.add(error,constraints);





        JLabel input=new JLabel("Guess The Number: ");
        inputPage.add(input);
        inputPage.add(guess, constraints);
        guess.setPreferredSize(new Dimension(500,20));
        guess.setBackground(Color.ORANGE);
        guess.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                guessedNumber=Integer.parseInt(e.getActionCommand());
                System.out.println("GUESS: "+guessedNumber);
                guess.setBackground(Color.GRAY);
                guess.setEditable(false);


                //SHOWING RESULT


                JLabel CPU=new JLabel("CPU's Random Number: "+randomNumber);

                inputPage.add(CPU,constraints);

                JLabel result=new JLabel();
                result.setForeground(Color.MAGENTA);
                inputPage.add(result,constraints);
                if (guessedNumber==randomNumber) result.setText("YAY! YOU GUESSED IT RIGHT");
                else result.setText("OOPS! YOU GUESSED IT WRONG");
            }

        });









    //adding to deckOFCards
        deckOfCards.add(inputPage,"inputPage");

    //adding to JFrame
        frame.add(deckOfCards,BorderLayout.CENTER);



    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                new guessNo();
            }

        });
    }
}
