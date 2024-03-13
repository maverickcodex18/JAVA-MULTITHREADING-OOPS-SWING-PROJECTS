class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this("John Doe", 30); // Call parameterized constructor with default values
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}









public class constructorChaining {
    public static void main(String[] args) {
            // Create a Person object using the default constructor
            System.out.println("Chitransh Agrawal\n22115026");
            Person person1 = new Person();
            System.out.println("Person 1 (Default Constructor):");
            person1.display();
            System.out.println();

            // Create a Person object using the parameterized constructor
            Person person2 = new Person("Alice Smith", 25);
            System.out.println("Person 2 (Parameterized Constructor):");
            person2.display();
        }
}
