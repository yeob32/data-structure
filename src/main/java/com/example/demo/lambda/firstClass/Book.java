package com.example.demo.lambda.firstClass;

public class Book {

    private String name;
    private Area area;
    private long price;

    public Book(String name, Area area, long price) {
        this.name = name;
        this.area = area;
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public Area getArea() {
        return area;
    }
}
