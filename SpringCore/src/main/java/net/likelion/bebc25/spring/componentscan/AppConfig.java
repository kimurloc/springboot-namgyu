package net.likelion.bebc25.spring.componentscan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy // 스프링 컨테이너에서 @Aspect 빈을 찾아 프로시 처리하도록 지시
@ComponentScan
public class AppConfig {
    /*@Bean
    public Car car(){
        //return new GasolineCar();
        return new HybirdCar();
    }

    @Bean
    public Driver driver(Car car){
        return new Driver(car);
    }

    @Bean
    public LoggingAspect loggingAspect(){
        return new LoggingAspect();
    }*/
}
