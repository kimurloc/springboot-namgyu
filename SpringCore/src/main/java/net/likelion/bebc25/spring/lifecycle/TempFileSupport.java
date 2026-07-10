package net.likelion.bebc25.spring.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.aspectj.lang.annotation.DeclarePrecedence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class TempFileSupport {
    @Value("resources/temp.log")
    private String filePath;

    public TempFileSupport(){
        System.out.println("constructor called. " + filePath);
        //System.out.println(filePath + "");
    }

    @PostConstruct
    public void init(){
        System.out.println(filePath + " FileOutputStream created");
    }

    public void writeLog(String msg){
        System.out.println("log saved : " + msg);
    }

    @PreDestroy
    public void close(){
        System.out.println(filePath + " FileOutputStream closed");
    }
}
