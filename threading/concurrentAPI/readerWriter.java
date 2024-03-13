package threading.concurrentAPI;

import java.util.concurrent.*;

public class readerWriter {

    static public Semaphore writerAquired;
    static public int noOfReaders=0;
    static public Semaphore reader;


    static class cs{

    }

    static class reader implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            while (writerAquired.availablePermits()==0){
                continue;
            }
            try {
                    reader.acquire();
                    ++noOfReaders;
                    reader.release();
                    System.out.println("Reader: "+noOfReaders);
                    Thread.sleep(200);
                    reader.acquire();
                    --noOfReaders;
                    reader.release();
                } catch (Exception e) {
                    // TODO: handle exception
                }

        }

    }

    static class writer implements Runnable{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            try {
                writerAquired.acquire();
                while(noOfReaders!=0){
                    System.out.println("Writer Waiting: "+noOfReaders);
                    Thread.sleep(500);
                    continue;
                }
                Thread.sleep(1000);
                System.out.println("Writer Removed");
                writerAquired.release();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Shruti Tembhre\n22115089");
        writerAquired= new Semaphore(1);
        reader=new Semaphore(1);
        int noOfWriters=3;
        ExecutorService threads=Executors.newFixedThreadPool(2);
        for (int i = 0; i < 10; i++) {
            threads.execute(new reader());
            if (0<noOfWriters--){
                threads.execute(new writer());
            }



        }

        threads.shutdown();
    }
}
