package threading;

class sample implements Runnable{
    public Thread thread;
    public int state; //0: stop , 1: resume , 2: suspend
    public sample(final String name){
        thread=new Thread(this,name);
        state=1;
    }
    synchronized public void pause(){
        state=2;
    }
    synchronized public void resume(){
            state=1;
            notify();
    }
    synchronized public void stop(){
        state=0;
    }
    public void run(){

        synchronized(this){

            for (int i = 0; i < 50000675; i++) {
                try{

                    if (state==0) break ;  //STOPS THE THREAD
                    while(state==2){
                        wait();
                    }
                    System.out.println(state);
                    //Thread.sleep(200);
                }
                catch(Throwable e){
                    System.out.println("Exception: "+e);
                }

                    }

        }

    }
}



public class suspendResumeStop {
    public static void main(String[] args) {
        sample s=new sample("null");

        s.thread.start();

        try{
           // s.thread.join(); //wrtitng it here will pause execution of main and u will not see efect of resume and stop
            s.pause();
            System.out.println("Paused");
            Thread.sleep(3000);
            s.resume();
            System.out.println("Resumed");
            s.stop();
            //System.out.println(s.state);
            System.out.println("Stop");
            //s.thread.join();
        }
        catch(Throwable e){
            System.out.println("Exception: "+e);
        }
    }
}
