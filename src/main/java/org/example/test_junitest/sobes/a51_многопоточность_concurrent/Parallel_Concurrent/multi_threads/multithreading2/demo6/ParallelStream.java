package org.example.test_junitest.sobes.a51_многопоточность_concurrent.Parallel_Concurrent.multi_threads.multithreading2.demo6;

import java.util.Arrays;

public class ParallelStream {

    public static void main(String[] args) {
        int[] array = Commons.prepareArray();


        long startTime = System.currentTimeMillis();

        double sum = Arrays.stream(array)
                .parallel()
                .sequential()
                .peek(System.out::print)
                .mapToDouble(Commons::function)
                .sum();

        long endTime = System.currentTimeMillis();

        System.out.println("sum = " + sum);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
