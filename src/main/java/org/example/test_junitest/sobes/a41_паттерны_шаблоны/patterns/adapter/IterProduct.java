package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterProduct {
    private List<Product> products = new ArrayList<>();

        public void addProduct(Product product){
            products.add(product);
        }


        public Iterator getProduct(){
            Iterator eProduct = products.iterator();
        return eProduct;
        }

}
