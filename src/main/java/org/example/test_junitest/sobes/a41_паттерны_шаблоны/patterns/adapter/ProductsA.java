package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.adapter;

import java.util.Iterator;

public class ProductsA {
    public void displayProduct(Iterator iterator){
        for (; iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }


}
