package threading.concurrentAPI.CountDownLatch;

import java.util.concurrent.CountDownLatch;

import threading.factory;

public class concept {
    //can stop execution of thread until current thread(s) completes

    /*
     * ~ .join() but some differences
     * 1. .join() pauses execution unto called thread terminates, wheares , .await() pauses execution unto count=0 even tthough the called thread doesn't terminated
     */
    public static void main(String[] args) {
        CountDownLatch cdl=new CountDownLatch(4);   //4 count
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try{
                    System.out.println("Running Thread");
                    for (int i = 0; i < 4; i++) {
                        System.out.println(i);
                        cdl.countDown();
                    }
                    System.out.println("Exiting Thread");
                }catch(Throwable t){
                    System.out.println(t);
                }

            }

        }).start();

        try {
            cdl.await();
            System.out.println("Running Main Thread");
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
