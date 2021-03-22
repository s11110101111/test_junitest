package org.example.test_junitest.sobes.tasks_solution;

public class Test {
    public void print(Integer x) {
        System.out.print("Integer");
    }
    public void print(float x) {
        System.out.print("float");
    }
    public void print(Object x) {
        System.out.print("Object");
    }
    public static void main(String[] args) {
        Test t = new Test();
        short s = 123;
        t.print(s);
        t.print(true);
        t.print(6.789);
    }
}