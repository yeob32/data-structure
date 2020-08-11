package com.example.demo.dpattern.observer;

public class Client {

    public static void main(String[] args) {
        User user = new User();
        User user2 = new User();

        BookStore bookStore = new BookStore();
        bookStore.subscribe(user);
        bookStore.subscribe(user2);

        bookStore.release();

        bookStore.unsubscribe(user2);

        bookStore.release();
    }
}
