package org.example.test_junitest.sobes.Parallel_Concurrent;

import org.example.test_junitest.sobes.enum_test.ColorANSI;

public class MainParallel {
    private static int count = 0;

    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
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
            }
        };
        Thread thr = new Thread(rn);
        Thread thr1 = new Thread(rn);

        thr.start();
        thr1.start();

    }

    public static void test2() {
        StringBuilder stb = new StringBuilder();
        Runnable rnb = new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                String text = " it always seems impossible until it's done. Hello Hi Hello Pure Pure Pleasure HUUUU Foooo Hello Hi Hello Pure Pure Pleasure HUUUU Foooo ";
                if (threadName.equals("Thread-0")) {
                    threadName = ColorANSI.RED.fillColor(threadName);
                    text= ColorANSI.RED.fillColor(text);
                }
                if (threadName.equals("Thread-1")) {
                    threadName = ColorANSI.YELLOW.fillColor(threadName);
                    text= ColorANSI.YELLOW.fillColor(text);
                }
                if (threadName.equals("Thread-2")) {
                    threadName = ColorANSI.PURPLE.fillColor(threadName);
                    text= ColorANSI.PURPLE.fillColor(text);
                }
                if (threadName.equals("Thread-3")) {
                    threadName = ColorANSI.BLUE.fillColor(threadName);
                    text= ColorANSI.BLUE.fillColor(text);
                }

                stb
                        .append(threadName)
                        .append("\n")
                        .append(text)
                        .append("\n");
            }
        };
        Thread thr = new Thread(rnb);
        Thread thr1 = new Thread(rnb);
        Thread thr2 = new Thread(rnb);
        Thread thr3 = new Thread(rnb);

        thr.start();
        thr1.start();
        thr2.start();
        thr3.start();

        try {
            thr.join();
            thr1.join();
            thr2.join();
            thr3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stb);

    }


}
