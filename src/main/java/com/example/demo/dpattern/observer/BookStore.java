package com.example.demo.dpattern.observer;

import java.util.ArrayList;

import java.util.List;

public class BookStore implements Observable {

    List<Observer> observers = new ArrayList<>();

    public void release() {
        System.out.println("release new book");

        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::message);
    }
}
