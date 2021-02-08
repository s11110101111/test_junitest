package org.example.test_junitest.sobes.sber_game;

import org.hibernate.type.IntegerType;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainSberAPP {

    public static void main(String[] args) {
        String str1 = "sdff sdfsd sdfdsfds dfsa sasasa sdfg";
        System.out.println(extractedNameTask1(str1));
        Integer[] in ={10, 12, 4, 6, 2, 6};
        List<Integer> crew = Arrays.asList(in);
        getTimeBatle( crew,2);
    }

    private static int extractedNameTask1(String name) {

        int count = (int) Arrays.asList(name.split(" ")).stream().filter(s -> s.length() == 4).count();
        return count;
    }

    private static int getTimeBatle(List<Integer> crew, int g) {
        int time = 0;
        return time;
    }
}
