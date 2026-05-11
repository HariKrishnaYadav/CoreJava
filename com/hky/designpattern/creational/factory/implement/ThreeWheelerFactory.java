package com.hky.designpattern.creational.factory.implement;

import com.hky.designpattern.creational.factory.ThreeWheeler;
import com.hky.designpattern.creational.factory.Vehicle;
import com.hky.designpattern.creational.factory.VehicleFactory;

public class ThreeWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicleFactory() {
        return new ThreeWheeler();
    }
}
