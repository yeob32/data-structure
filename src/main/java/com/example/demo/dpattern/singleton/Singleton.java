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
}
