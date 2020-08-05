package com.example.demo.jav.thread.messageProcess;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Process {

    public static void main(String[] args) {
        BlockingQueue<Message> blockingQueue = new LinkedBlockingQueue<>(3);

        new Thread(new Consumer(blockingQueue)).start();
        new Thread(new Producer(blockingQueue)).start();
    }
}
