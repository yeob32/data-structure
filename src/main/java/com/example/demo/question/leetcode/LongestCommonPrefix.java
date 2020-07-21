package com.example.demo.question.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

    /**
     * Example 1:
     * <p>
     * Input: ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     * <p>
     * Input: ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length() - 1);
            }
        }

        return pre;
    }

    public static void main(String[] args) {
        System.out.println("flower".indexOf("flight"));
        System.out.println("flower".substring(0, "flower".length() - 1));
        System.out.println(longestCommonPrefix(Arrays.asList("flower", "flight", "flow").toArray(new String[]{})));
    }
}
