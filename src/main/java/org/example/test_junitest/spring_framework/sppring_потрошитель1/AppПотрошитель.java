package org.example.test_junitest.spring_framework.sppring_потрошитель1;

import org.example.test_junitest.sobes.enum_test.ColorANSI;
import org.example.test_junitest.spring_framework.configs.ConfigApp1потрошитель;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class AppПотрошитель {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp1потрошитель.class);
        Arrays.asList(context.getBeanDefinitionNames())
                .stream().map(s->ColorANSI.RED.fillColor(s)).forEach(System.out::println);
        context.getBean(ITerminatorQuoter.class).sayQuote();
    }
}
