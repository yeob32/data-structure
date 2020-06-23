package com.example.demo.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 3, 8, 1, 2, 7, 5};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
