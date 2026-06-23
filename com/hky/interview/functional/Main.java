package com.hky.interview.functional;

import com.hky.interview.sorts.Book;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(101, "Java", "James Gosling", 599.99);

        Consumer<Book> printName = b ->
                System.out.println("Book Name: " + b.getName());

        Consumer<Book> printPrice = b ->
                System.out.println("Book Price: " + b.getPrice());

        Consumer<Book> combinedConsumer = printName.andThen(printPrice);

        combinedConsumer.accept(book);
        System.out.println("-----------------------------");

        Consumer<Book> validate = b ->
                System.out.println("Validating: " + b.getName());

        Consumer<Book> save = b ->
                System.out.println("Saving to DB: " + b.getName());

        Consumer<Book> notifyUser = b ->
                System.out.println("Sending Notification");

        validate.andThen(save)
                .andThen(notifyUser)
                .accept(book);
    }
}