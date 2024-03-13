package javaUtil;

import java.util.*;

public class arrayList {
    //implements List

    public static void main(String[] args) {
        //of static method of List : initialize collections with some data at the time of creation
        ArrayList<String> arr= new ArrayList<String>(List.of("Hey","My","Boy"));
        arr.add("Added1 at Last");
        arr.add(2,"Added at index 2");
        //printing
        System.out.println(arr);

        arr.remove("My");
        System.out.println(arr);

        arr.addAll(2,List.of("Hey","Are","You","OK"));
        System.out.println(arr);

        System.out.println(arr.indexOf("Hey"));
        System.out.println(arr.lastIndexOf("Hey"));

        arr.set(3, "Edited");
        System.out.println(arr.get(3));

        System.out.println(arr.subList(2, 5));
        Collections.sort(arr);
        System.out.println(arr);

        arr.trimToSize();


        //convert to array
        System.out.println("Converting to Array");
        String array[]=new String[arr.size()];
        array=arr.toArray(array);
        for (String string : array) {
            System.out.print(string+",");
        }


    }

}
