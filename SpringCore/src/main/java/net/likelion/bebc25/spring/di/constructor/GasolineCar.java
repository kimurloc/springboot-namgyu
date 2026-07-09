package net.likelion.bebc25.spring.di.constructor;

public class GasolineCar implements Car {
    @Override
    public void startEngine(){
        System.out.println("start the engine");
    }

    @Override
    public void drive(){
        System.out.println("driving by gasoline");
    }

    @Override
    public void stopEngine(){
        System.out.println("stop the engine");
    }
}
