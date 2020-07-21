package com.example.demo.dpattern.proxy;

import org.springframework.util.StopWatch;

public class ProxySimpleEvent implements Event {

    private SimpleEvent event;

    @Override
    public void process() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("process");

        if (event == null) {
            event = new SimpleEvent();
        }

        if(event.enable()) {
            event.process();
        }

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }
}
