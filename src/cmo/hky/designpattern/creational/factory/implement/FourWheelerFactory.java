package cmo.hky.designpattern.creational.factory.implement;

import cmo.hky.designpattern.creational.factory.FourWheeler;
import cmo.hky.designpattern.creational.factory.ThreeWheeler;
import cmo.hky.designpattern.creational.factory.Vehicle;
import cmo.hky.designpattern.creational.factory.VehicleFactory;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicleFactory() {
        return new FourWheeler();
    }
}
