package com.example.demo.sort;

import java.util.stream.IntStream;

// O(logn)
public class BinarySearch {

    private static void binarySearch(int key, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;

            if (key == arr[mid]) {
                System.out.println(arr[mid]);
                break;
            }

            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        binarySearch(42, IntStream.range(0, 100).toArray());
    }
}
