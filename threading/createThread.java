package threading;

class newThread implements Runnable{
    public Thread thread;
    public newThread(final String name){
        thread= new Thread(this,name);
        System.out.println("Thread Created");
    }
    public void run(){
        System.out.println("Deatils of Thread: "+this.thread);

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread: "+this.thread.getName()+": "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Interruption: "+e);
        }
    }
}



class newThreadClass extends Thread{
    public newThreadClass(final String name){
        super(name);
        System.out.println("Thread Created Using Thread");
        System.out.println("Deatils of Thread: "+this);
    }
    public void run(){

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("Child Thread "+this.getName()+": "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println("Interruption: "+e);
        }

    }
}



public class createThread {
    public static void main(String args[]){
        newThread thread1=new newThread("Thread 1");
        thread1.thread.start();

        newThreadClass thread2=new newThreadClass("Thread 2");
        thread2.start();
        newThread thread3=new newThread("Thread 3");
        thread3.thread.start();
        Thread mainThread=Thread.currentThread();

        /*
         * MAIN THREAD AND CHILD THREAD RUNS CONCURRENTLY: SINGLE CORE SYSTEM
         */

        try{for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: "+i);
            Thread.sleep(1000);
        }}
        catch(Exception e){
            System.out.println("Interruption: "+e);
        }
    }
}
