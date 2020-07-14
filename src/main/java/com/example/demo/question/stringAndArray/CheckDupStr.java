package com.example.demo.question.stringAndArray;

// 중복 문자열 확인
public class CheckDupStr {

    public static void main(String[] args) {
        String str = "hello world!";

        System.out.println(isUniqueStr(str));
    }

    private static boolean isUniqueStr(String str) {
        if(str.length() > 128) { // ascii 는 128개임
            return false;
        }

        boolean[] checker = new boolean[128];

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(checker[ch]) {
                return false;
            }

            checker[ch] = true;
        }

        return true;
    }
}
