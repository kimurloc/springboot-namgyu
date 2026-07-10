package net.likelion.bebc25.spring.componentscan;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect // 관심사 클래스 정의
@Component
public class LoggingAspect {

    @Pointcut("execution(* net.likelion.bebc25.spring.componentscan.Driver.*(..))")
    private void springAopPackageMethods(){}

    @Before("execution(* net.likelion.bebc25.spring.componentscan.Driver.*(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("[AOL log before] write code before method execution");
        Object[] args = joinPoint.getArgs();
        System.out.println(Arrays.toString(args));
    }

    @After("execution(* net.likelion.bebc25.spring.componentscan.Driver.*(..))")
    public void logAfter(){
        System.out.println("[AOL log after] write code after method execution");
    }

    @Around("springAopPackageMethods()")
    public void logAround(ProceedingJoinPoint jointPoint) throws Throwable{
        System.out.println("[AOL log around] write code before method execution");
        jointPoint.proceed(); // 대상 메서드 호출
        System.out.println("[AOL log around] write code after method execution");
    }
}
