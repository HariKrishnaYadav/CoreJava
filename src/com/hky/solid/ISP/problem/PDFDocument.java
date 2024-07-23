package com.hky.solid.ISP.problem;
//In this case, the PDFDocument class doesn't require an edit() method, so it's forced to implement a method it doesn't need
public class PDFDocument implements Document{
    @Override
    public void create() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void save() {

    }

    @Override
    public void print() {

    }
}
