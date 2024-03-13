package ass3.multithreading;

public class q3 extends Thread{

    public void run(){
        System.out.println("User Thread");
        try{
            Thread.sleep(1000);
        }
        catch(Throwable e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        Thread mainThread=Thread.currentThread();
        q3 q=new q3();

        q.start();
        try{
            Thread.sleep(1000);
            System.out.println("Main Thread");
        }
        catch(Throwable e){
            System.out.println(e);
        }





    }
}
