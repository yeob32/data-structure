package com.example.demo.jav.thread.basic;

import java.util.concurrent.atomic.AtomicBoolean;

public class MyLock {

    private final AtomicBoolean locked = new AtomicBoolean(false);

    static class TestRunnable implements Runnable {

        private final MyLock myLock;

        public TestRunnable(MyLock myLock) {
            this.myLock = myLock;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": " + myLock.locking());
        }
    }

    public boolean locking() {
        if (locked.get()) return false;

        for (int i = 0; i < 100_000; i++) {

        }

        return locked.compareAndSet(false, true);
    }

    public static void main(String[] args) {
        MyLock myLock = new MyLock();

        for(int i=0; i<10; i++) {
            new Thread(new TestRunnable(myLock)).start();
        }
    }
}
