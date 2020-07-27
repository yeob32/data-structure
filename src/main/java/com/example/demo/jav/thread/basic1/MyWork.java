package com.example.demo.jav.thread.basic1;

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

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MyThread("*");
        Thread thread1 = new MyThread("^_^");
        Thread thread2 = new MyThread("!!");
        Thread thread3 = new MyThread("##");

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        thread2.start();

        thread3.start();

        thread2.join();
        thread3.join();

        System.out.println(currentThread().getName() + " - Thread End");
    }
}
