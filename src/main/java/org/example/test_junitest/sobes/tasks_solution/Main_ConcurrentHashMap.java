package org.example.test_junitest.sobes.tasks_solution;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Main_ConcurrentHashMap {
    public static void main(String[] args) {

        //Вставка по хэшкоду в итератере который не бросает исключения
        //не гарантирует место всавки иногда всавляет после прохода итератора
        Set<String> set = Collections.newSetFromMap(new ConcurrentHashMap<>());
        set.add("aaa");
        set.add("bbb");

        for (String s : set) {
            set.add("ddd");
            System.out.println(s);
        }

        Set<String> setTwo = Collections.newSetFromMap(new ConcurrentHashMap<>());
        setTwo.add("aaa");
        setTwo.add("bbb");

        System.out.println();

        for (String s : setTwo) {
            setTwo.add("CCC");
            System.out.println(s);
        }
    }
}