package javaUtil;


import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();    //only default constructor allowed
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
