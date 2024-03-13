package threading;

class callme{
    //not synced
    public void call(final String msg){
        System.out.println('['+msg);
        try{
            Thread.sleep(1000);
        }
        catch(Throwable e){
            System.out.println("exception: "+e);
        }
        System.out.println("]\n");
    }

    //synced
    // public synchronized void call(final String msg){
    //     System.out.println('['+msg);
    //     try{
    //         Thread.sleep(1000);
    //     }
    //     catch(Throwable e){
    //         System.out.println("exception: "+e);
    //     }
    //     System.out.println("]\n");
    // }
}

class Caller implements Runnable
{
    public Thread thread;
    private callme target;
    private String msg;
    public Caller(callme target,String msg){
        thread = new Thread(this);
        this.msg=msg;
        this.target=target;
    }

    public void run(){
        synchronized(this.target){
            this.target.call(this.msg);
        }

    }

}

public class sync1 {
    public static void main(String[] args) {
        callme target=new callme();
        Caller n1=new Caller(target, "CWC");
        Caller n2=new Caller(target, "2023");
        Caller n3=new Caller(target, "India");


        n1.thread.start();
        n2.thread.start();
        n3.thread.start();

        try{
            n1.thread.join();
            n2.thread.join();
            n3.thread.join();
        }
        catch(Throwable e){
            System.out.println("Exception: "+e);
        }

    }
}
