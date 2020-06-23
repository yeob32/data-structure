package com.example.demo.lambda.firstClass;

import java.util.List;
import java.util.function.Predicate;

public class BookGroups {

    private List<Book> books;

    public BookGroups(List<Book> books) {
        this.books = books;
    }

    public long getSumByEconomy() {
        return getFilteredBooks(book -> book.getArea().equals(Area.economy));
    }

    private long getFilteredBooks(Predicate<Book> predicate) {
        return books.stream()
                .filter(predicate)
                .mapToLong(Book::getPrice)
                .sum();
    }
}
