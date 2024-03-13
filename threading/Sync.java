package threading;



class callMe{

    //not sync
    //for sync2.java keep this NON SYNC

     void call(final String msg){
         System.out.println("[: "+msg);
         try{
             Thread.sleep(1000);
         }catch(Exception e){
             System.out.println(e);
         }
         System.out.println("]");
     }

    //synchronized
    // synchronized void call(final String msg){
    //     System.out.println("[: "+msg);
    //     try{
    //         Thread.sleep(1000);
    //     }catch(Exception e){
    //         System.out.println(e);
    //     }
    //     System.out.println("]");
    // }
}

class caller implements Runnable{
    public callMe target;
    public String msg;
    public Thread thread;
    caller(final callMe target,final String msg){
        this.target=target;
        this.msg=msg;
        thread= new Thread(this);
    }
    //SYNC.JAVA
    // public void run(){
    //     target.call(msg);
    // }

    //SYNC2.JAVA
    public void run(){
        synchronized(target){
            target.call(msg);
        }
    }
}
public class Sync {
    // proram of pg 432 in PDF
    public static void main(String args[]){
        callMe target=new callMe();
        caller caller2=new caller(target, "hey");
        caller caller3=new caller(target, "NONsync");
        caller caller4=new caller(target, "meth");
        caller2.thread.start();
        caller3.thread.start();
        caller4.thread.start();
        try{
            caller2.thread.join();
            caller3.thread.join();
            caller4.thread.join();
        }catch(Exception e){
            System.out.println(e);
        }
    }


}
