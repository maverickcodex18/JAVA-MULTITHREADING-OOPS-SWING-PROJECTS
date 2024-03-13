package threading;

class stack2{
    public int size;
    public int top;
    public int[] stacked;

    public stack2(final int size){
        this.size=size;
        top=-1;
        stacked=new int[size];
    }

    public synchronized void suspend(){
        try{
            wait();
        }
        catch(Throwable e){
            System.out.println("Exception: "+e);
        }
    }

    public synchronized void resume(){
        notify();
    }
    public synchronized void set(final int i){
        while(top>=size) {
            suspend();
        }
        stacked[++top] =i;
        resume();
    }

    public synchronized int get(){
        while(top==-1){
            suspend();
        }
        if (top<size) resume();
        return stacked[top--];
    }

}


class producer2 implements Runnable{
    public Thread thread;
    private stack2 s;
    public producer2(final stack2 s){
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

class consumer2 implements Runnable{
    Thread thread;
    private stack2 s;
    public consumer2(final stack2 s){
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




public class interThreadCommunication2 {

    //USING SUSPEND RESUME IDEA

    public static void main(String[] args) {
        //size of queue
        int size=10;

        stack2 s=new stack2(size);

        producer2 p=new producer2(s);
        consumer2 c=new consumer2(s);

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
