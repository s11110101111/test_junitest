package org.example.test_junitest.spring_framework;

import org.example.test_junitest.config.ConfigApp1;
import org.example.test_junitest.spring_framework.configs.InvisibleManImplSuperHuman;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpring {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp1.class);
        SuperHuman superPuper = (SuperHuman) context.getBean("invisibleManBean");
        superPuper.tellUsAbout("Funy funy . I'm watching you");



    }
}
