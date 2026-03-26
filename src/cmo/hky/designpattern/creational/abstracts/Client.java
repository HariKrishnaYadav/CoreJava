package cmo.hky.designpattern.creational.abstracts;

public class Client {
    public Vehicle pVehicle;

    public Client(int type) {
        if (type == 3) {
            pVehicle = new ThreeWheeler();
        } else if (type == 4) {
            pVehicle = new FourWheeler();
        } else if (type == 2) {
            pVehicle = new TwoWheeler();
        } else {
            System.out.println("Invalid type");
        }
    }
    public Vehicle getpVehicle(){
        return pVehicle;
    }
}
