package javaUtil;

import java.util.*;

public class hashSet {

    static void show(final HashSet<String> hs){
        System.out.println(hs);
    }
    public static void main(String[] args) {
        //defining hastSet

        //due to hashing , ORDER CHANGES
        HashSet<String> hashset=new HashSet<>(Set.of("Hi Man","What","Are ","You","doing"));
        show(hashset);
        hashset.add("Added to last");
        show(hashset);
        System.out.println(hashset.contains("Are "));
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.hashCode());
        System.out.println();
    }
}
