package org.example.test_junitest.sobes.enum_test;

public class MainTestEnum {
    public static void main(String[] args) {
        int a=13;
        int b = -5;
        TestEnum ts= TestEnum.TEST1;

        System.out.println(TestEnum.TEST1.ordinal());
        System.out.println(ts.action(a,b));

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println("----    ----    ----");
        System.out.println(Integer.toBinaryString(TestEnum.Test3.action(a,b)));

    }
}
