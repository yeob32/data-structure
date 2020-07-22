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

        try {
            BufferedReader bufferedReader = new LineNumberReader(new FileReader("/Users/sykim/KWOP_PRD_LOG.sql"));
            System.out.println(bufferedReader.readLine());
        } catch (FileNotFoundException e) {
            System.out.println("ggg");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
