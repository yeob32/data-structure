package com.example.demo.dpattern.delegate;

public class Client {
    public static void main(String[] args) {
        Cat cat = new Cat(new MeowSound());
        cat.sound();

        cat.setSoundBehaviour(new RoarSound());
        cat.sound();
    }
}
