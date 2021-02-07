package org.example.test_junitest.spring_framework.configs;

import org.example.test_junitest.spring_framework.SuperHuman;
import org.example.test_junitest.spring_framework.InvisibleManImplSuperHuman;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp1 {


    @Bean(name = "invisibleManBean")
   public SuperHuman superThing(){
    return  new InvisibleManImplSuperHuman();
}

}
