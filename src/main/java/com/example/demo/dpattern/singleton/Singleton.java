package com.example.demo.dpattern.singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    // 동기화 보장 필요 시
    public static synchronized Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

//    public static Singleton getInstance() {
//        if(instance == null) {
//            synchronized (Singleton.class) {
//                if(instance == null) {
//                    instance = new Singleton();
//                }
//            }
//
//        }
//
//        return instance;
//    }

    // 가장 많이 쓰는 방법.
    public static class LazyHolder {
        private static final Singleton instance = new Singleton(); // 클래스 로딩 시점에 한번만 호출
    }

    // 동적바인딩(Dynamic Binding) (런타임시에 성격이 결정) 의 특징을 이용하여 Thread-safe 하면서 성능 뛰어남.
    public static Singleton getLazyInstance() { // 호출 될 떄 instance 메모리 할당
        return LazyHolder.instance;
    }
}
