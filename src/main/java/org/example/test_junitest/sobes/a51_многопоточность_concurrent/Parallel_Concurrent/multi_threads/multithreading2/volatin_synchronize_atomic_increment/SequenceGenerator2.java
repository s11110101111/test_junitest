package org.example.test_junitest.sobes.a51_многопоточность_concurrent.Parallel_Concurrent.multi_threads.multithreading2.volatin_synchronize_atomic_increment;

import java.util.ArrayList;
import java.util.List;

public class SequenceGenerator2 {

    private static int counter = 0;
//  its good work
    public static synchronized int nextInt() {
        return counter++;
    }


    public static void main(String[] args) throws Exception {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 1000; ++i) {
            Thread thread = new Thread(() -> System.out.println(nextInt()));
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Counter final value: " + counter);
    }
}
