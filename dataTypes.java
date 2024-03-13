public class dataTypes {
    public static void main(String args[]){
        //INTEGERS
        //use int (don't use byte,short)

        byte sampleByte;
        short sampleShort;
        int sampleInt;
        long sampleLong;
            //INTEGER LITERALS
                //binary
                int binary=0b1101;
                int octal=01774;
                int hexaDecimal=0x377AFC;
                char charSample=56;
                System.out.println("Binary: "+binary);
                System.out.println("octal: "+octal);
                System.out.println("hexaDecimal: "+hexaDecimal);

                //large integers using underscores
                //usefule for identifying TELEPHONE NOS,CUSTOMER IDs
                int large=123_456_789;
                int largeHexa=0xAB_75CC_D;
                System.out.println("LargeNoUsingUnderscores: "+large);
                System.out.println("LargeHexaNoUsingUnderscores: "+largeHexa);

        //decimal
        //float (less precision,less storage consumption)
        //double (more precision,more storage consumption)

        double sampleDouble;
        float sampleFloat;
            //DECIMAL LITERAL
            sampleDouble=1.2E23;
            System.out.println("sampleDouble: "+sampleDouble);

            //hexaDecimal as Decimal
            /*sampleDouble=0xB.EpAC;
            System.out.println("sampleDouble: "+sampleDouble);
            */


        //char
        //2 bit
        // 0 to 65,536
        // subset of INT
        // easily convertible to int (UNICODE)
            char sampleChar;
            sampleChar=89;
            System.out.println("sampleChar: "+sampleChar);
            System.out.println("sampleChar+1: "+(++sampleChar));
            char sampleChar2='a';
            //TypeCast to int
            System.out.println("sampleChar2: "+(int)sampleChar2);
            //octal value in char using \
            // sampleChar2='\141';
            // System.out.println("sampleChar2: "+sampleChar2);

        //boolean
            boolean sampleBool;
            sampleBool=true;


    }
}
