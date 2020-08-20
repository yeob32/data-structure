package com.example.demo.dpattern.observer;

public class User implements Observer {

    @Override
    public void message() {
        System.out.println("ok");
    }
}
