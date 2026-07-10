package net.likelion.bebc25.spring.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLifeCycleApplication {
    void main(){
        try{
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            TempFileSupport support = context.getBean(TempFileSupport.class);
            support.writeLog("user logged in");
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
