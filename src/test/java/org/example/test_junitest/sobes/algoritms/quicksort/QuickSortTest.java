package org.example.test_junitest.sobes.algoritms.quicksort;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
//Test to run
public class QuickSortTest {
public  int[] array;
    @Before
    public void setUp() throws Exception {
        array = new int[]{1, 2, 4, 8, 67, -1, 6, 9, 23, 14, 4};

    }

    @Test
    public void quickSort() {
        System.out.println("UnSort array "+ Arrays.toString(array));
        QuickSort.quickSort(array);
        System.out.println("Sorted array "+ Arrays.toString(array));
    }
}