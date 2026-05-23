/*1.       You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them. We repeatedly make duplicate removals on s until we no longer can. Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
Input: s = "abbaca"
Output: "ca"
*/

//write java code using stack data structure

import java.util.Stack;

public class RemoveSubsequentDuplicateCharacter {
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println("Result: " + removeDuplicates(s));
    }
}