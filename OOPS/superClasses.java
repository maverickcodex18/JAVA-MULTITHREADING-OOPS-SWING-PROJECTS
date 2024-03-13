class SuperClass {
    int superField;

    // SuperClass constructor
    SuperClass(int value) {
        this.superField = value;
        System.out.println("SuperClass constructor called.");
    }
}

class SubClass extends SuperClass {
    int subField;

    // SubClass constructor
    SubClass(int superValue, int subValue) {
        super(superValue); // Call the superclass constructor
        this.subField = subValue;
        System.out.println("SubClass constructor called.");
    }

    void displayFields() {
        System.out.println("SuperField: " + superField);
        System.out.println("SubField: " + subField);
    }
}






public class superClasses {
    public static void main(String[] args) {
        System.out.println("Chitransh Agrawal\n22115026");
        SubClass subObj = new SubClass(10, 20);
        subObj.displayFields();
    }

}
