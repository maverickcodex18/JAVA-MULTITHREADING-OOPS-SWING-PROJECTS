package javaUtil;

import java.util.Comparator;

public class comparator {

    static public class comparison implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            // TODO Auto-generated method stub
            //returns smaller Value
            return (o1>o2)?o2:o1;
        }

    }
    public static void main(String[] args) {
        //applyig to Collections Types
            //neeeds to deffine custom class which implements Comparator
            //see codes of
                //PRIORITY QUEUE


        //applying to Custom Types
            //overrides the methods of Comparator
            System.out.println((new comparison()).compare(23,55));


    }
}
