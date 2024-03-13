class sample{
    int var1;
    sample(int var1){
        this.var1=var1;
    }
}


public class objects {
    public static void main(String args[]){
        try
        {    //object creation
            sample obj1=new sample(23);
            //referencing
                sample obj2=obj1;
                //obj2 refered to obj1
                System.out.println(obj2.var1);

                //changing value of var1 for both objects
                obj2.var1=1;
                System.out.println(obj1.var1);

            //assignment operator to OBJECTS break the REFERENCING
                obj1=null;
                System.out.println(obj2.var1);
                //System.out.println(obj1.var1);



            }

        catch(Throwable e){
            e.printStackTrace();
        }
    }
}
