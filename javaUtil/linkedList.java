package javaUtil;

import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> ll= new LinkedList<>(List.of("hey","my","boy"));

        //list properties
        ll.add(2,"Adding at index 2");
        System.out.println(ll);
        System.out.println(ll.get(2));
        ll.set(1, "Updated Index 1");
        System.out.println(ll);
        System.out.println(ll.subList(1, 3));
        ll.add("my");
        System.out.println(ll.indexOf("my"));
        System.out.println(ll.lastIndexOf("my"));


        //deque properties(include queue properties)
        System.out.println(ll.peek());
        try {
            System.out.println(ll.element());
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll.offerFirst("Added at Beginning"));
        System.out.println(ll.offerLast("Added at Last"));
        System.out.println(ll);
    }
}
