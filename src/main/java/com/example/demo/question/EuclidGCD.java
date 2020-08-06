package com.example.demo.question;

/**
 * 2^K+1-1 , O(logN)
 * least[lowest] common multiple
 */
public class EuclidGCD {

    public static void main(String[] args) {
        int n1 = 1024;
        int n2 = 12;

        int r = greatestCommonDenominator(n1, n2);
        System.out.println("gcd : " + r);
        System.out.println("lcm : " + (n1 * n2) / r);
    }

    public static int greatestCommonDenominator(int x, int y) {
        if (y == 0) return x;

        int remainder = x % y;
        return greatestCommonDenominator(y, remainder);
    }
}
