public class string {
    public static void main(String[] args) {
        // Creating Strings
        String str1 = "Hello, World!";
        String str2 = new String("Java is great!");

        // String Concatenation
        String greeting = "Hello";
        String name = "Alice";
        String message = greeting + ", " + name;
        String result = greeting.concat(", ").concat(name);

        // String Length
        String text = "Java Programming";
        int length = text.length();

        // Accessing Characters
        char firstChar = str1.charAt(0);

        // String Comparison
        String s1 = "apple";
        String s2 = "banana";
        boolean isEqual = s1.equals(s2);
        int compareResult = s1.compareTo(s2);

        // Substrings
        String fullString = "This is a sample text";
        String subString = fullString.substring(5, 12);

        // String Modification (Immutable)
        String original = "Hello";
        String modified = original.concat(", World!");

        // String Formatting
        String formatted = String.format("Hello, %s!", "John");

        // Printing Results
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("message: " + message);
        System.out.println("result: " + result);
        System.out.println("Length of 'text': " + length);
        System.out.println("First character of 'str1': " + firstChar);
        System.out.println("Are 's1' and 's2' equal? " + isEqual);
        System.out.println("Compare 's1' and 's2': " + compareResult);
        System.out.println("Substring: " + subString);
        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);
        System.out.println("Formatted: " + formatted);
    }
}
