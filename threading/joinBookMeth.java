package threading;

public class joinBookMeth {
    public static void main(String args[]){
        newThread thread1=new newThread("Thread 1");
        newThread thread2=new newThread("Thread 2");
        Thread mainThread=Thread.currentThread();
        thread1.thread.start();
        thread2.thread.start();
        thread2.thread.setPriority(1);


        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(i);

                thread1.thread.join();

                thread2.thread.join();
            }


            //mainThread.join();
        } catch (Exception e) {
            System.out.println("Exception:"+e);
        }
        finally{
            System.out.println("Exiting Main Thread");
        }

    }
}
