class sample2{
    int var2;
    //constructor overloading
    sample2(){
        var2=0;
    }
    sample2(int var2){
        this.var2=var2;
    }

    //method overloading
    void setVar(){
        var2++;
    }
    void setVar(int var2){
        this.var2=var2;
    }
}

class sample3{
    String name;
    int id;
    sample3(String name,int id){
        System.out.println("Object Created....");
        this.name=name;
        this.id=id;
        System.out.println("Name: "+this.name);
        System.out.println("ID: "+this.id);

    }
}

class bird{
    bird(int i){
        System.out.println("Single Parameter Constructor");
        System.out.println("Piegon");

    }
    bird(int i,int j){
        System.out.println("Double Parameter Constructor");
        System.out.println("Crow");
        System.out.println("Parrot");
    }
}


public class constructorOverloading {
    public static void main(String args[]){
        System.out.println("Chitransh Agrawal");
        System.out.println("22115026");
        // sample2 obj= new sample2();
        // sample2 obj2=new sample2(2);
        // System.out.println(obj.var2);
        // System.out.println(obj2.var2);
        // obj.setVar();
        // obj2.setVar(4);
        // System.out.println(obj.var2);
        // System.out.println(obj2.var2);

        // sample3 obj1=new sample3("Virat Kohli",18);
        // sample3 obj2=new sample3("Rohit Sharma",23);

        bird obj1=new bird(1);
        bird obj2=new bird(1,4);

    }
}
