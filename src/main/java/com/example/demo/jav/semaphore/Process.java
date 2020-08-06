package com.example.demo.jav.semaphore;

import com.example.demo.jav.semaphore.boundedSemaphore.BoundedSemaphore;

public class Process {

    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore();
        RecevingThread recevingThread = new RecevingThread(semaphore);
        SendingThread sendingThread = new SendingThread(semaphore);

        new Thread(recevingThread).start();
        new Thread(sendingThread).start();

        BoundedSemaphore boundedSemaphore = new BoundedSemaphore(1);
        boundedSemaphore.take();

        try {

        } finally {
            boundedSemaphore.release();
        }
    }
}
