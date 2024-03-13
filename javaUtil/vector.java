package javaUtil;

import java.util.List;
import java.util.Vector;

public class vector {

    public static void main(String[] args) {
        Vector<String> vec=new Vector<>(List.of("1","2","3"));
    //Legacy functions
        vec.insertElementAt("Added",1);
        System.out.println(vec.contains("1"));
        System.out.println(vec.isEmpty());
        System.out.println(vec.indexOf("2"));
        System.out.println(vec.elementAt(2));

    //array of data
        System.out.println(vec.elements());
        System.out.println(vec.size());
        System.out.println(vec);
    }



}
