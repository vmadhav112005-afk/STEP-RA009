/*
 * UseCase7PalindromeCheckerApp
 * Version: 1.0
 * Description: Optimized Palindrome check using Deque
 */

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "racecar";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into Deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));   // Insert at rear
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
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