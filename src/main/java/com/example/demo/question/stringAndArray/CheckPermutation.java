package com.example.demo.question.stringAndArray;

import java.util.Arrays;

// 순열 확인
public class CheckPermutation {

    public static void main(String[] args) {
        String str1 = "abbc";
        String str2 = "cbba";

        System.out.println(permutation(str1, str2));
    }

    private static boolean permutation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }

        return sort(str1).equals(sort(str2));
    }

    private static String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
