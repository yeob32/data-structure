package com.example.demo.dpattern.composite;

import com.example.demo.dpattern.composite.component.Keyboard;
import com.example.demo.dpattern.composite.component.Monitor;
import com.example.demo.dpattern.composite.component.Mouse;

import java.util.ArrayList;
import java.util.List;

public class Desk {

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(100, 10);
        Monitor monitor = new Monitor(300, 60);
        Mouse mouse = new Mouse(200, 30);

        List<ComputerDevice> devices = new ArrayList<>();
        devices.add(keyboard);
        devices.add(monitor);
        devices.add(mouse);

        Computer computer1 = new Computer(devices);
        computer1.getPrice();
        computer1.getPower();

        Computer computer2 = new Computer();
        computer2.addComponent(keyboard);
        computer2.addComponent(monitor);
        computer2.addComponent(mouse);

        System.out.println("computer 1 : " + computer1.getPrice() + ",," + computer1.getPower());
        System.out.println("computer 2 : " + computer2.getPrice() + ",," + computer2.getPower());
    }
}
