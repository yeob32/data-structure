package com.example.demo.dpattern.proxy;

public class AppRun {

    public static void main(String[] args) {
        Event event = new ProxySimpleEvent();
        event.process();
    }
}
