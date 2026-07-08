package net.likelion.bebc25.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car car(){
        //return new GasolineCar();
        return new HybirdCar();
    }

    @Bean
    public Driver driver(Car car){
        return new Driver(car);
    }
}
