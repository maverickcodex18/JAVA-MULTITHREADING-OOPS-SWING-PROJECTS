package threading.concurrentAPI;

import java.util.concurrent.*;

public class bakeryAlgorithm {
    //2 processes only
    //implicit threading
    public static Semaphore semaphore;

    static class runnableObject implements Runnable{
        public int name;
        public runnableObject(final int name){
            this.name=name;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            criticalSection(name);
        }

    }
    public static void criticalSection(final int name){
        try {


            Thread.sleep(2);  //added sleep to add variations in output


            semaphore.acquire();
            System.out.println(name+" Aquired");

        } catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            System.out.println(name+" Released");
            semaphore.release();
            /*
             * The usage of the semaphore in the criticalSection method seems incorrect. The release statement should be placed outside the try block in a finally block to ensure that the semaphore is released even if an exception occurs.
             */
        }

    }
    public static void main(String[] args) {
        semaphore = new Semaphore(1,true);  //true=> Waited Bounding
        //1 thread at a time => mutual exclusion

        //NOTHING NEW JUST MODIFIED PETERSON ALGORITHM
        ExecutorService pool=Executors.newFixedThreadPool(2);    //2 threads will carry 2 processes

        //executing in loop
        for(int i=0;i<=100;i++){
            pool.execute(new runnableObject(i));
        }
        pool.shutdown();




    }
}
