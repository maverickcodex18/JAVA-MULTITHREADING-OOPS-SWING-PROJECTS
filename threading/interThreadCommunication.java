package threading;

class stack{
    private int top;
    public int[] stacked;
    public int size;
    public stack(final int size){
        top=-1;
        this.size=size;
        stacked=new int[size];
    }



    public synchronized final int get(){
        System.out.println(top+" get");
        while(top==-1){
            try{
                wait();
            }
            catch(Throwable e){
                System.out.println("Exception: "+e);
            }
        }
        int val=stacked[top--];
        notify();
        return val;
    }

    public synchronized final void set(final int val){
        System.out.println(top+" set");
        while(top>=size){
            try{
                wait();
            }
            catch(Throwable e){
                System.out.println("Exception: "+e);
            }
        }
        stacked[++top]=val;
        notify();
    }

}


class producer implements Runnable{
    public Thread thread;
    private stack s;
    public producer(final stack s){
        thread=new Thread(this,"Producer");
        System.out.println("Producer Arrived!!");
        this.s=s;
    }

    public void run(){
        //while loop would work best , but it would be an infinite loop and as producer consumer algo is optimized the loop will never end
        for (int i = 0; i < 50; i++) {
            s.set(i);
            System.out.println("Produced: "+i);

        }
    }
}

class consumer implements Runnable{
    Thread thread;
    private stack s;
    public consumer(final stack s){
        thread=new Thread(this,"Consumer");
        System.out.println("Consumers Arrived!!");
        this.s=s;
    }

    public void run(){
        //while loop would work best , but it would be an infinite loop and as producer consumer algo is optimized the loop will never end
        for (int i = 0; i < 50; i++) {
            System.out.println("Consumed: "+ s.get());
        }
    }
}

public class interThreadCommunication {
    //demonstration of PRODUCER CONSUMER
    //usinf STACK DS to implement
    public static void main(String[] args) {
        //size of queue
        int size=10;

        stack s=new stack(size);

        producer p=new producer(s);
        consumer c=new consumer(s);

        p.thread.start();
        c.thread.start();

        try{
            p.thread.join();
            c.thread.join();
        }
        catch(Throwable e){
            System.out.println("Exception: "+e);
        }
    }
}
