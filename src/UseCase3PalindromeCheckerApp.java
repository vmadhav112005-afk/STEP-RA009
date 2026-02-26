/*
 * UseCase3PalindromeCheckerApp
 * Version: 1.0
 * Description: Palindrome check using string reverse logic
 */

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String original = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);  // String Concatenation
        }

        // Display reversed string
        System.out.println("Original String : " + original);
        System.out.println("Reversed String : " + reversed);

        // Compare using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

    }
}