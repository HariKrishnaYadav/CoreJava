package com.hky.solid.LSP.solution;

public class Square {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public int calculateArea() {
        return side * side;
    }
}
//This design adheres to LSP, as the Square class correctly substitutes the Rectangle class without altering expected behavior.