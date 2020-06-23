package com.example.demo.sort;

import java.util.Arrays;

// 분할정복 알고리즘
// O(NlogN) 최악의 경우 -> O(n^2)
public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);

        if (start < part2 - 1) {
            quickSort(arr, start, part2 - 1);
        }

        if (part2 < end) {
            quickSort(arr, part2, end);
        }

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;

            if (start <= end) {
                swap(arr, start, end);

                start++;
                end--;
            }
        }

        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 3, 8, 1, 2, 7, 5};
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
