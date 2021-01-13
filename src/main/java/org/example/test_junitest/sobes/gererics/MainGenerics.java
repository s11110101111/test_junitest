package org.example.test_junitest.sobes.gererics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGenerics {
//https://habr.com/ru/company/sberbank/blog/416413/
    public static void main(String[] args) {
        //1 откуда ошибка без проверки типов в рунтайме
        String[] strs = new String[]{"12","34", "56","12"};
        Arrays.stream(strs).forEach(System.out::println);
        Object[] arr = strs;
        arr[0]=42;
        Arrays.stream(arr).forEach(System.out::println);
        //2 Дженерики инвариантны проверка типов на этапу компиляции
        List<Integer> ints = Arrays.asList(1,2,34,56,12,12);
        //List <Number> num =ints;
        // 3  ковариантность

        List<? extends  Number> nums = ints;
        nums.stream().forEach(System.out::println);


       }
}
