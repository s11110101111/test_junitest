package org.example.test_junitest.sobes.classes_methods;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainCarInsurance {
    public static void main(String[] args) {

        // Пример статического и динамического связывания в Java
        Insurance current = new CarInsurance();

        // Динамическое связывание на основе объекта
        int premium = current.premium();

        // Статическое связывание на основе класса
        String category = Insurance.category();

        System.out.println("premium : " + premium);
        System.out.println("category : " + category);
FirstStaticClass.printSet();
Collection c = new HashSet();
Set hs = new HashSet<>();
HashSet hsh = new HashSet();
        print(c);
        print(hs);
        print(hsh);
        print(new HashSet());
        Set setnew = new AbstractSet() {
            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
    }
    static class FirstStaticClass{
        static void printSet(){
            System.out.println("String FirstStaticClass");
        }
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