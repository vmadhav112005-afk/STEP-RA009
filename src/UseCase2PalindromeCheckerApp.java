/*
 * UseCase2PalindromeCheckerApp
 * Version: 1.0
 * Description: Checks whether a hardcoded string is a palindrome
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded String Literal
        String word = "madam";

        // Reverse the string
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Check if palindrome using if-else
        if (word.equals(reversedWord)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program exits
    }
}