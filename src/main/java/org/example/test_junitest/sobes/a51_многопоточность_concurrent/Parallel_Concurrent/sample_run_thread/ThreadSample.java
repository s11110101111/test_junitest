package org.example.test_junitest.sobes.a51_многопоточность_concurrent.Parallel_Concurrent.sample_run_thread;

import org.example.test_junitest.sobes.a01_кор_джава.enum_test.ColorANSI;

// 1. унаслодоваться от Thread и переопределить метод run
public class ThreadSample extends Thread {


    @Override
    public void run() {
        String msg = ColorANSI.PURPLE.fillColor("do multiThread task 1 )");
        System.out.println(msg);

    }

    public static void main(String[] args) {
        ThreadSample ts1 = new ThreadSample();
        ts1.start();
    }
}
