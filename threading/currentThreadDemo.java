package threading;

public class currentThreadDemo {
    public static void main(String args[]){
        //getting reference of main thread
        Thread mainThread=Thread.currentThread();
        //displaying details
        //name,priority,name of group
        System.out.println("Main Thread: "+mainThread);
        //changing name
        mainThread.setName("Main Thread");
        //displaying details
        System.out.println("Main Thread: "+mainThread);
        //sleep
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                mainThread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Exception: "+e);
        }
    }
}
