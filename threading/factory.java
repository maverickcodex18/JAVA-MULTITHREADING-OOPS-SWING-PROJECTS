package threading;

public class factory {

    //static
    //return thread
    public static Thread factoryMeth(){
        Thread thread=new Thread();
        thread.start();
        return thread;
    }

    public static void main(String[] args) {
        Thread myThread=factory.factoryMeth();
        
    }
}
