package cmo.hky.solid.srp;

public class Marker {


    String name;
    String color;
    int price;
    int year;

    public Marker(String name, String color, int price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    public String name() {
        return name;
    }

    public Marker setName(String name) {
        this.name = name;
        return this;
    }

    public String color() {
        return color;
    }

    public Marker setColor(String color) {
        this.color = color;
        return this;
    }

    public int price() {
        return price;
    }

    public Marker setPrice(int price) {
        this.price = price;
        return this;
    }

    public int year() {
        return year;
    }

    public Marker setYear(int year) {
        this.year = year;
        return this;
    }
}
