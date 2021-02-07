package org.example.test_junitest.spring_framework.configs;

import org.example.test_junitest.spring_framework.sppring_потрошитель1.ITerminatorQuoter;
import org.example.test_junitest.spring_framework.sppring_потрошитель1.InjectRandomIntAnnotationBeanPostProcessor;
import org.example.test_junitest.spring_framework.sppring_потрошитель1.ProfilingHandlerBeanPostProcessor;
import org.example.test_junitest.spring_framework.sppring_потрошитель1.TerminatorQuoter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp1потрошитель {

@Bean
    public ProfilingHandlerBeanPostProcessor profilingHandlerBeanPostProcessor(){
    return new ProfilingHandlerBeanPostProcessor();
}
@Bean //register BPP injectRandomIntAnnotation
    public InjectRandomIntAnnotationBeanPostProcessor injectRandomIntAnnotationBPP(){
    return new InjectRandomIntAnnotationBeanPostProcessor();

}

@Bean (name="terminatorQuoter", initMethod = "init")
    public ITerminatorQuoter terminatorQuoter(){
    return new TerminatorQuoter();
}
}
