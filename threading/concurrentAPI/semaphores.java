package threading.concurrentAPI;

import java.util.concurrent.*;

public class semaphores {
    /*
     * semaphore grants access to CS using counters
     * counter>0 access else no access
     * aquire() :grants access( decrements counter ) else blocks
     * release() :increments counter on coming out of CS
     */

     //CREATE SEMAPHORES ALONG WITH THREADS


    //Crictical Section
    //class
    class cs{
        private static int count=0;
        public static void increase() {
            System.out.println(++count);
        }
        public static void decrease() {
            System.out.println(--count);
        }
    }

    //increment THread
    class increment implements Runnable{

        public Thread thread;
        private Semaphore semaphore;

        public increment(final String name,Semaphore semaphore){
            this.semaphore=semaphore;
            thread=new Thread(this,name);
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println(this.thread.getName()+" Trying to Access CS");
            try{
                semaphore.acquire();
            }
            catch(Throwable e){
                System.out.println(e);
            }

            System.out.println(this.thread.getName()+" Aquired CS");
            cs.increase();
            System.out.println(this.thread.getName()+" Releasing CS");
            semaphore.release();
        }

    }

    class decrement implements Runnable{

        public Thread thread;
        private Semaphore semaphore;

        public decrement(final String name,final Semaphore semaphore){
            this.semaphore=semaphore;
            thread=new Thread(this,name);
        }



        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println(this.thread.getName()+" Trying to Access CS");
            try{
                semaphore.acquire();
            }
            catch(Throwable e){
                System.out.println(e);
            }
            System.out.println(this.thread.getName()+" Aquired CS");
            cs.decrease();
            System.out.println(this.thread.getName()+" Releasing CS");
            semaphore.release();
        }

    }

    //factory function


        public static void main(String[] args) {
            //Semaphores creation
            System.out.println("Shruti Tembhre\n22115089");
            semaphores outerInstance = new semaphores();
            Semaphore semaphore=new Semaphore(1,true);
            //1 means ONLY 1 THREAD CAN ACCESS AT A TIME
            //starting a Thread
            outerInstance.new increment("A", semaphore).thread.start();
            outerInstance.new decrement("B", semaphore).thread.start();

    }





    }
