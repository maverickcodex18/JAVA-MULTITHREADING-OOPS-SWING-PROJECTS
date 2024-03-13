package threading;

public class threadThread extends Thread {
    //constructor
    public threadThread(final String name){
        super(name);
        System.out.println("Thread Created");
    }
    //run
    public void run(){
        try{
            for (int i = 5; i >=0; i--) {
                System.out.println(this.getName()+" : "+i);
                Thread.sleep(1000);
            }
        }
        catch(Throwable e){
            System.out.println("Exception: "+e);
        }
    }

}
