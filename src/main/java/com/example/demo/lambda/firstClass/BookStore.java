package com.example.demo.lambda.firstClass;

import java.util.Arrays;
import java.util.List;

public class BookStore {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("a", Area.economy, 100),
                new Book("b", Area.novel, 70),
                new Book("c", Area.novel, 9000),
                new Book("d", Area.economy, 20));
        BookGroups bookGroups = new BookGroups(books);
        long totalPrice = bookGroups.getSumByEconomy();

        System.out.println("totalPrice is 120 : " + (totalPrice == 120));
    }
}
