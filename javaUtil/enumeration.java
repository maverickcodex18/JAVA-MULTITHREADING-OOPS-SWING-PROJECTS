package javaUtil;


import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class enumeration {
    public static void main(String[] args) {
        Enumeration<String> enums=(new Vector<>(List.of("1","2","3")).elements());
        while(enums.hasMoreElements()){
            System.out.println(enums.nextElement());
        }
    }
}
