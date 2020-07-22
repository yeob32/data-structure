package com.example.demo.dpattern.decorator;

import java.io.*;

public class Client {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage);

        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2);

        Beverage mocha = new Mocha(beverage);
        System.out.println(mocha);
    }
}
