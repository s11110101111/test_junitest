package org.example.test_junitest.sobes.gererics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGenerics {
//https://habr.com/ru/company/sberbank/blog/416413/


    public static void main(String[] args) {


        ArrayList<String> strs = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        strs.add("asa");
       Generic_Type<Integer> typeG= new Generic_Type<>();
       typeG.print(strs);
       Generic_Type.<Double>getFirst(0.003);
        Generic_Type.getFirst(0.003);

        arrayList = strs; // Ok
        strs = arrayList; // Unchecked assignment
        arrayList.add(1); //unchecked call

        //0System.out.println(arrayList.get(0).getClass().getTypeName());
        //System.out.println(strs.get(0).getClass().getTypeName());
        //strs.forEach(System.out::println);
        //arrayList.forEach(System.out::println);
        List<Integer> int1 = Arrays.asList(1, 2, 3, 45, 67, 89);
        String[] str1 = "12345667894937249hfhhdf302".split("(?<=\\G.{3})");
        Arrays.stream(str1).forEach(System.out::println);



    }


}
