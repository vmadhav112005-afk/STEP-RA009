/*
 * UseCase13PalindromeCheckerApp
 * Version: 1.0
 * Description: Compare performance of multiple palindrome checking algorithms
 */

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String testString = "A man a plan a canal Panama"; // test input

        System.out.println("=== Performance Comparison of Palindrome Algorithms ===");
        System.out.println("Input String: " + testString + "\n");

        // 1. For-Loop Reverse Method
        long startTime = System.nanoTime();
        boolean result1 = forLoopReverse(testString);
        long endTime = System.nanoTime();
        System.out.println("1. For-Loop Reverse: " + result1 + " | Time: " + (endTime - startTime) + " ns");

        // 2. Stack-Based Method
        startTime = System.nanoTime();
        boolean result2 = stackMethod(testString);
        endTime = System.nanoTime();
        System.out.println("2. Stack-Based: " + result2 + " | Time: " + (endTime - startTime) + " ns");

        // 3. Deque-Based Method
        startTime = System.nanoTime();
        boolean result3 = dequeMethod(testString);
        endTime = System.nanoTime();
        System.out.println("3. Deque-Based: " + result3 + " | Time: " + (endTime - startTime) + " ns");

        // 4. Recursive Method
        String normalized = testString.replaceAll("\\s+", "").toLowerCase();
        startTime = System.nanoTime();
        boolean result4 = recursiveMethod(normalized, 0, normalized.length() - 1);
        endTime = System.nanoTime();
        System.out.println("4. Recursive: " + result4 + " | Time: " + (endTime - startTime) + " ns");
    }

    // For-loop reverse method
    public static boolean forLoopReverse(String str) {
        String normalized = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed += normalized.charAt(i);
        }
        return normalized.equals(reversed);
    }

    // Stack-based method
    public static boolean stackMethod(String str) {
        String normalized = str.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return normalized.equals(reversed);
    }

    // Deque-based method
    public static boolean dequeMethod(String str) {
        String normalized = str.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new LinkedList<>();
        for (char c : normalized.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // Recursive method
    public static boolean recursiveMethod(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return recursiveMethod(str, start + 1, end - 1);
    }
}