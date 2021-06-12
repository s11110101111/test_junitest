package org.example.test_junitest.sobes.luxoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task {


    public static void removeDuplicateSet(int[] input) {
        Set<Integer> set = new HashSet<>();
        int sizeInput = input.length;
        Arrays.stream(input).forEach((s) -> set.add(s));
        if (set.size() == sizeInput)
            System.out.println("нет повторов в массиве)");
        StringBuilder sb = new StringBuilder();
        String prefix = "";

        for (Integer element : set) {
            sb.append(prefix);
            prefix = ", ";
            sb.append(element);
        }


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

    }
}
