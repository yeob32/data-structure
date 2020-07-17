package com.example.demo.question.leetcode;

public class PalindromeNumber {

    /**
     * Example 1:
     * <p>
     * Input: 121
     * Output: true
     * Example 2:
     * <p>
     * Input: -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     * Example 3:
     * <p>
     * Input: 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     *
     * @param x
     * @return
     */
    private static boolean isPalindrome(int x) {
        if(x * -1 > 0) {
            return false;
        }

        int origin = x;
        int res = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            res = (res * 10) + pop;
        }

        return res == origin;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(10));
    }
}
