package net.likelion.bebc25.spring;

public class AfterTest {
    void main(){
        Car car = new HybirdCar();

        Driver driver = new Driver(car);
        driver.driveCar();
    }
}
