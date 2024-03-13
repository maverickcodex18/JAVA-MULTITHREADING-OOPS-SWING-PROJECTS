package javaUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class iteratorListIterator {
    public static void main(String[] args) {
        //ListIterator is better and implements Iterator : bidirectional + EDITABLE
        //iterator: fromstart to end and REMOVING

        //creating ArrayList
        ArrayList<String> al=new ArrayList<>(List.of("1","2","3","4","5","6"));


        //using Iterator
        Iterator<String> iterator=al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            //removing ALWAYS USE AFTER CALLING NEXT or PREVIOUS
            iterator.remove();
        }


         //adding elements
        for(int i=0;i<10;i++){
            al.add(Integer.toString(i));    //do not write any loop after creating object of Iterators, gives ConcurrentmodificationException
        }


        //using ListIterator
        ListIterator<String> ll=al.listIterator();

        while(ll.hasNext()){
            System.out.println(ll.next()+" ");
            ll.set("null");
        }
        //editing elements in reverse iteration
        while(ll.hasPrevious()){
            System.out.println(ll.previous());
            //deleting
            ll.remove();
        }



        //for each
        System.out.println("For-Each Loop");
        for(String i:al){
            System.out.println(i);
        }


}
}
