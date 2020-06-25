package com.example.demo.sort;

// O(logn)
public class BinarySearch {

    private static void binarySearch(int key, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start < end) {
            mid = (start + end) / 2;

            if(key == arr[mid]) {
                System.out.println(mid);
                break;
            }

            if(key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        binarySearch(7, arr);
    }
}
