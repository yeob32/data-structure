package com.example.demo.question.t1;

import java.util.Arrays;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(75, 11, 100, 36, 66, 76);

        int[] temp = new int[100];
        for (int i = 0; i < ints.size(); i++) {
            int score = ints.get(i);

            int result = 1;
            for (int j = score - 1; j < temp.length; j++) {
                result += temp[j];
            }

            temp[score - 1] = temp[score - 1] + 1;

            System.out.println("score : " + result + "등");
        }
    }
}
