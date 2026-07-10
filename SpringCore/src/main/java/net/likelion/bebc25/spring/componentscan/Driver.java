package net.likelion.bebc25.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver {
    private Car car;

    /*Driver(){
        System.out.println("default constructor called");
    }

    @Autowired
    Driver(@Qualifier("gasolineCar") Car car){
        System.out.println("called Constructor Injection");
        this.car = car;
    }*/

    @Autowired
    public void setCar(Car car){
        System.out.println("Setter Injection called");
        this.car = car;
    }

    public void driveCar(int maxSpeed){
        car.startEngine();
        car.drive();
        car.stopEngine();
        //car.stopEngine();
    }
}
