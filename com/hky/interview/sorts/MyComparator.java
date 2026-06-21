package com.hky.interview.sorts;

import java.util.Comparator;

public class MyComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPrice() > o2.getPrice() ? 1 : -1;
    }
}
