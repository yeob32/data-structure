package com.example.demo.jav.thread.basic;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Atomic 자료형이 modern cpu가 기본적으로 제공하는 synchronized compare & swap 기능을 바로 사용하므로 직접 구현할 때보다 더 빠른 성능을 보장한다.
 */
public class MyLock {

    private boolean locked2 = false;
    private final AtomicBoolean locked = new AtomicBoolean(false);

    static class TestRunnable implements Runnable {

        private final MyLock myLock;

        public TestRunnable(MyLock myLock) {
            this.myLock = myLock;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": " + myLock.locking());
//            System.out.println(Thread.currentThread().getName() + " -- 2: " + myLock.locking2());
        }
    }

    public synchronized boolean locking2() {
        if(!locked2) {
            locked2 = true;
            return true;
        }
        return false;
    }

    public boolean locking() {
        return locked.compareAndSet(false, true);
    }

    public static void main(String[] args) {
        MyLock myLock = new MyLock();

        for(int i=0; i<10; i++) {
            new Thread(new TestRunnable(myLock)).start();
        }
    }
}
