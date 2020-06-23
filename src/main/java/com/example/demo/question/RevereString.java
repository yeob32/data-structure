package com.example.demo.question;

public class RevereString {

    private static String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "abcdefghijkllmn";
        String reversed = reverse(str);
        System.out.println(reversed);

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse().toString());
    }
}
