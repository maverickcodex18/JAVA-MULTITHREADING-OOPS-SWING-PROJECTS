package javaUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>(Map.of(1,"1",2,"2",3,"3"));
        //convertingg to collections
        Set<Integer> hs=hm.keySet();
        System.out.println(hs);
        ArrayList<String> al=new ArrayList<>(hm.values());
        System.out.println(al);
        hm.put(4,"4");  //not changes al
        System.out.println(al);
    }

}
