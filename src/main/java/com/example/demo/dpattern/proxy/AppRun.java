package com.example.demo.dpattern.proxy;

public class AppRun {

    public static void main(String[] args) {
        EventService eventService = new SimpleEventService();
        eventService.add();
        eventService.delete();

        EventService eventService1 = new ProxySimpleEventService();
        eventService1.add();
        eventService1.delete();
    }
}
