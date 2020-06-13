package com.example.demo.structure;

import java.util.NoSuchElementException;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;

    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void add(T item) {
        Node<T> node = new Node<>(item);

        // FIFO

        // last     first
        //   -------
        // -> 0 0 0 ->
        //   -------
        if(last != null) {
            last.next = node;
        }
        last = node;

        if(first == null) {
            first = node;
        }

        size++;
    }

    public T remove() {
        if(first == null) {
            throw new NoSuchElementException();
        }

        T item = first.data;
        first = first.next;
        size--;

        return item;
    }

    public T element() {
        if(first == null) {
            throw new NoSuchElementException();
        }

        return first.data;
    }

    public T poll() {
        if(first == null) {
            return null;
        }

        T item = first.data;
        first = first.next;
        size--;

        return item;
    }

    public T peek() {
        if(first == null) {
            return null;
        }

        return first.data;
    }

    public int size() {
        return size;
    }
}
