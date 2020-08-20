package com.example.demo.sort;

import java.util.Arrays;

public class ReverseSort {

    public static void main(String[] args) {
        int[] arr = {10,2,4, 5, 6,6, 2, 1, 3,7,8,9};

        ReverseBubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        QuickSort.sort(arr);

        ReverseQuickSort.quickSort(arr);
        System.out.println(Arrays.toString(arr));
        QuickSort.sort(arr);

        ReverseMergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static class ReverseBubbleSort {
        private static void sort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    static class ReverseQuickSort {
        public static void quickSort(int[] arr) {
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
                while (arr[start] > pivot) start++;
                while (arr[end] < pivot) end--;

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
    }

    static class ReverseMergeSort {

        public static void mergeSort(int[] arr) {
            int[] temp = new int[arr.length];

            mergeSort(arr, temp, 0, arr.length - 1);
        }

        private static void mergeSort(int[] arr, int[] temp, int start, int end) {
            if (start < end) {
                int mid = (start + end) / 2;

                mergeSort(arr, temp, start, mid);
                mergeSort(arr, temp, mid + 1, end);
                merge(arr, temp, start, mid, end);
            }
        }

        private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
            for (int i = 0; i < end; i++) {
                temp[i] = arr[i];
            }

            int part1 = start;
            int part2 = mid + 1;
            int index = start;

            while (part1 < mid && part2 < end) {
                if (temp[part1] <= temp[part2]) {
                    arr[index] = temp[part1];
                    part1++;
                } else {
                    arr[index] = temp[part2];
                    part2++;
                }

                index++;
            }

            for (int i = start; i < mid - part1; i++) {
                arr[i + index] = arr[i + part1];
            }
        }
    }
}
