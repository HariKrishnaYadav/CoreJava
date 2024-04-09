package com.hky.designPattern.factory;

class VehicleFactory { 
	  
    Vehicle build(VehicleType vehicleType) 
    { 
        if (VehicleType.VT_TwoWheeler.compareTo(vehicleType) 
            == 0) { 
            return new TwoWheeler(); 
        } 
        else if (VehicleType.VT_ThreeWheeler.compareTo( 
                     vehicleType) 
                 == 0) { 
            return new ThreeWheeler(); 
        } 
        else if (VehicleType.VT_FourWheeler.compareTo( 
                     vehicleType) 
                 == 0) { 
            return new FourWheeler(); 
        } 
        return null; 
    } 
} 
