/*
 * UseCase4PalindromeCheckerApp
 * Version: 1.0
 * Description: Palindrome check using Character Array and Two-Pointer Technique
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "radar";

        // Convert String to Character Array
        char[] characters = input.toCharArray();

        // Two-Pointer Variables
        int start = 0;
        int end = characters.length - 1;

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Two-Pointer Comparison
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display Result
        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

    }
}