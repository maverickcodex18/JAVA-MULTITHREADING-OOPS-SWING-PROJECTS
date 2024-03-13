package threading.concurrentAPI.executor;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

//MOST USEFUL FOR DIVIDE AND CONQUER ALGORITHMS
//extends RECURSICETASK(RETURNS) or RECURSIVEACTION(NO RETURN)
//NEED TO DEFINE A THRESHHOLD SO THAT TOO MANY THREADS ARE NOT FORMED

public class forkJoin {

    static private int arr[];

    //calc SUM OF ARRAY using divide and conquer

    static class task extends RecursiveTask<Integer>{
        private int startIndex;
        private int endIndex;

        public task(final int startIndex,final int endIndex){
            this.startIndex=startIndex;
            this.endIndex=endIndex;
        }

        @Override
        protected Integer compute() {
            // TODO Auto-generated method stub

            //defining threshhold
            // if (endIndex-startIndex<100) {
            //     //code here SEE OS CONCEPTS CHAPTER 4


            // }

            //simple threshhold case
            if(startIndex==endIndex) return arr[startIndex];

            //non threshhold case
            int mid=startIndex+(endIndex-startIndex)/2;
            task leftArr=new task(startIndex, mid);
            task rightArr=new task(mid+1, endIndex);
            leftArr.fork();
            rightArr.fork();
            return leftArr.join()+rightArr.join();
        }

    }
    public static void main(String[] args) {
        arr=new int[50000];
        for (int i = 0; i < 50000; i++) {
            arr[i]=i;
        }

        task task1=new task(0, 49999);
        ForkJoinPool pool=new ForkJoinPool();
        int sum=pool.invoke(task1);
        System.out.println(sum);
    }
}
