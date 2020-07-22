package com.example.demo.dpattern.decorator;

public class Mocha extends CondimentComponent {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.description = "모카";
        this.beverage = beverage;
    }

    @Override
    protected double cost() {
        return 1.0 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.description;
    }
}
