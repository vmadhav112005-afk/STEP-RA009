/*
 * UseCase9PalindromeCheckerApp
 * Version: 1.0
 * Description: Palindrome check using Recursion
 */

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input String : " + input);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }

    // Recursive method
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call (smaller subproblem)
        return checkPalindrome(str, start + 1, end - 1);
    }
}