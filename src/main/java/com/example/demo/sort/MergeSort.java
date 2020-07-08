package com.example.demo.sort;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];

        mergeSort(temp, arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] temp, int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(temp, arr, start, mid);
            mergeSort(temp, arr, mid + 1, end);
            merge(temp, arr, start, mid, end);
        }
    }

    private static void merge(int[] temp, int[] arr, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            temp[i] = arr[i];
        }

        int part1 = start;
        int part2 = mid + 1;
        int index = start;

        while (part1 <= mid && part2 <= end) {
            if (temp[part1] <= temp[part2]) {
                arr[index] = temp[part1];
                part1++;
            } else {
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }

        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = temp[part1 + i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 9, 6, 4, 5, 3, 1, 2, 8};

        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
