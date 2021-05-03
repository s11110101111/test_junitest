package org.example.test_junitest.sobes.puzzles;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static <E> void listType(List<E> list) {
//IAE

        //        if(list instanceof ArrayList<Integer>){
//        System.out.println("ArrayList!");
//        }

    }

    public static void main(String[] args) {

        int _1 =0;
        List<String> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        MyClass.listType(list1);
        MyClass.listType(list2);
    }

}
