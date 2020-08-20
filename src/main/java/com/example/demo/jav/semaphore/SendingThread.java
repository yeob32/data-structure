package com.example.demo.jav.semaphore;

public class SendingThread implements Runnable {

    private final Semaphore semaphore;

    public SendingThread(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while(true) {
            try {
                semaphore.release();
                // receive signal, then do something
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
