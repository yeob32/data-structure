package com.example.demo.structure;

public class SinglyLinkedList {

    private int size = 0;

    private Node first;
    private Node last;

    private static class Node {

        private final Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public int size() {
        return size;
    }

    public void add(Object item) {
        Node node = new Node(item);

        if(last != null) {
            last.next = node;
        }

        last = node;

        if(first == null) {
            first = node;
        }

        size++;
    }

    public Object get(int index) {
        if (size == 0 || size <= index) {
            throw new ArrayIndexOutOfBoundsException(String.format("index: %s, size: %s", index, size));
        }

        Node node = first;

        if (index == 0) return node.data;
        if (index == size - 1) return last.data;

        int idx = 1;
        while (node.next != null) {
            node = node.next;
            if (idx == index) {
                break;
            }

            idx++;
        }

        return node.data;
    }

    public void remove(int index) {
        if (size == 0 || size <= index) {
            throw new ArrayIndexOutOfBoundsException(String.format("index: %s, size: %s", index, size));
        }

        Node node = first;

        int idx = 0;
        while (node.next != null) {
            if(idx == index) {
                node.next = node.next.next;
                size--;

                break;
            }

            node = node.next;
            idx++;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
