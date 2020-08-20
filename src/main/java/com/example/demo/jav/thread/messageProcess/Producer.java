package com.example.demo.jav.thread.messageProcess;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue<Message> blockingQueue;

    public Producer(BlockingQueue<Message> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);

                Message message = new Message("m_" + i);
                blockingQueue.put(message);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
