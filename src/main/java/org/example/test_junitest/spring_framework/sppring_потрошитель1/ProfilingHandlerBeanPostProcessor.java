package org.example.test_junitest.spring_framework.sppring_потрошитель1;

import org.example.test_junitest.sobes.a01_кор_джава.enum_test.ColorANSI;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ProfilingHandlerBeanPostProcessor implements BeanPostProcessor {
    //для профилилирования  скорости  обработка  аннотации profiling
    private Map<String, Class> map = new HashMap<>();

    public ProfilingHandlerBeanPostProcessor() {
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //Запомним класс оригинального меторда тк его мы будем проксировать
        Class<?> myBeanClass = bean.getClass();
        if (myBeanClass.isAnnotationPresent(Profiling.class)) {
            map.put(beanName, myBeanClass);
            System.out.println("add in map " + bean + "// Class " + bean.getClass());
        }
        //вернем оригинальный бин
        System.out.println("PHbpp  before scan - " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("PHbpp scan after - " + bean);
        //проверим елсли унас класс
        Class<?> beanClass = bean.getClass();
        if (beanClass != null) {
            // зоначит класс аннотирован вернем  дайнамик прокси
            return Proxy.newProxyInstance(beanClass.getClassLoader(), beanClass.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                    System.out.println(ColorANSI.CYAN.fillColor("Профилирую...."));
                    long before = System.nanoTime();
                    //выполним ориг метод
                    Object retVal = method.invoke(bean, args);
                    long after = System.nanoTime();
                    long result = after - before;
                    System.out.println(ColorANSI.CYAN.fillColor("Готово... = " + result));
                    return retVal;

                }


            });

        }

        return bean;

    }
}
