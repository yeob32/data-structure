package com.example.demo.jav.semaphore.boundedSemaphore;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {

    private final List<Object> queue = new LinkedList<>();
    private final int limit;

    public BlockingQueue() {
        this.limit = 2;
    }

    public BlockingQueue(int limit) {
        this.limit = limit;
    }

    public synchronized void enqueue(Object item) throws InterruptedException {
        while (this.queue.size() == this.limit) {
            wait();
        }
        if (this.queue.size() == 0) {
            notifyAll();
        }
        this.queue.add(item);
    }

    public synchronized Object dequeue() throws InterruptedException {
        while (this.queue.size() == 0) {
            wait();
        }
        if (this.queue.size() == this.limit) {
            notifyAll();
        }

        return this.queue.remove(0);
    }

    public int getLimit() {
        return limit;
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new BlockingQueue();

        blockingQueue.enqueue(1);
        blockingQueue.enqueue(2);
        blockingQueue.enqueue(3); // wait
    }
}
