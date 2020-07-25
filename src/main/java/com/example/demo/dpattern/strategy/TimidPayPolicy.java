package com.example.demo.dpattern.strategy;

public class TimidPayPolicy implements PayPolicy {

    @Override
    public long controll(long price) {
        return price - (price * 10 / 100);
    }
}
