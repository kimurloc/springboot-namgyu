package net.likelion.bebc25.oop.after;

import net.likelion.bebc25.oop.before.GasolineCar;

public class Driver {
    private Car car;

    Driver(Car car){
        this.car = car;
    }

    public void driveCar(){
        car.startEngine();
        car.drive();
        car.stopEngine();
        car.stopEngine();
    }
}
