package javaUtil;

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueue {
    static public class comparison implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            // TODO Auto-generated method stub
            //sorts in descending order by length
            //positive =>o1
            //negative =>o2
            return (o2.length()-o1.length());

        }

    }
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>(new comparison());
        //do after learning comparator

        pq.offer("milk shake");
        pq.offer("apple");
        pq.offer("banana");

        

        System.out.println(pq);


    }
}
