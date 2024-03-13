package threading.concurrentAPI.CountDownLatch;
/*
 * Objective:
Create a simple batch job processor that executes multiple jobs concurrently.

Key Components:

Job Class:

Define a Job class that represents a task to be executed.
Each job should have a unique identifier and a defined execution time.
Batch Processor:

Implement a BatchProcessor class responsible for managing and executing multiple jobs.
Initialize a Countdown Latch with the count of jobs to be processed.
Concurrent Execution:

Create multiple instances of the Job class, each representing a task.
Start a thread for each job, and when a job starts, decrement the Countdown Latch count.
Synchronization:

Use the Countdown Latch to ensure that the Batch Processor waits for all jobs to complete before proceeding to the next phase.
Result Reporting:

Once all jobs are completed, generate a report displaying the execution time and status of each job.
 */
import java.util.concurrent.CountDownLatch;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class batchProcessor {
    private JTextField input;
    public int noOfProcesses;
    JPanel outputArea=new JPanel();


    //process class
    class process implements Runnable{
        private int processID;
        private int burstTime;
        private CountDownLatch cdl;

        public process(final int processID,final int burstTime,final CountDownLatch cdl){
            this.processID=processID;
            this.burstTime=burstTime;
            this.cdl=cdl;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                System.out.println("Running: "+this.processID);
                Thread.sleep(burstTime);
                JLabel status=new JLabel("Completed : "+processID);
                GridBagConstraints gbc=new GridBagConstraints();
                gbc.gridwidth=GridBagConstraints.REMAINDER;
                outputArea.add(status,gbc);
                cdl.countDown();
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
        }
    }

    //creating UI
    public batchProcessor(){

        //defining variables
        input=new JTextField();

        JFrame frame=new JFrame();
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        JLabel noOfProcess=new JLabel("Enter No Of Processes ");
        frame.add(noOfProcess);
        GridBagConstraints gbc=new GridBagConstraints();
        gbc.gridwidth=GridBagConstraints.REMAINDER;
        input=new JTextField();
        input.setPreferredSize(new Dimension(300, 30));
        frame.add(input,gbc);


        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                input.setEditable(false);
                noOfProcesses=Integer.parseInt(e.getActionCommand());
                    //CountDownLatch

                CountDownLatch cdl=new CountDownLatch(noOfProcesses);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        for (int i = 1; i <=noOfProcesses; i++) {
                            new Thread(new process(i, i*1000,cdl)).start();
                        }
                    }
                }).start();
                try {
                    cdl.await();
                } catch (Exception er) {
                    // TODO: handle exception
                    System.out.println(er);
                }
                finally{

                    input.setText("");
                    input.setEditable(true);

                }

                }
        });

        outputArea.setLayout(new GridBagLayout());
        JScrollPane scrollPane = new JScrollPane(outputArea);
        frame.add(scrollPane,gbc);






    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                new batchProcessor();
            }

        });
    }
}
