package org.example.test_junitest.sobes.classes_methods;

import java.io.IOException;

public class TasksMethodObject {
    void method()throws IOException {

    }
//  already defined
//    String method()throws Error {
//return null;
//    }
    static void method1(TasksMethodObject t) {
        System.out.println("task  Task method1");

    }
        static void method1(Object a){
        System.out.println("task  object method1");
    }


    public static void main(String[] args) {
        Object t1 = new Object();
        method1(t1);
        Object t2 = new TasksMethodObject();
        method1(t2);
        TasksMethodObject t3 = new TasksMethodObject();
      method1(t3);
    }
}
