/*
 * UseCase6PalindromeCheckerApp
 * Version: 1.0
 * Description: Palindrome check using both Queue (FIFO) and Stack (LIFO)
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "level";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue operation
            stack.push(ch);    // Push operation
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare dequeue (FIFO) with pop (LIFO)
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue operation
            char fromStack = stack.pop();     // Pop operation

            if (fromQueue != fromStack) {
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