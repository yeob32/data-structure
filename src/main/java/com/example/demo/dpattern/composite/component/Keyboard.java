package com.example.demo.dpattern.composite.component;

import com.example.demo.dpattern.composite.ComputerDevice;

public class Keyboard implements ComputerDevice {

    int price;
    int power;

    public Keyboard(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public int getPower() {
        return this.power;
    }
}
