package org.example.test_junitest.spring_framework.sppring_потрошитель1;

import org.example.test_junitest.sobes.a01_кор_джава.enum_test.ColorANSI;
import org.example.test_junitest.spring_framework.configs.ConfigApp1потрошитель;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class AppПотрошитель {

   // https://youtu.be/BmBr5diz8WA

    //https://youtu.be/hDpa6m48eC4?t=2263

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp1потрошитель.class);
    Arrays.asList(context.getBeanDefinitionNames())
            .stream().map(s -> ColorANSI.PURPLE.fillColor(s)).forEach(System.out::println);

    //context.getBean(ITerminatorQuoter.class).sayQuote();

    }
}
