package com.example.demo.dpattern.proxy;

import org.springframework.util.StopWatch;

public class ProxySimpleEventService implements EventService {

    private final EventService eventService;

    public ProxySimpleEventService() {
        eventService = new SimpleEventService();
    }

    @Override
    public void add() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        eventService.add();
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }

    @Override
    public void delete() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        eventService.add();
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
