package com.example.demo.question;

// 12 - 1,2,3,4,6,12
public class Aliquot {

    public static void main(String[] args) {
        int n = 5;
        int half = n / 2;
        int result = n;
        for (int i = 1; i <= half; i++) {
            if (n % i == 0) {
                result += i;
            }
        }

        System.out.println(result);
    }
}
