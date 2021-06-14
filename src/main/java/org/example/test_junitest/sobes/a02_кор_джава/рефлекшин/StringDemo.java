package org.example.test_junitest.sobes.a02_кор_джава.рефлекшин;

import java.lang.reflect.Field;

class People{
    String str = "123";
}
public class StringDemo {

    public static void main(String[] args) {

       People p = new People();
       System.err.println(p.str);//123
        try {

            Field field = People.class.getDeclaredField("str");
            field.setAccessible(true);
            field.set(p,"0");

            System.err.println(p.str);//0
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
