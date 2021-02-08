package org.example.test_junitest.spring_framework.sppring_потрошитель1;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Arrays;

public class PostProxyInvokeContextListener  implements ApplicationListener<ContextRefreshedEvent> {
    // Слушаем рефрешь контекста
    // интектним родную не прокси factory c биндефенишинами и будем искать в ней оригиные методы с аннотоцией

    @Autowired
    private ConfigurableListableBeanFactory factory;


     @SneakyThrows
     @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext context = contextRefreshedEvent.getApplicationContext();
         String[] beanNames = context.getBeanDefinitionNames();
         for (String name: beanNames) {
             BeanDefinition beanDefinition = factory.getBeanDefinition(name);
             //получаем имя класса
             String originalClassName = beanDefinition.getBeanClassName();
             //получаем класс  и по методам в нем
             Class<?> originalClass = null;

                 originalClass = Class.forName(originalClassName);
              Method[] methods = originalClass.getMethods();
             for (Method method : methods) {

                 if (method.isAnnotationPresent(PostProxy.class)){
                     System.out.println("+++++++++++++++++++++++++++++++++++++++++++!!!");
                  // получаем оригинальный метод и инвокаем его
                     Object bean = context.getBean(name);
                     //получаем из бина метод  по имени метода прокси и предаем параметры из прокси
                     Method originalMethod = bean.getClass().getMethod(method.getName(),method.getParameterTypes());
                     originalMethod.invoke(bean);
                 }
             }


         }



    }
}
