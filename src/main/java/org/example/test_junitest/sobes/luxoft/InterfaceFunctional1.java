package org.example.test_junitest.sobes.luxoft;

public interface InterfaceFunctional1 {
    void methodFun(String sss);
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
