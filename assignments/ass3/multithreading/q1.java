package ass3.multithreading;

public class q1 {
    public static void main(String[] args) {
        Thread mainThread=Thread.currentThread();
        System.out.println("Current Name: "+mainThread.getName());
        try{
            Thread.sleep(5000);
        }
        catch(Throwable e){
            System.out.println(e);
        }

        mainThread.setName("New Main Name");
        System.out.println("Current Name: "+mainThread.getName());
    }
}
