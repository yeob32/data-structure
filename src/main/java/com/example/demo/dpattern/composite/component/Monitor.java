package com.example.demo.dpattern.composite.component;

import com.example.demo.dpattern.composite.ComputerDevice;

public class Monitor implements ComputerDevice {

    int price;
    int power;

    public Monitor(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}
