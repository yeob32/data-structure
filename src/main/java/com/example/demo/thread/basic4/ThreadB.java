package com.example.demo.thread.basic4;

import java.util.stream.IntStream;

public class ThreadB extends Thread {

    int index;

    // 해당 쓰레드가 실행되면 자기 자신의 모니터링 락 획득
    // notify() 메소드를 호출하여 wait하고 있는 쓰레드를 깨움
    // IllegalMonitorStateException 동기화 작업 안해주면 에러남
    @Override
    public synchronized void run() {
        IntStream.range(0, 10).forEach(i -> {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            index++;
            System.out.println(currentThread().getName() + " - " + index);
        });

        notify();
    }
}
