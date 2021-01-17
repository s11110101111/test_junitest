package org.example.test_junitest.sobes.Parallel_Concurrent;

import org.example.test_junitest.sobes.enum_test.ColorANSI;

public class MainParallel {
    private static int count = 0;

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                count = 0;
                for (int i = 0; i < 5; i++) {
                    count = count + 1;
                    if (Thread.currentThread().getName().equals("Thread-1")) {
                        System.out.println(ColorANSI.PURPLE.fillColor(Thread.currentThread().getName() + " " + count));
                    } else {
                        System.out.println(ColorANSI.YELLOW.fillColor(Thread.currentThread().getName() + " " + count));
                    }
                }
            }
        };
        Thread thr = new Thread(rn);
        Thread thr1 = new Thread(rn);

        thr.start();
        thr1.start();

    }

    public static void test2() {

    }


}
