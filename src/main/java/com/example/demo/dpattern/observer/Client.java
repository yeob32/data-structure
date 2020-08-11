package com.example.demo.dpattern.observer;

public class Client {

    public static void main(String[] args) {
        User user = new User();

        BookStore bookStore = new BookStore();
        bookStore.subscribe(user);

        bookStore.release();
    }
}
