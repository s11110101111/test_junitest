package org.example.test_junitest.sobes.a51_многопоточность_concurrent.Parallel_Concurrent.multi_threads.multithreading2.volatin_synchronize_atomic_increment;

import java.util.ArrayList;
import java.util.List;

public class SequenceGenerator1 {
//volatile не спасает  нужен синхронайз метода коурнтекра
    private static volatile int counter = 0;

    public static int nextInt() {
        return counter++; // broken!
    }


    public static void main(String[] args) throws Exception {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(() ->{
                for (int j = 0; j < 1000; j++) {
                nextInt();

                }

            } );
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Counter final value: " + counter);
    }
}
