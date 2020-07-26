package com.example.demo.thread.basic1;

import java.util.stream.IntStream;

public class MyWork extends Thread {

    static class MyThread extends Thread {

        String str;

        public MyThread(String str) {
            this.str = str;
        }

        @Override
        public void run() {
            IntStream.range(0, 5).forEach(i -> {
                System.out.println(currentThread().getName() + " - " + str);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    public static void main(String[] args) {
        Thread thread = new MyThread("*");
        Thread thread1 = new MyThread("^_^");
        Thread thread2 = new MyThread("!!");

        thread.start();
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(currentThread().getName() + " - Thread End");
    }
}
