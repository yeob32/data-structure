package com.example.demo.dpattern.observer;

public interface Observable {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
