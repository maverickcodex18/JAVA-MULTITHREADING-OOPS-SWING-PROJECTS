package threading.concurrentAPI;

import java.util.concurrent.*;

//unbounder buffer

public class producerConsumer {

    //shared data
    class cs{
        static private int size;
        static public int filled=0;

        public cs(final int size){
            this.size=size;
        }
        public static int getSize() {
            return size;
        }
    }

    //producer Thread
    class producer implements Runnable{

        public Thread thread;
        private Semaphore accessToArr;
        private Semaphore noFilledInArr;

        public producer(Semaphore accessToArr,Semaphore noFilledInArr){
            thread=new Thread(this,"Producer");
            this.accessToArr=accessToArr;
            this.noFilledInArr=noFilledInArr;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println(this.thread.getName()+" aquiring CS");
            try{
                while (true) {
                    noFilledInArr.acquire();
                    if (cs.filled>=cs.getSize()){
                        noFilledInArr.release();
                        continue;
                    }

                    ++cs.filled;
                    noFilledInArr.release();
                    //accessible to arr
                    try{
                        accessToArr.acquire();
                    }catch(Throwable t){
                        System.out.println(t);
                    }
                    while(cs.filled==cs.getSize()-1 && accessToArr.availablePermits()==1){
                        System.out.println("Producer trapped");
                        Thread.sleep(500);
                        continue;
                    }
                    System.out.println(this.thread.getName()+" aquired "+ cs.filled);

                    System.out.println(this.thread.getName()+" releasing CS"+cs.filled);
                    accessToArr.release();



                    break;
                }


            }catch(Throwable e){
                System.out.println(e);
            }




            }



        }
    class consumer implements Runnable{

        public Thread thread;
        private Semaphore accessToArr;
        private Semaphore noFilledInArr;

        public consumer(Semaphore accessToArr,Semaphore noFilledInArr){
            thread=new Thread(this,"Consumer");
            this.accessToArr=accessToArr;
            this.noFilledInArr=noFilledInArr;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            System.out.println(this.thread.getName()+" aquiring CS");

            try {
                while (true) {
                   noFilledInArr.acquire();
                   if(cs.filled==0) {
                    noFilledInArr.release();
                    continue;
                   }
                   //accessible to arr
                   --cs.filled;
                   noFilledInArr.release();


                   try{
                        accessToArr.acquire();
                    }
                    catch(Throwable e){
                        System.out.println(e);
                    }
                    while (cs.filled==0 && accessToArr.availablePermits()==1){
                        System.out.println("Consumer Trapped");
                        Thread.sleep(500);
                        continue;
                    }
                    System.out.println(this.thread.getName()+" aquired "+cs.filled);
                    System.out.println(this.thread.getName()+" releasing CS"+cs.filled);
                    accessToArr.release();


                   break;
                }


            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }



                }
            }








    public static void main(String[] args) {
        System.out.println("Shruti Tembhre\n22115089");
        producerConsumer outer=new producerConsumer();
        Semaphore accessToArr=new Semaphore(2,true); //at a time atmost 2 threads can access : 1 producer and 1 consumer
        Semaphore noFilledInArr=new Semaphore(1,true); //this semaphore can be edited by anyone thread at a time
        outer.new cs(3);
        for (int i = 0; i < 4; i++){
            outer.new producer(accessToArr,noFilledInArr).thread.start();
            outer.new consumer(accessToArr,noFilledInArr).thread.start();
            try {
                    Thread.sleep(1100);
                } catch (Exception e) {
                    // TODO: handle exceptions
                    System.out.println(e);
                }
        }


    }

}
