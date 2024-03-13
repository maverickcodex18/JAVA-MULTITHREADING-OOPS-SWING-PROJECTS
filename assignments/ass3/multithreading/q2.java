package ass3.multithreading;

public class q2 {
    public static void main(String[] args) {
        Thread mainThread=Thread.currentThread();
        System.out.println("Current Name: "+mainThread.getName());
        try{
            for (int i = 5; i >=1; i--) {
                Thread.sleep(1000);
                System.out.println(i);
            }

        }
        catch(Throwable e){
            System.out.println(e);
        }

        mainThread.setName("New Main Name");
        System.out.println("Current Name: "+mainThread.getName());
    }
    }

