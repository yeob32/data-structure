package com.example.demo.dpattern.decorator;

public abstract class Beverage {
    protected String description;

    protected abstract double cost();

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        System.out.println("description : " + description);
        System.out.println("getDescription() : " + getDescription());

        return "Beverage{" +
                "description='" + getDescription() + '\'' +
                "cost : " + cost() +
                '}';
    }
}
