import javax.management.RuntimeErrorException;

public class exceptionHandling {

    //throws
    //without throws , throw cannot generate error from inside the function
    public static void show() throws Throwable{


        //throw new Throwable("Throws");


        // below code will also return the same as above
        //should include either FINALLY or CATCH clause or BOTH else ERROR
        try{
            throw new Throwable("Throws");
        }//catch(Throwable e){}
        finally{
            System.out.println("Throwing throws");
        }
    }


    //finally and return statement relation
    public static Throwable hi() throws Throwable{
        try{
            throw new Throwable("Finally and Return");
        }
        catch(Throwable e){
            return e;
        }
        finally{
            System.out.println("RUN FINALLY CMD EVEN AFTER RETURN STATEMENT WAS ALREADY EXECCUTED");
        }
    }


    public static void main(String args[]){
        //if catch statement do not have any matching exception class
        try{
            //ArithmeticException class will instantiate
            System.out.println(12/0);
        }
        catch(NullPointerException e){
            System.out.println(e);

            /*
             * if exception class inside catch is not matching with exception generated
             * then EXCEPTION WILL TERMINATE THE PROGRAM
             */
        }
        catch(Throwable e){
            //all these fxs are cited in book PG 399-400
            System.out.print("Stack Trace: ");
            e.printStackTrace();    //stack Trace
            System.out.println("getMessage: "+e);  //a type of getMessage
            System.out.println("getMessage: "+e.getMessage()); //getMessage
            System.out.println(e.getLocalizedMessage());    //getMessage
            System.out.println(e.fillInStackTrace());   //a type of getMessage
        }
        System.out.println("Program not terminated yet");

        System.out.println("-------------------------------------");



        //nested try

        try{
                try{
                    System.out.println(2/(1-1));
                }
                catch(NullPointerException e){
                    System.out.println(e);
                }
        }
        catch(Throwable e){
            System.out.println(e);
        }

    System.out.println("-------------------------------------");





        //throw
        // can create NEW THROWABLE OBJECT
        //catch clause should be there, else , terminate the program

        //creating a factorial program
        try{
            int no;
            no=-2;
            if(no<0) throw new Throwable("Negative Number Not Allowed...");
        }
        catch(Throwable e){
            System.out.println(e);
        }
        System.out.println("Program Still Running.....");





        System.out.println("-------------------------------------");

        //always nest METHOD CALLS with try
        try{
            show();
        }
        catch(Throwable e){
            System.out.println(e);
        }





        //FINALLY
        System.out.println("-------------------------------------");

        //always nest METHOD CALLS with try
        try{
            throw hi();
        }
        catch(Throwable e){
            System.out.println(e);
        }


        //chained exception
        // try{
        //     throw new Throwable("Chained Exception", Throwable e);
        // }

    }
}
