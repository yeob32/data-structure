package com.example.demo.question.stringAndArray;

// 문자열 압축
public class CompressStr {

    public static void main(String[] args) {
        String str = "aabccccaaa"; // a2b1c4a3

        StringBuilder stringBuilder = new StringBuilder();

        int compressCount = 0;
        for (int i = 0; i < str.length(); i++) {
            compressCount++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                stringBuilder.append(str.charAt(i));
                stringBuilder.append(compressCount);
                compressCount = 0;
            }
        }

        System.out.println(stringBuilder.toString());
    }
}
