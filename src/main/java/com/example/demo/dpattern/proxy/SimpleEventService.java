package com.example.demo.dpattern.proxy;

public class SimpleEventService implements EventService {

    @Override
    public void add() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("execute add !");
    }

    @Override
    public void delete() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("execute delete !");
    }
}
