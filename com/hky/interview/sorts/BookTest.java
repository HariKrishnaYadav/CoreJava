package com.hky.interview.sorts;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookTest {
    List<Book> getSortedBooksByPrice() {
        List<Book> books = BookRepository.getBooks();
        Collections.sort(books, new MyComparator());
        return books;
    }

    List<Book> getSortedBooksByPriceWithLambda() {
        List<Book> books = BookRepository.getBooks();
        Collections.sort(books, (o1, o2) -> o1.getPrice() > o2.getPrice() ? 1 : -1);
        return books;
    }

    public static void main(String[] args) {
        BookTest bookTest = new BookTest();
        List<Book> sortedBooks = bookTest.getSortedBooksByPrice();
        for (Book book : sortedBooks) {
            System.out.println(book);
        }
        System.out.println("-----------------------------");
        List<Book> sortedBooksWithLambda = bookTest.getSortedBooksByPriceWithLambda();
        for (Book book : sortedBooksWithLambda) {
            System.out.println(book);


        }

    }
}
