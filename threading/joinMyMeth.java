package threading;




public class joinMyMeth {
    public static void main(String[] args) {

        //Reference of current thread
        Thread mainThread=Thread.currentThread();


        //creating threads
        threadRunnable thread1=new threadRunnable("Thread1");
        threadRunnable thread2=new threadRunnable("Thread2");
        threadRunnable thread3=new threadRunnable("Thread3");



        //starting the threads

            //NOTE: actual syntax THREADNAME.THREAD.START() but as i declared thread as PRIVATE in THREADRUNNABLE do i have to declare a new function start() in that class , which will automatically call THREADNAME.THREAD.START()
        thread1.start();
        thread2.start();
        thread3.start();



        //join method
            //NOTE: SYNTAX IS DIFFERENT AS I HAVE DECLARED ACTUAL THREADNAME.THREAD.JOIN() inside the CLASS THREADRUNNABLE's JOIN()

        thread1.join();
        thread2.join();
        thread3.join();
        // As below loop is inside MAIN THREAD and it is not executing unto all 3 threads are DEAD => using above method MAIN THREAD IS THE ONLY THREAD SUSPENDING
        for (int i=0;i<5;i++){
            System.out.println(i);

        }




        //active state
        if (!thread1.isAlive()) System.out.println("Thread1 Dead");
        if (!thread2.isAlive()) System.out.println("Thread 2 Dead");
        if (!thread3.isAlive()) System.out.println("Thread3 Dead");
        if (mainThread.isAlive()) System.out.println("Main Thread Active");



    }
}
