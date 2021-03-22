package org.example.test_junitest.sobes.classes_methods;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MainCarInsurance {
    public static void main(String[] args) {

        // Пример статического и динамического связывания в Java
        Insurance current = new CarInsurance();

        // Динамическое связывание на основе объекта
        int premium = current.premium();

        // Статическое связывание на основе класса
        String category = current.category();

        System.out.println("premium : " + premium);
        System.out.println("category : " + category);

Collection c = new HashSet();
Set hs = new HashSet<>();

        print(c);
        print(hs);
    }

    public static void print(Collection c) {
        System.out.println("Collections");
    }

    public static void print(Set s) {
        System.out.println("Sets");
    }

    public static void print(HashSet c) {
        System.out.println("HashSets");
    }
}

class Insurance {
    public static final int LOW = 100;

    public int premium() {
        return LOW;
    }

    public static String category() {
        return "Insurance";
    }

}

class CarInsurance extends Insurance {
    public static final int HIGH = 200;

    public int premium() {
        return HIGH;
    }

    public static String category() {
        return "Car Insurance";
    }

}