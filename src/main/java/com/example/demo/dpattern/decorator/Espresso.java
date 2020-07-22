package com.example.demo.dpattern.decorator;

public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    protected double cost() {
        return 2.13;
    }
}
