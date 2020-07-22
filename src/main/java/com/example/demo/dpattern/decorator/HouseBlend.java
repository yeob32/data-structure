package com.example.demo.dpattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "하우스 블렌드";
    }

    @Override
    protected double cost() {
        return 1.9;
    }
}
