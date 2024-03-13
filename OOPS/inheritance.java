class A{
    A(){
        System.out.println("Inside A");
    }
}
class B extends A{
    B(){
        System.out.println("Inside B");
        //if no super() is provided , the subclass construtor will first call the super() and for that we need to provide A() (if free copy is destroyed)
        //constructor calling hierarchy....superclass->subclass
        //if provided, super() should be first line inside subclass constructor
    }
}


public class inheritance {
    public static void main(String[] args){
        B b=new B();
    }
}
