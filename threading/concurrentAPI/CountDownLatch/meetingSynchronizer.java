package threading.concurrentAPI.CountDownLatch;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/*
 * Meeting Synchronizer:

Objective:
Design a program that simulates attendees joining and leaving a meeting, using Countdown Latch to coordinate the start and end of the meeting.

Key Components:

Attendee Class:

Define an Attendee class representing individuals participating in the meeting.
Each attendee should have a unique identifier.
Meeting Synchronizer:

Implement a MeetingSynchronizer class responsible for managing the meeting synchronization.
Initialize a Countdown Latch with a count representing the expected number of attendees.
Joining and Leaving:

Simulate attendees joining and leaving the meeting concurrently.
When an attendee joins, decrement the Countdown Latch count. When an attendee leaves, increment the count.
Synchronization:

Use the Countdown Latch to ensure that the Meeting Synchronizer waits for all expected attendees before starting the meeting.
Additionally, use the Countdown Latch to wait for all attendees to leave before ending the meeting.
Meeting Simulation:

Simulate the meeting activities, such as discussions or presentations, after all attendees have joined.
After the meeting activities, wait for all attendees to leave before finalizing the meeting.
 */
public class meetingSynchronizer {

    //define everything here in PRIVATE
    private JLabel attendence;
    private JTextField input;
    private int noOfAttendees;
    private CardLayout cardIO;
    private JPanel deck;
    private JPanel page1;
    private GridBagConstraints gbc;
    private JScrollPane scroll;
    private JButton join;
    private JButton leaveMeeting;
    private JLabel currentAttendence;
    private JLabel currentAttendenceCount;
    private JLabel currentAttendence2;
    private JLabel currentAttendenceCount2;
    private CountDownLatch startMeeting;
    private CountDownLatch exitMeeting;
    private JPanel page2;



    //inner classes
    class meeting implements Runnable{
        private CountDownLatch startMeeting;
        public meeting(final CountDownLatch startMeeting){
            this.startMeeting=startMeeting;
        }
        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                startMeeting.await();
                cardIO.next(deck);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }



    //constructor for UI
    public meetingSynchronizer(){

        //define variables here
        cardIO=new CardLayout();
        deck=new JPanel();
        deck.setLayout(cardIO);
        gbc=new GridBagConstraints();
        scroll=new JScrollPane();
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        page1=new JPanel();
        page1.setLayout(new GridBagLayout());
        page1=new JPanel();
        attendence=new JLabel("No of Attendees");
        input=new JTextField();
        input.setPreferredSize(new Dimension(600,30));
        join=new JButton("Join Meeting");
        join.setEnabled(false);
        leaveMeeting=new JButton("Leave Meeting");
        currentAttendence=new JLabel("Current Attendence: ");
        currentAttendenceCount=new JLabel("0");
        currentAttendence2=new JLabel(" are Attending Meeting");
        currentAttendenceCount2=new JLabel("0");




        //framing
            JFrame frame=new JFrame("Meeting Synchronizer");
            frame.setSize(1000,1000);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

        //page1
        page1.setLayout(new GridBagLayout());
        page1.add(attendence);
        page1.add(input,gbc);
        page1.add(join,gbc);
        page1.add(currentAttendence);
        page1.add(currentAttendenceCount);

        input.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                noOfAttendees=Integer.parseInt(e.getActionCommand());
                startMeeting=new CountDownLatch(noOfAttendees);
                input.setEditable(false);
                join.setEnabled(true);
                currentAttendence2.setText(""+noOfAttendees);

            }

        });

        try{
            startMeeting.await();
            new Thread(new meeting(startMeeting)).start();
        }catch(Throwable t){
            System.out.println(t);
        }



        join.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int attendenceNew=Integer.parseInt(currentAttendenceCount.getText())+1;
                currentAttendenceCount.setText(""+attendenceNew);
                startMeeting.countDown();
            }

        });



        //page 2
        exitMeeting=new CountDownLatch(noOfAttendees);
        page2=new JPanel();
        page2.setLayout(new GridBagLayout());
        page2.add(new JLabel("Started Meeting"),gbc);
        page2.add(leaveMeeting,gbc);
        page2.add(currentAttendenceCount2);
        page2.add(currentAttendence2);
        leaveMeeting.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int attendenceNew=Integer.parseInt(currentAttendenceCount2.getText())-1;
                currentAttendenceCount2.setText(""+attendenceNew);
                exitMeeting.countDown();
            }

        });


        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    exitMeeting.await();
                    cardIO.next(deck);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }

        }).start();
        //page 3
        JPanel page3=new JPanel();
        page3.add(new JLabel("Meeting Ended"));






        //adding to deck
        deck.add(page1);
        deck.add(page2);
        deck.add(page3);

        //adding to scroll
        //scroll.add(deck);

        //adding to frame
        frame.add(deck);

    }



    //main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new meetingSynchronizer();
            }
        });
    }
}
