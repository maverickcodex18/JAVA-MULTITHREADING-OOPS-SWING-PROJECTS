package ass3;

class base{
    base(){
        System.out.println("Base");
    }
}

class child extends base{
    child(){
        super();
        System.out.println("Child");
        System.out.println("Single Level Interitance");
    }
}

class grandChild extends child{
    grandChild(){
        super();
        System.out.println("GrandChild");
        System.out.println("Multi Level Inheritance");
    }
}

class child2 extends base{
    child2(){
        super();
        System.out.println("Child2");
        System.out.println("Hierarchical Inheritance");
    }
}

public class q2 {
    public static void main(String[] args) {
        new grandChild();
        new child2();

    }
}
