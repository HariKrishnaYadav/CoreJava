package com.hky.interview.sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public static List<Book> getBooks() {
        return Arrays.asList(
                new Book(101, "The Great Gatsby", "F. Scott Fitzgerald", 10.99),
                new Book(102, "To Kill a Mockingbird", "Harper Lee", 8.99),
                new Book(103, "1984", "George Orwell", 12.99),
                new Book(104, "Pride and Prejudice", "Jane Austen", 9.99),
                new Book(105, "The Alchemist", "Paulo Coelho", 15.99)
        );
    }
}
