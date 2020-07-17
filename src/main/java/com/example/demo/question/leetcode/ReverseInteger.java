package com.example.demo.question.leetcode;

public class ReverseInteger {

    /**
     * Example 1:
     * <p>
     * Input: 123
     * Output: 321
     * Example 2:
     * <p>
     * Input: -123
     * Output: -321
     * Example 3:
     * <p>
     * Input: 120
     * Output: 21
     *
     * @param x
     * @return
     */
    public static int reverse(int x) {
        int rs = 0;
        while(x != 0) {
            int pop = x % 10;
            x /= 10;

            if(Integer.MAX_VALUE/10 < rs || Integer.MIN_VALUE/10 > rs) {
                return 0;
            }

            rs = (rs * 10) + pop;
        }

        return rs;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-120));
    }
}
