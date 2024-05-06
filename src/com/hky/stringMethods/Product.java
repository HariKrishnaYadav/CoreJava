package com.hky.stringMethods;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        // Using String.format to create a formatted string
        return String.format("Product: %s, Price: $%.2f, Quantity: %d", name, price, quantity);
    }

    public static void main(String[] args) {
        // Create a product object
        Product product = new Product("Smartphone", 499.99, 10);

        // Display the product information
        System.out.println(product);
    }
}
