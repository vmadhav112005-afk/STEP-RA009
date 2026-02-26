/*
 * UseCase10PalindromeCheckerApp
 * Version: 1.0
 * Description: Palindrome check ignoring spaces and case
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Normalize string: remove spaces and convert to lower case
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse string using previous logic (for loop)
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }

        // Display original and normalized
        System.out.println("Original String   : " + input);
        System.out.println("Normalized String : " + normalized);
        System.out.println("Reversed String   : " + reversed);

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

    }
}