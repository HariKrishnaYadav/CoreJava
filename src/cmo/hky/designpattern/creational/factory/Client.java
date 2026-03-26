package cmo.hky.designpattern.creational.factory;

public class Client {
    private   Vehicle pVehicle;

    public Client(VehicleFactory factory) {
        this.pVehicle = factory.getVehicleFactory();
    }
    public  Vehicle getpVehicle(){
        return pVehicle;
    }
}
