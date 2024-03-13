package javaUtil;

import java.util.*;

public class linkedHashSet {

    static void show(final LinkedHashSet<String> hs){
        System.out.println(hs);
    }
    public static void main(String[] args) {
        //defining hastSet

        //due to hashing , ORDER REMAINS SAME
        LinkedHashSet<String> hashset=new LinkedHashSet<>(Set.of("Hi Man","What","Are ","You","doing"));

        //Set.of  USES HASHING : THUS CHANGES THE ORDER OF INSERTION HERE ALSO
        show(hashset);
        hashset.add("Added to last");
        hashset.add("Added to last1");
        hashset.add("Added to last2");
        hashset.add("Added to last3");
        show(hashset);
        System.out.println(hashset.contains("Are "));
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.hashCode());
        System.out.println();
    }
}
