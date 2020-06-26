package com.example.demo.dpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    List<ComputerDevice> devices;

    public Computer() {
    }

    public Computer(List<ComputerDevice> devices) {
        this.devices = devices;
    }

    public void addComponent(ComputerDevice device) {
        if(devices == null) {
            devices = new ArrayList<>();
        }

        devices.add(device);
    }

    public int getPrice() {
        return devices.stream()
                .mapToInt(ComputerDevice::getPrice)
                .sum();
    }

    public int getPower() {
        return devices.stream()
                .mapToInt(ComputerDevice::getPower)
                .sum();
    }
}
