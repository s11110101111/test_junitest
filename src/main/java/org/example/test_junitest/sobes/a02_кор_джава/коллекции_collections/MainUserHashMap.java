package org.example.test_junitest.sobes.a02_кор_джава.коллекции_collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainUserHashMap {
    public Map<String,String> mapProduct = new HashMap<>();
    public Set<String> setProduct = new HashSet<>();
    public static void main(String[] args) {
        MainUserHashMap main = new MainUserHashMap();
        main.mapProduct.put("продукт1", "колбаса");
        main.mapProduct.put("продукт1", "колбаса2");
        main.mapProduct.put(null , "колбаса2");
        main.mapProduct.put(null , null);
        main.mapProduct.put("продукт2", "сыр");
        main.mapProduct.put("продукт3", "молоко");
        main.mapProduct.put("авто1", "ваз");
        main.mapProduct.put("мой авто", "123456");
        main.mapProduct.put("авто4", "ваз002");
        for (Map.Entry<String,String> entry: main.mapProduct.entrySet()){
            System.out.println( entry.getKey()+"||"+ entry.getValue());

        }
        for(String set: main.mapProduct.keySet()){
            System.out.println(set);
        }

        main.mapProduct.entrySet().stream().forEach( (m)->System.out.println(m.getKey()+"|*|"+m.getValue()));

    }


}
