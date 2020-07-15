package com.example.demo.question.leetcode;

public class AddToNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d = new ListNode(0);
        ListNode head = d;

        int sum = 0;
        while (l1 != null || l2 != null) {
            sum = sum / 10;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int value = sum % 10;
            d.next = new ListNode(value);
            d = d.next;

            if (sum / 10 == 1) {
                d.next = new ListNode(1);
            }
        }

        return head.next;
    }
}
