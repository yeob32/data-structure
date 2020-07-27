package com.example.demo.jav.thread.basic4;

public class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();

        b.start();

        // IllegalMonitorStateException 동기화 명시 안해주면 에러 발생
        synchronized (b) {
            try {
                System.out.println("b 작업 완료 대기");
                b.wait(); // notify를 호출하게 되면 wait에서 깨어남
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("완료 ~ " + b.index);
    }
}
