package org.example.test_junitest.stream_api;

import org.example.test_junitest.sobes.a01_кор_джава.enum_test.ColorANSI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example_stream_Tasks {

    static int[] getUniqueValue(int[] array1, int[] array2){
    //Вывести все уникальные занчения

        IntStream st1 = Arrays.stream(array1);
        IntStream st2 =  Arrays.stream(array2);
        return IntStream.concat(st1, st2)
                .sorted()
              //  .peek(System.out::print)
                .distinct()
                .toArray();
               // .peek(System.out::print)
               // .max()
                // .count()

        //с count peak ничего не выдал???
        //System.out.println(Arrays.toString(ar));

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getUniqueValue(new int[]{1,2,3,5,6,11,8},new int[]{1,2,3,2,6,8,10})));
        ColorANSI.PURPLE.printLn(Arrays.toString(getUniqueValue(new int[]{1,2,3,5,6,11,8},new int[]{1,2,3,2,6,8,10})));
    }
}
