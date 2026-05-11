package com.hky.designpattern.creational.factory.implement;

import com.hky.designpattern.creational.factory.TwoWheeler;
import com.hky.designpattern.creational.factory.Vehicle;
import com.hky.designpattern.creational.factory.VehicleFactory;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicleFactory() {
        return new TwoWheeler();
    }
}
