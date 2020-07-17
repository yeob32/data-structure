package com.example.demo.question.leetcode;

public class FindMedianSortedArrays {

    /**
     * Example 1:
     * nums1 = [1, 3]
     * nums2 = [2]
     * <p>
     * The median is 2.0
     * <p>
     * Example 2:
     * <p>
     * nums1 = [1, 2]
     * nums2 = [3, 4]
     * <p>
     * The median is (2 + 3)/2 = 2.5
     *
     * @param nums1
     * @param nums2
     * @return
     */
    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        binarySearch(4, nums1);

        return 0;
    }

    private static void binarySearch(int key, int[] nums1) {

        int start = 0;
        int end = nums1.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (key == nums1[mid]) {
                System.out.println(nums1[mid]);
            }

            // 1 2 3 4
            if (nums1[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        binarySearch(4, arr);
    }
}
