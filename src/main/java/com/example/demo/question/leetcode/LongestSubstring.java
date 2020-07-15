package com.example.demo.question.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    private static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int length = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);

            if (map.containsKey(value)) {
                if (map.get(value) >= start) {
                    start = map.get(value) + 1;
                }
            }

            length = Math.max(length, i - start + 1);
            map.put(value, i);
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcdefg"));
    }
}
