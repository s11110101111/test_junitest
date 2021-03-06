package org.example.test_junitest.sobes.luxoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Task {

public static void reduplicateSetCollection(int[] input){

    Set<Integer> set = Arrays.stream(input).boxed().collect(Collectors.toSet());

    int i=0;
    for (Integer element: set){
        if (i != 0) System.out.print(", ");
        System.out.print(element);
        i=1;
    }
}
    public static void removeDuplicateSet(int[] input) {
        Set<Integer> set = new HashSet<>();
        int sizeInput = input.length;

        Arrays.stream(input).forEach((s) -> set.add(s));
        set.stream().forEach(element -> System.out.println(element));
        if (set.size() == sizeInput)
            System.out.println("нет повторов в массиве)");
        StringBuilder sb = new StringBuilder();
        String prefix = "";


        for (Integer element : set) {
            sb.append(prefix);
            prefix = ", ";
            sb.append(element);
        }
        System.out.println(sb.toString());

    }

    public static void getDuplicate(int[] arr) {
        final Map<Integer, Integer> map = new HashMap<>();

        Arrays.stream(arr).forEach(a -> {

            if (map.containsKey(a)) {
                int count = map.get(a) + 1;
                map.put(a, count);
            } else {
                map.put(a, 1);
            }
        });

// 1 обход
        map.entrySet().forEach((a) -> {
            if (a.getValue() > 1) {
                System.out.println(a);
            }
        });
//2 обход
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) System.out.println(entry.getKey());
        }
        // 3 обход

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            if (entry.getValue() > 1) System.out.println(entry.getKey());
        }

    }


    public static void main(String[] args) {
        int[] input = {1, 2, 34, 17, 1, 45, 12, 1, 17};
        getDuplicate(input);
        System.out.println("--------------------1");
        removeDuplicateSet(input);
        System.out.println("--------------------2");
        reduplicateSetCollection(input);

    }
}
