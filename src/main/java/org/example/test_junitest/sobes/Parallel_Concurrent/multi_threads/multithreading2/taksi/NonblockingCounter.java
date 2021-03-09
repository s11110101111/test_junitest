package org.example.test_junitest.sobes.Parallel_Concurrent.multi_threads.multithreading2.taksi;


import java.util.concurrent.atomic.AtomicInteger;

public class NonblockingCounter {
    private AtomicInteger value;

    public int getValue() {
        return value.get();
    }

    public int increment() {
        int v;

        while (true){
            v = value.get();

            while (!value.compareAndSet(v,v + 1))
                return v + 1;

        }
    }
}