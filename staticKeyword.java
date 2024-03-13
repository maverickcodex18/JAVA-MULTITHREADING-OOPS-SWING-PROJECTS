public class staticKeyword {

    // Static variable
    static int staticVariable = 0;

    // Static block
    static {
        System.out.println("This is a static block.");
        staticVariable = 42;
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        System.out.println("Chitransh Agrawal\n22115026");
        // Accessing the static variable
        System.out.println("Static Variable: " + staticVariable);

        // Calling the static method
        staticMethod();
    }
}
