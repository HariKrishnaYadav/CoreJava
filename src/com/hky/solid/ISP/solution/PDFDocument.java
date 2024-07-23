package com.hky.solid.ISP.solution;

public class PDFDocument implements  PrintableDocument,Document{
    @Override
    public void create() {

    }

    @Override
    public void save() {

    }

    @Override
    public void print() {

    }
}
//By segregating interfaces, classes only need to implement the methods that are relevant to their behavior