package org.example.test_junitest.spring_framework.sppring_потрошитель1;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// нужно для поиска  аннотации  при выполнении
@Retention(RetentionPolicy.RUNTIME)
public @interface InjectRandomInt {
    // два параметра
    int min();

    int max();

}
