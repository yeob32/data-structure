package com.example.demo.jav.semaphore;

/**
 * 세마포어 사용으로 신호 실종을 방지
 * notify() 대신 take() 호출, wait() 대신 release()호출
 *
 * release() 호출 전에 take() 호출이 발생하면,
 * 신호는 내부적으로 signal 변수 안에 저장되기 때문에 release() 를 호출하는 쓰레드는 take() 이 호출되었었음을 알 수 있다.
 *
 * wait() 과 notify() 호출과는 다르다.
 */
public class Semaphore {

    private boolean signal = false;

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore();
        semaphore.take();
    }

    public synchronized void take() {
        signal = true;
        notify();
    }

    public synchronized void release() throws InterruptedException {
        while(!signal) {
            wait();
        }

        signal = false;
    }
}
