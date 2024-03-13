public class operator {
    public static void main(String args[]){
        //operator

        //arithmetic operator
        //can be used for NUMERIC and CHAR(SUBSET OF INT)
        System.out.println("Assignment Operator:");
        char a;
        a='a';
        System.out.println("a+1= "+(char)(a+1));
        System.out.println("a-1= "+(char)(a-1));
        System.out.println("a*120/95= "+(char)(a*120/95));
        System.out.println("a%110= "+(char)(a%110));
        System.out.println("a+=3= "+(char)(a+=3));
        System.out.println("a-=2= "+(char)(a-=2));
        System.out.println("a*=2= "+(char)(a*=2));
        System.out.println("a/=2= "+(char)(a/=2));
        System.out.println("a%=110= "+(char)(a%=110));
        System.out.println("++a= "+(char)(++a));
        System.out.println("a++= "+(char)(a++));
        System.out.println("a--= "+(char)(a--));
        System.out.println("--a= "+(char)(--a));

        System.out.println("Bitwise Operator");
        System.out.println("~a= "+(~a));
        System.out.println("a<<'b'= "+(a<<'b'));
        System.out.println("a>>'b'= "+(a>>'b'));
        System.out.println("a&'b'= "+(a&'b'));
        System.out.println("a&='b'= "+(a&='b'));
        System.out.println("a|'b'= "+(a|'b'));
        System.out.println("a|='b'= "+(a|='b'));
        System.out.println("a>>='b'= "+(a>>='b'));
        System.out.println("a<<='b'= "+(a<<='b'));
        System.out.println("a^='b'= "+(a^='b'));
        System.out.println("a^'b'= "+(a^'b'));

        System.out.println("Relational Operator");
        System.out.println("a==a= "+(a==a));
        System.out.println("a!=a= "+(a!=a));
        System.out.println("a>=a= "+(a>=a));
        System.out.println("a<=a= "+(a<=a));
        System.out.println("a<a= "+(a<a));
        System.out.println("a>a= "+(a>a));
    }
}
