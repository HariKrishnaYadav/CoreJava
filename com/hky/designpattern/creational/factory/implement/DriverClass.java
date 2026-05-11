package com.hky.designpattern.creational.factory.implement;

import com.hky.designpattern.creational.factory.Client;
import com.hky.designpattern.creational.factory.Vehicle;
import com.hky.designpattern.creational.factory.VehicleFactory;

public class DriverClass {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory=new TwoWheelerFactory();
        Client twoWheelerClient=new Client(twoWheelerFactory);
        Vehicle vehicle=twoWheelerClient.getpVehicle();
        vehicle.printVehicle();


    }
}
