package ass3;

class Employee{
    Employee(){
        System.out.println("Employee");
    }
}


class Engineer extends Employee{
    Engineer(){
        super();
        System.out.println("Engineer");
    }
}

public class q1 {
    public static void main(String[] args) {
        Engineer e=new Engineer();
    }
}
