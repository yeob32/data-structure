package com.example.demo.jav.thread.basic5;

import java.util.stream.IntStream;

public class Deamon implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("demon start");

            IntStream.range(0, 5).forEach(i -> {

//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                System.out.println("i >> " + i);
            });
        }
    }

    public static void main(String[] args) {
        System.out.println("main start");

        Thread thread = new Thread(new Deamon());
        thread.setDaemon(true);
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main end");
    }
}
