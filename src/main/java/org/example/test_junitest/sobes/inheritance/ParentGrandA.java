package org.example.test_junitest.sobes.inheritance;

import java.sql.SQLOutput;

public class ParentGrandA implements InterfaceGrandA {
    public static String statPub="fdc";
    public String pub;
    private String privPub;
    String defPub;

    public static class StaticInnerClass{
     String asd = statPub;
        void goo(){
            statPub="ctatic";

        }

    }


    {
        System.out.println("create ParentGrandA " + this);
    }


    public void runPublic(){
        System.out.println("+++Public++++ \n");
        methodInfGrandA();
    }


    @Override
    public void foo() {
             System.out.println("Foo method grantA x = " + x );
    }
    public void methodInfGrandA(double dd) {
        System.out.println("+++++++ =================\ncal method InfGrandA overLoad " + this.getClass());
        System.out.println(methodStringGrandA());
    }
    @Override
    public void methodInfGrandA() {
        System.out.println("+++++++ \ncal method InfGrandA " + this.getClass());
        System.out.println(methodStringGrandA());
    }

    @Override
    public String methodStringGrandA() {
        return "MethodStringGrandA  return string";
    }
}
