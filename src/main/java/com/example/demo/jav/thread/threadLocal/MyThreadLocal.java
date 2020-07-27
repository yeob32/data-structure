package com.example.demo.jav.thread.threadLocal;

public class MyThreadLocal {

    static ThreadLocal<String> strThreadLocal = new ThreadLocal<>();

    public static class MyThead extends Thread {
        @Override
        public void run() {
            System.out.println("strThreadLocal.get() : " + strThreadLocal.get());
        }
    }

    public static void main(String[] args) {
        MyThreadLocal.strThreadLocal.set("hi");
        System.out.println("11 : " + MyThreadLocal.strThreadLocal.get());

        Runnable runnable = () -> {
            System.out.println("runnable1 : " + MyThreadLocal.strThreadLocal.get());
            MyThreadLocal.strThreadLocal.set("hi 222");
            System.out.println("runnable2 : " + MyThreadLocal.strThreadLocal.get());

        };
        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("22 : " + MyThreadLocal.strThreadLocal.get());
    }
}
