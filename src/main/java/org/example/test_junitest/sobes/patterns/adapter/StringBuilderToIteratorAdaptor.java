package org.example.test_junitest.sobes.patterns.adapter;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringBuilderToIteratorAdaptor implements Iterator {

    private Iterator iterList;

    public StringBuilderToIteratorAdaptor(ProductB prodB){
        //получим стрингбилдер и вернум итератор
        List<String>   productListB= Arrays.asList(prodB.getProductB().toString().split(","));
        iterList = productListB.iterator();
     }

    @Override
    public boolean hasNext() {

        return iterList.hasNext();
    }

    @Override
    public Object next() {
        return iterList.next();
    }

    @Override
    public void remove() {
        iterList.remove();
    }
}
