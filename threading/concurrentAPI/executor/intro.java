package threading.concurrentAPI.executor;
import java.util.concurrent.*;
public class intro {

    static class mythread implements Runnable{
        CountDownLatch cdl;
        String name;
        public mythread(CountDownLatch cdl,final String str){
            this.cdl=cdl;
            name=str;
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            for (int i = 0; i < 3; i++) {
                System.out.println(name+" : "+i);
                cdl.countDown();
            }
        }

    }
    public static void main(String[] args) {
        //executor service
        //PG: 1440
        ExecutorService es=Executors.newFixedThreadPool(2);
        CountDownLatch cdl=new CountDownLatch(3);
        CountDownLatch cdl1=new CountDownLatch(3);
        CountDownLatch cdl2=new CountDownLatch(3);
        CountDownLatch cdl3=new CountDownLatch(3);

        es.execute(new mythread(cdl,"A"));
        es.execute(new mythread(cdl1,"B"));
        es.execute(new mythread(cdl2,"C"));
        es.execute(new mythread(cdl3,"D"));

        try{
            cdl.await();
            cdl1.await();
            cdl2.await();
            cdl3.await();
        }
        catch(Throwable e){
            System.out.println(e);
        }
        es.shutdown();
        System.out.println("Ending");
        }
    }
