package org.example.test_junitest.spring_framework.sppring_потрошитель1;

import javassist.tools.reflect.Reflection;
import org.example.test_junitest.sobes.enum_test.ColorANSI;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;

public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {
private  int injectOk= 0;
 // не забыть вин добавить в конфиг

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //Обработем  все поля бина и вытащим анатацю и ее параметры
//Еасли анатациия есть сгенрим случайное число на основе параметров
        Field[] fields = bean.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomInt.class)) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
              int i = min + random.nextInt(max - min);

                 field.setAccessible(true);
                //засуним это в филд не на пряямую, а через  spring reflectionUtil тк там обработка исключений уже обработана
                //   field.set(i);
                //передадим поле, наш объект- бин , заначение
                ReflectionUtils.setField(field,bean,i);
    injectOk++;

            }

        }


        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(ColorANSI.GREEN.fillColor("My InjectBPP injected - "+ injectOk
                + " methods in " + beanName));

        return null;
    }
}
