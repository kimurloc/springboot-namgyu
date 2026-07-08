package net.likelion.bebc25.oop.after;

public class AfterTest {
    void main(){
        Car car = new HybirdCar();

        Driver driver = new Driver(car);
        driver.driveCar();
    }
}
