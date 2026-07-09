package net.likelion.bebc25.spring.aop.dynamicproxy;

public class HybirdCar implements Car {
    @Override
    public void startEngine(){
        System.out.println("start the engine");
    }

    @Override
    public void drive(){
        System.out.println("driving by gasoline & electric");
    }

    @Override
    public void stopEngine(){
        System.out.println("stop the engine");
    }
}
