package com.example.demo.jav.semaphore.boundedSemaphore;

public class BoundedSemaphore {

    private int signals = 0;
    private final int bound;

    public BoundedSemaphore(int bound) {
        this.bound = bound;
    }

    public synchronized void take() {
        this.signals++;
        notify();
    }

    public synchronized void release() throws InterruptedException {
        while (signals == bound) {
            wait();
        }

        signals--;
        notify();
    }
}
