package cmo.hky.designpattern.creational.abstracts;

public class VechicleMain {
    public static void main(String[] args) {
        Client client = new Client(2);
        Vehicle vehicle = client.getpVehicle();
        vehicle.start();
    }
}
