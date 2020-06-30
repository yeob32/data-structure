package com.example.demo.thread.basic3;

public class ThreadJoin {

    public static void main(String[] args) {
        System.out.println("start - " + Thread.currentThread().getName());
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable !!!!");
                m1();
            }

            public void m1() {
                System.out.println("Hello m1 - " + Thread.currentThread().getName());
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end - " + Thread.currentThread().getName());
    }

}
