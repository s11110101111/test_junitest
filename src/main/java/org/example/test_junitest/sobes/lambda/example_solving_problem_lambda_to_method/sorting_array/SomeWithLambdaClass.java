package org.example.test_junitest.sobes.lambda.example_solving_problem_lambda_to_method.sorting_array;

import java.util.Arrays;

/**
 * Реализуем сортировку с использованием Функционального интерфейса и лямбды
 */

public class SomeWithLambdaClass {

    //класса содержит метод, которому передается лямбда
    static class SomeSortMethods {

        void SortStringArray(String[] array, SortingStringArray refSort) {
            refSort.SortArray(array);
            Arrays.stream(array).forEach(System.out::println);
        }
    }

    public static void main(String... args) {
//Объявим ссылку на интерфейс сортировка вставкой
        SortingStringArray sortRef;
        sortRef = (arr) -> {
            String temp;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i; j > 0; j--) {
                    if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        };
        String[] strings = {"abc", "sdr", "Sdf", "aBc", "gtd", "eoc", "bcdes", "bcde"};

        SomeSortMethods someSortMethods = new SomeSortMethods();
        someSortMethods.SortStringArray(strings, sortRef);
    }
}
