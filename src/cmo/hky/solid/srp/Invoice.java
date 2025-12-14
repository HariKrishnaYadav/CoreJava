package cmo.hky.solid.srp;

public class Invoice {


    private Marker marker;
    private int quantity;
    private int total;

    public Invoice(int total, int quantity, Marker marker) {
        this.total = total;
        this.quantity = quantity;
        this.marker = marker;
    }

    public Marker marker() {
        return marker;
    }

    public Invoice setMarker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public int quantity() {
        return quantity;
    }

    public Invoice setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public int total() {
        return total;
    }

    public Invoice setTotal(int total) {
        this.total = total;
        return this;
    }
}

