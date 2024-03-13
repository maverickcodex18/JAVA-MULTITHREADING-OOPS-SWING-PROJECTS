package javaUtil;

import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<String> treeset=new TreeSet<>(Set.of("Implements","Set","SortedSet","NavigationSet"));

        //sortedset
        System.out.println(treeset);
        System.out.println(treeset.first());
        System.out.println(treeset.last());
        System.out.println(treeset.subSet("Set",true, "SortedSet",true));

        //navigationset
        System.out.println(treeset.subSet("Set", true, "SortedSet", true));
        System.out.println(treeset.ceiling("Set"));
        System.out.println(treeset.floor("Set"));
        System.out.println(treeset.ceiling("Sor"));
        System.out.println(treeset.floor("Se"));
        System.out.println(treeset.higher("Set"));
        System.out.println(treeset.lower("Set"));
        System.out.println(treeset.pollFirst());
        System.out.println(treeset.pollLast());
    }
}
