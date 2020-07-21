package com.example.demo.dpattern.proxy;

public class SimpleEvent implements Event {

    @Override
    public void process() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        work1();
        work2();

        System.out.println("execute process !");
    }

    private void work1() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("work1 !");
    }

    private void work2() {
        System.out.println("work2 !");
    }

    public boolean enable() {
        return true;
    }
}
