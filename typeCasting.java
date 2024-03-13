public class typeCasting {
    public static void main(String args[]){
        //automating typeCasting
        //widening typecasting
        // destination type >(size) previous type
        //compatible types(INTEGERS ARE COMPATIBLE with eath other , while FLOATING are compatible with each other)
        byte sampleByte=0x2A;
        int sampleInt=sampleByte; //byte to int
        System.out.println(sampleInt);
        long sampleLong=sampleInt;  //int to long
        System.out.println(sampleLong);



        //Casting
        //Narrow casting
        double sampleDouble=1.2e5;
        sampleInt=(int)sampleDouble;
        System.out.println(sampleInt);

            //char to int and vice versa
        char sampleChar='a';
        sampleInt=(int)sampleChar;
        System.out.println(sampleInt);
        ++sampleInt;
        sampleChar=(char)sampleInt;
        System.out.println(sampleChar);

            //casting compatible types but destination size is less
           // sampleInt=130;
            sampleByte=(byte)sampleInt;
            System.out.println(sampleByte);

            //if size of value during typecasting exceeds the destination type's range
            //use module
            //ans = value%range;
            sampleInt=130; //out of range of byte
            //range of byte=256
            sampleByte=(byte)sampleInt; //ans= 130%256
            System.out.println(sampleByte);





        // // Implicit Typecasting (Widening Conversion)
        // int intValue = 100;
        // double doubleValue = intValue; // Implicitly converts int to double
        // System.out.println("Implicit Typecasting (Widening Conversion):");
        // System.out.println("int value: " + intValue);
        // System.out.println("double value: " + doubleValue);

        // // Explicit Typecasting (Narrowing Conversion)
        // double anotherDoubleValue = 123.456;
        // int anotherIntValue = (int) anotherDoubleValue; // Explicitly converts double to int
        // System.out.println("\nExplicit Typecasting (Narrowing Conversion):");
        // System.out.println("double value: " + anotherDoubleValue);
        // System.out.println("int value: " + anotherIntValue);
    }
    }
