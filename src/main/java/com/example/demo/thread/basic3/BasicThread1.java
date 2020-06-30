package com.example.demo.thread.basic3;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class BasicThread1 {

    public static void main(String[] args) {
        new MyThread();
    }

    static class MyThread extends Thread {

        int count;

        @Override
        public void run() {
            IntStream.range(0, 5).forEach(i -> {
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                count++;

                System.out.println("count : " + count);
            });
        }

        public MyThread() {
            this.start();

            try {
//                Thread.sleep(3000);
                this.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("then count : "+ count);
        }
    }
}
