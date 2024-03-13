package threading.concurrentAPI.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.*;

public class intro {

    static void criticalSection(final String name,ReentrantLock locker){
        try {
            Thread.sleep(3);
        } catch (Exception e) {
            // TODO: handle exception
        }

        locker.lock();
        System.out.println(name+" :locked");
        System.out.println(name+" :releasing");
        locker.unlock();
    }
    public static void main(String[] args) {
        ReentrantLock locker=new ReentrantLock();
        ExecutorService es=Executors.newFixedThreadPool(2);
        es.execute(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                criticalSection("a",locker);
            }

        });
        es.execute(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                criticalSection("b",locker);
            }

        });
        es.shutdown();
    }
}
