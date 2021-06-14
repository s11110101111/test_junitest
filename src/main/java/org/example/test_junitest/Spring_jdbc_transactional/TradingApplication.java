package org.example.test_junitest.Spring_jdbc_transactional;

import org.example.test_junitest.sobes.a01_кор_джава.enum_test.ColorANSI;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.Arrays;
import java.util.List;

/**
 * Thanks for watching this episode! If you want to, drop me a line to info@marcobehler.com.
 */
public class TradingApplication {

    public static void main(String[] args) {
        User user = new User("Hans", "hans@forest.de");
        System.out.println("user.getEmail() = " + user.getEmail());


        System.out.println("Transaction open? " + TransactionSynchronizationManager.isActualTransactionActive());

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContextConfig.class);
        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppContextConfig.class);
        List beanDefs= Arrays.asList(ctx1.getBeanDefinitionNames());
        System.out.println("список зарегитрированных bean Definition=======BeanDefinitions");
        beanDefs.stream().map(s-> ColorANSI.GREEN.fillColor(s.toString()))
                .forEach(System.out::println);

        UserService userService = ctx.getBean(UserService.class);
        System.out.println(ColorANSI.RED.fillColor("Get Bean UserService name Type ="
                + userService.getClass().getSimpleName()));
        userService.register(user);

        System.out.println("Transaction open? " + TransactionSynchronizationManager.isActualTransactionActive());

    }
}
