package com.example.demo.question;

import java.util.Stack;

public class RevereString {

    private static String reverse1(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "abcdefghijkllmn";
        System.out.println(reverse1(str));

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse().toString());

        String str2 = "[{()}]";
        Stack<String> stack = new Stack<>();
        for (int i = str2.length() - 1; i >= 0; i--) {
            stack.push(Character.toString(str2.charAt(i)));
        }

        StringBuilder result = new StringBuilder();
        while (stack.iterator().hasNext()) {
            result.append(stack.pop());
        }

        System.out.println(result.toString().equals(str2));
    }
}
