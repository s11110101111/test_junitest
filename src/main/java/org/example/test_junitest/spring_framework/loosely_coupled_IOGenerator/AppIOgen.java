package org.example.test_junitest.spring_framework.loosely_coupled_IOGenerator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class AppIOgen {
    public static void main(String[] args) {

        OutputHelper helper = new OutputHelper();
        helper.generate();
        appRunner();
    }

    private static void appRunner() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigIO.class);
        ApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigIO.class);
        List beans = Arrays.asList(context.getBeanDefinitionNames());

        beans.forEach(System.out::println);
        IOutputGenerator iog = (IOutputGenerator) context.getBean("JsonOutput");
        iog.generateOutput();
        IOutputGenerator iog1 = (IOutputGenerator) context.getBean(IOutputGeneratorImpl.class);
iog1.generateOutput();
    }

}
