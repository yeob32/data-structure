package com.example.demo.jav.thread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i=0; i<5; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
                    int poolSize = threadPoolExecutor.getPoolSize();
                    System.out.println("name : " + Thread.currentThread().getName() + ", pool size : " + poolSize);

                    throw new RuntimeException("Error !");
                }
            };

            System.out.println("==================");

            // 작업 처리 도중 예외가 발생하면 스레드가 종료되고 스레드 풀에서 제거
            executorService.execute(runnable);

            // 작업 처리 도중 예외가 발생하더라도 종료되지 않고 재사용 -> 오베헤드 줄일 수 있음
//            executorService.submit(runnable);

            Thread.sleep(3000);

        }

        executorService.shutdown(); // 현재 처리중인 작업, 작업 큐에 대기하는 모든 작업을 처리한 뒤 종료
    }
}
