package org.example.test_junitest.sobes.algoritms.mergesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SortMergeArray {
static int level= 1;
    public static void main(String[] args) {
        int[] aa = {12,1,3,56,18,4,1,76,10,2};
        mergeSort(aa);
        Arrays.stream(aa).forEach(System.out::println);
    }
    static void mergeSort(int[] array) {
    /*
        List<Integer> as = new ArrayList<>();
         Arrays.sort(array);
     */

        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length - 1);
    }

    static void mergeSort(int[] array, int[] helper, int low, int high ) {

        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, helper, low, middle); // продолжим сортировку левой стороны

            mergeSort(array, helper, middle + 1, high); //   let sort right size array;

            merge(array, helper, low, middle, high); // сольем все в один массив отсортированный
            System.out.println("end split "+ Arrays.toString(array));
        }


    }



    static void merge(int[] array, int[] helper, int low, int middle, int high) {


        //cory both size array  in to helper

        //     helper = Arrays.copyOfRange(array,low,high);

        for (int i = 0; i <= high; i++) {
            helper[i] = array[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;
        // перебор массива хелпер . сравниваем левую и правую половины и копируем меньший элемент из двух  половин
        //в исходный массив
        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
//
                array[current] = helper[helperLeft];
                helperLeft++;
            } else { // иначе правый больше
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        /* остаток левой сторонв копируется в целевой массив т.к.
         если осталсь с права то они уже есть там от первого копирования*/

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }

    }

}
