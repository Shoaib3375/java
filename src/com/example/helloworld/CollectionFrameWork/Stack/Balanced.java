package com.example.helloworld.CollectionFrameWork.Stack;

import java.util.Scanner;
import java.util.Stack;
public class Balanced {
    public static String isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return "No";
            }
        }
        return stack.isEmpty() ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            String string = scanner.nextLine().trim();
            String result = isCorrect(string);
            System.out.println(result);
        }
    }
}
