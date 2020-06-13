package com.example.demo.structure;

import java.util.EmptyStackException;

public class Stack<T> {

    private int size;

    private Node<T> top;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T item) {
        Node<T> node = new Node<>(item);

        // LIFO

        // |     |
        // |  0  | top
        // |  0  |
        // |  0  |
        node.next = top; // next -> 다음에 나갈것
        top = node;

        size++;
    }

    public T pop() {
        if(top == null) {
            throw new EmptyStackException();
        }

        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public T peek() {
        if(top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}
