package net.likelion.bebc25.intellij;

import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect // 관심사 클래스 정의
@Component
@Slf4j
public class LoggingAspect {
    @Generated


    @Pointcut("execution(* net.likelion.bebc25.intellij.*Driver.*(..))")
    private void springAopPackageMethods(){}

    @Before("springAopPackageMethods()")
    public void logBefore(JoinPoint joinPoint){
        log.info("[AOL log before] write code before method execution");
    }

    @After("springAopPackageMethods()")
    public void logAfter(){
        log.info("[AOL log after] write code after method execution");
    }

    @Around("springAopPackageMethods()")
    public void logAround(ProceedingJoinPoint jointPoint) throws Throwable{
        log.debug("[AOL log around] write code before method execution");
        jointPoint.proceed(); // 대상 메서드 호출
        log.debug("[AOL log around] write code after method execution");
    }
}
