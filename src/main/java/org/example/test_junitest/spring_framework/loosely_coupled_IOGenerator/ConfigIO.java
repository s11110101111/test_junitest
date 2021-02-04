package org.example.test_junitest.spring_framework.loosely_coupled_IOGenerator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ConfigIO {
//        @Bean(name="IOutput")
//public IOutputGenerator getGeneratorIOutput(){
//    return new IOutputGeneratorImpl();
//}

@Bean(name = "JsonOutput")
    public IOutputGenerator getGeneratorJsonOutput(){
            return new JsonOutputGeneratorImpl();
}
}
