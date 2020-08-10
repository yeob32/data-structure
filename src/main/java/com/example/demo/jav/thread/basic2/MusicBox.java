package com.example.demo.jav.thread.basic2;

import java.util.stream.IntStream;

/**
 * 쓰레드 3개 -> JVM 스레드 실행
 * 동시에 동작하는 것 처럼 보이나 각 쓰레드 번갈아가면서 실행
 *
 * 쓰레드 상태 Runnable(실행가능), Running(실행)
 *
 * Thread.sleep(), Object의 wait() -> 쓰레드 블록
 * Thread.sleep() -> 특정 시간 후 스스로 블록상태에서 빠져나와 Runnable이나 Running상태가 됨
 * Object가 가지고 있는 wait() 메서드는 다른 쓰레드가 notify() 나 notifyAll() 메소드를 호출하기 전에는 블록상태에서 해제되지 않는다.
 * wait() 호출 시 모니터링 락을 놓게 된다. -> 대기 중인 다른 메소드가 실행
 * 쓰레드의 run 메서드 종료 -> 쓰레드 종료 -> Dead 상태
 * yield() 호출 시 해당 쓰레드는 다른 쓰레드에게 자원 양보
 * join() 호출 시 해당 쓰레드가 종료될 때까지 대기
 */
public class MusicBox {

    // 객채의 사용권을 얻는다 (Monitoring Lock)
    // 해당 모니터링 락은 메소드 실행이 종료되거나, wait()와 같은 메서드를 만나기 전까지 유지
    public synchronized void dropTheBeatA() {
        IntStream.range(0, 5).forEach(i -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("dropTheBeatA !");
        });
    }

    public void dropTheBeatB() {
        IntStream.range(0, 5).forEach(i -> {
            synchronized (this) {
                System.out.println("dropTheBeatB !!");
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public void dropTheBeatC() {
        IntStream.range(0, 5).forEach(i -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("dropTheBeatC !!!");
        });
    }
}
