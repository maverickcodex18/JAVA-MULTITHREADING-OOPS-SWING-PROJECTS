class FinalDemo {
        // Final variable (constant)
        final int constantValue = 10;

        // Final method (cannot be overridden by subclasses)
        final void finalMethod() {
            System.out.println("This is a final method.");
        }
    }

public class finalKeyword {


        public static void main(String[] args) {
            FinalDemo demo = new FinalDemo();
            System.out.println("Chitransh Agrawal\n22115026");
            // Accessing the final variable
            System.out.println("Constant Value: " + demo.constantValue);

            // Calling the final method
            demo.finalMethod();

            // Attempting to modify the final variable (will result in a compilation error)
            // demo.constantValue = 20; // Uncommenting this line will result in a compilation error

            // Attempting to override the final method in a subclass (will result in a compilation error)
            // class Subclass extends FinalDemo {
            //     void finalMethod() {
            //         System.out.println("This is an overridden final method.");
            //     }
            // }
        }
    }
