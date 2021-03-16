package org.example.test_junitest.sobes.luxoft;

import java.util.function.Function;
@FunctionalInterface
public interface InterfaceFunctional {
    void methodFun1(String sss);
    default void methodFunDef(String sss){
        System.out.println("def functional method methodFunDef");
    }
    default String methodFunDef(){
        System.out.println("second def methodFunDef return String");
        return "second def methodFunDef return String";

    }
    static String methodFunDef1(){
        return"static";
    }
}
