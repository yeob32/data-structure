package com.example.demo.jav.semaphore;

public class RecevingThread implements Runnable {

    private final Semaphore semaphore;

    public RecevingThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while(true) {
            // do something, then signal
            this.semaphore.take();
        }
    }
}
