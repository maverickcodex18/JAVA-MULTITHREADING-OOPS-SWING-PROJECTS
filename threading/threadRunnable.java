package threading;




public class threadRunnable implements Runnable {
    private Thread thread;

    //creating thread using constructor
    public threadRunnable(final String name){
        thread=new Thread(this,name);
        System.out.println("Thread Created...");
    }

    //run
    public void run(){
        //printing details
        System.out.println("Details: "+thread);

        //sleep
        try{
            for (int i = 5; i >=0; i--) {
                System.out.println(thread.getName()+" : " +i);
                //sleeping for i amount of time
                //NOTE: not sleeping for const amount of Time after every iteration
                Thread.sleep(i);
            }
        }
        catch(Throwable e){
            System.out.println("Exception: "+e);
        }
    }

    //starting thread
    public void start(){
        this.thread.start();
    }

    //joining
    public void join(){
        try{
            this.thread.join();
        }
        catch(Throwable e){
            System.out.println("Exception in Thread Join" + e);
        }
        finally{
            System.out.println(this.thread.getName()+" Completed Executing");
        }

    }

    //Alive state checker
    public boolean isAlive(){
        return this.thread.isAlive();
    }

}
