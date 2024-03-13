package threading.concurrentAPI;

import java.util.concurrent.*;



public class petersonAlgorithm {
    //2 processes only
    //implicit threading
    public static Semaphore semaphore;

    static class runnableObject implements Runnable{
        public String name;
        public runnableObject(final String name){
            this.name=name;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            criticalSection(name);
        }

    }
    public static void criticalSection(final String name){
        try {
            semaphore.acquire();
            System.out.println(name+" Aquired");

        } catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            semaphore.release();
            /*
             * The usage of the semaphore in the criticalSection method seems incorrect. The release statement should be placed outside the try block in a finally block to ensure that the semaphore is released even if an exception occurs.
             */
        }

    }
    public static void main(String[] args) {
        semaphore = new Semaphore(1,true);  //true=> Waited Bounding
        //1 thread at a time => mutual exclusion
        ExecutorService pool=Executors.newFixedThreadPool(2);    //2 threads will carry 2 processes
        //creating 2 threads
        runnableObject a=new runnableObject("a");
        runnableObject b=new runnableObject("b");

        //executing in loop
        for(int i=0;i<=100;i++){
            pool.execute(a);
            pool.execute(b);
        }
        pool.shutdown();




    }
}
