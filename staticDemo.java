public class staticDemo {
    public static void main(String[] args) {
        System.out.println("Chitransh Agrawal\n22115026");
        // Calculate electricity bill
        double unitsConsumed = 120;
        double billAmount = calculateElectricityBill(unitsConsumed);
        System.out.println("Electricity Bill: $" + billAmount);

        // Calculate HCF of two numbers
        int num1 = 48;
        int num2 = 36;
        int hcfResult = calculateGCD(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcfResult);

        // Calculate GCD of two numbers
        int gcdResult = calculateGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcdResult);

        // Reverse a string
        String originalString = "Hello, World!";
        String reversedString = reverseString(originalString);
        System.out.println("Reversed String: " + reversedString);

        // Find vowels in a string
        String inputString = "Java Programming";
        findVowels(inputString);
    }

    // Calculate electricity bill using static method
    public static double calculateElectricityBill(double unitsConsumed) {
        double ratePerUnit = 7.5; // Example rate per unit
        return unitsConsumed * ratePerUnit;
    }

    // Calculate HCF of two numbers using static method
    public static int calculateGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return calculateGCD(num2, num1 % num2);
    }

    // Calculate GCD of two numbers using static method


    // Reverse a string using static method
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Find vowels in a string using static method
    public static void findVowels(String str) {
        str = str.toLowerCase(); // Convert to lowercase for case-insensitive check
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;
            }
        }
        System.out.println("Vowel Count in the String: " + vowelCount);
    }
}
