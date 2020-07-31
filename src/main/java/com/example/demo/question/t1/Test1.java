package com.example.demo.question.t1;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        String a = "abc";
        String b = "abb";
        String c = "acb";

        String[] arrA = a.split("");
        Arrays.sort(arrA);
        String[] arrB = b.split("");
        Arrays.sort(arrB);
        String[] arrC = c.split("");
        Arrays.sort(arrC);
    }
}
