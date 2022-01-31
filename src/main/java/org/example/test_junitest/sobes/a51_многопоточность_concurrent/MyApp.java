package org.example.test_junitest.sobes.a51_многопоточность_concurrent;

public class MyApp {
    public static void main(String[] args) {
        Thread td = new Thread(() -> {
            System.out.println("you could run for lambda");
        });
        td.start();
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("you could run from anonymous class");
            }
        };
        td = new Thread(r);
        td.start();

        td = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("or you could run from set create anonymous class in constructor");
            }

        });
        td.start();
    }
    }
