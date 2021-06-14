package org.example.test_junitest.sobes.a51_многопоточность_concurrent.Parallel_Concurrent.multi_threads.multithreading2.volatin_synchronize_atomic_increment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator3AtomicInt {

    private static final AtomicInteger counter = new AtomicInteger();

    public static int nextInt() {
        return counter.getAndIncrement();
    }


    public static void main(String[] args) throws Exception {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j <1000 ; j++) {
                    System.out.println(nextInt() +" "+Thread.currentThread().getName() );
                }

            }
                );
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Counter final value: " + counter.get());
    }
}
