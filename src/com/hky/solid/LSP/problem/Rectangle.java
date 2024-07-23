package com.hky.solid.LSP.problem;
//The Liskov Substitution Principle emphasizes that objects of a subclass should be substitutable for objects of its superclass without affecting program correctness. Consider an example involving geometric shapes:
public class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}
//Here, the Square class is a subclass of Rectangle. However, it violates LSP because the behavior of Square changes when its methods are overridden
