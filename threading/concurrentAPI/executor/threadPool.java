package threading.concurrentAPI.executor;


//OS CONCEPT


/*
 * Concurrency and Parallelism:

If you have more tasks and threads, and the system has multiple cores, tasks can execute concurrently and potentially in parallel.
In summary, a ThreadPool in Java provides a mechanism for concurrent execution of tasks, and the degree of parallelism depends on factors such as the number of available threads,
 the number of processor cores, and the nature of the tasks.
 */
import java.util.concurrent.*;


class task implements Runnable{
        private int executionTime;
        private int name;
        public task(final int executionTime,final int name){
            this.executionTime=executionTime*1000;
            this.name=name;
        }
        @Override
        public void run() {
            // TODO Auto-generated method stub
            try{
                Thread.sleep(executionTime);
                System.out.println("Completed: "+ name);
            }
            catch(Throwable t){
                System.out.println(t);
            }
        }

    }


public class threadPool {
    //IMPLICIT THREADING



    //we will be running 5 tasks using 3 threads only
    //the 3 threads will be reusable USING THE CONCEPT OF THREADPOOL
    //3 threads will execute first after that 2 remaining ones will execute



    public static void main(String[] args) {
        //creating ThreadPool of Size 3
        ExecutorService es=Executors.newFixedThreadPool(3);

        //creating 5 tasks
        for (int i = 1; i <= 5; i++) {
            es.execute(new task(i,i));
        }

        //after 5 threads end , shutdown will be called after that , not before that
        es.shutdown();

    }
}
