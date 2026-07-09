package net.likelion.bebc25.spring.aop.staticproxy;

public class LogProxy implements Car{
    private final Car target; // 진짜 Car 객체

    public LogProxy(Car target){
        this.target = target;
    }

    @Override
    public void startEngine() {
        System.out.println("[before method execute] check engine");
        target.startEngine();
    }

    @Override
    public void drive() {
        System.out.println("[before & after method execute] fasten seatbelt");
        target.drive();
        System.out.println("[before & after method execute] unbuckle seatbelt");
    }

    @Override
    public void stopEngine() {
        target.stopEngine();
        System.out.println("[after method execute] get out of the car");
    }
}