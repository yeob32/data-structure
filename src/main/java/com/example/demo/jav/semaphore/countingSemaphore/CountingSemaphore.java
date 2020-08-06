package com.example.demo.jav.semaphore.countingSemaphore;

public class CountingSemaphore {

    private int signal;

    public synchronized void take() {
        this.signal++;
        notify();
    }

    public synchronized void release() throws InterruptedException {
        while (this.signal == 0) {
            wait();
        }

        this.signal--;
    }
}
