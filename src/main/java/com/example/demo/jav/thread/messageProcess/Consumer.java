package com.example.demo.jav.thread.messageProcess;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private final BlockingQueue<Message> blockingQueue;

    public Consumer(BlockingQueue<Message> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);

                Message message = blockingQueue.take();

                System.out.println(message);
            } catch (InterruptedException e) {
                System.out.println("ERROR !!!!!!!!!");
                e.printStackTrace();
            }

            System.out.println("consumer !!");
        }
    }
}
