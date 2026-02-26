/*
 * UseCase11PalindromeCheckerApp
 * Version: 1.0
 * Description: Object-Oriented Palindrome Checker using Encapsulation
 */

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Palindrome Checker ==========");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();

        // Create PalindromeChecker object
        PalindromeChecker checker = new PalindromeChecker();

        // Check if palindrome
        boolean result = checker.checkPalindrome(input);

        System.out.println("Input String : " + input);

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        scanner.close();
    }
}

// Encapsulated PalindromeChecker Class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String str) {

        // Normalize string: ignore spaces and case
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // Two-pointer technique
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}