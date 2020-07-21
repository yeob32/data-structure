package com.example.demo.question;

import java.util.Stack;

public class RevereString {

    private static String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
//        String str = "abcdefghijkllmn";
//        String reversed = reverse(str);
//        System.out.println(reversed);
//
//        StringBuilder stringBuilder = new StringBuilder(str);
//        System.out.println(stringBuilder.reverse().toString());
        String temp = "[{()}]";

        Stack<String> stack = new Stack<>();
        for (int i = temp.length() - 1; i >= 0; i--) {
            stack.push(Character.toString(temp.charAt(i)));
        }

//        for (int i = 0; i < temp.length(); i++) {
//            stack.push(Character.toString(temp.charAt(i)));
//            System.out.println(temp.charAt(i));
//        }

        StringBuilder result = new StringBuilder();
        while (stack.iterator().hasNext()) {
            result.append(stack.pop());
        }

        System.out.println(result.toString().equals(temp));
    }
}
