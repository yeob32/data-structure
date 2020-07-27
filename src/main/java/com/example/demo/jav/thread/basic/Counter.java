package com.example.demo.jav.thread.basic;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    private int value;

    public void increase() {
        value += 1;
    }

    public void print() {
        System.out.println(value);
    }

    static class TestRunnable implements Runnable {
        private final Counter counter;
        private final Lock lock;

        public TestRunnable(Counter counter, Lock lock) {
            this.counter = counter;
            this.lock = lock;
        }

        @Override
        public void run() {
            lock.lock();

            try {
                for (int i = 0; i < 10000; i++) {
                    counter.increase();
                }
                counter.print();
            } catch(Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void case1() {
        Counter counter = new Counter();
        Lock lock = new ReentrantLock();
        for (int i = 0; i < 10; i++) {
            new Thread(new TestRunnable(counter, lock)).start();
        }
    }

    public static void main(String[] args) {
        case1();
    }
}
