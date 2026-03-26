package cmo.hky.designpattern.creational.factory.implement;

import cmo.hky.designpattern.creational.factory.Client;
import cmo.hky.designpattern.creational.factory.TwoWheeler;
import cmo.hky.designpattern.creational.factory.Vehicle;
import cmo.hky.designpattern.creational.factory.VehicleFactory;

public class DriverClass {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory=new TwoWheelerFactory();
        Client twoWheelerClient=new Client(twoWheelerFactory);
        Vehicle vehicle=twoWheelerClient.getpVehicle();
        vehicle.printVehicle();


    }
}
