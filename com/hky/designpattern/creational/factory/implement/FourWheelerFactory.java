package com.hky.designpattern.creational.factory.implement;

import com.hky.designpattern.creational.factory.FourWheeler;
import com.hky.designpattern.creational.factory.Vehicle;
import com.hky.designpattern.creational.factory.VehicleFactory;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicleFactory() {
        return new FourWheeler();
    }
}
