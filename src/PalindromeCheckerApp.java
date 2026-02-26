/*
 * UseCase5PalindromeCheckerApp
 * Version: 1.0
 * Description: Palindrome check using Stack (LIFO principle)
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "madam";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));   // Push Operation
        }

        // Variable to store reversed string
        String reversed = "";

        // Pop characters from stack (LIFO order)
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();   // Pop Operation
        }

        // Display strings
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

    }
}