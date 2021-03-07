package org.example.test_junitest.sobes.tasks_solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public  class ArraysUtils {

    public static Map getMapCountNumber(List<Integer> listInt){

        final Map<Integer,Integer> mapInt = new HashMap<>();

        if (listInt.isEmpty()||listInt==null) {
            return mapInt;
        }
        for(Integer num: listInt) {

      mapInt.computeIfPresent(num, (a,b) -> mapInt.get(num)+1);
      mapInt.computeIfAbsent(num, n ->1 );
        }
        return mapInt;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,1,2,3,4,5,8,7,6,6,3,9,8,0,9,0,3,2,5);
        Map mapCountNumber = getMapCountNumber(input);
        System.out.println(mapCountNumber.toString());
    }


}
