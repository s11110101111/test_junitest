package org.example.test_junitest.sobes.tasks_solution;

public class MainTask1 {


    static String str = "Hello";

    public static void change(String s) {
        s = "world";
    }

    public static void main(String[] args) {
        System.out.println(str);
        change(str);
        System.out.println(str);
    }
}

