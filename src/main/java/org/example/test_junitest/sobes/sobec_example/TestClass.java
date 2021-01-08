package org.example.test_junitest.sobes.sobec_example;

public class TestClass {
    private String str ="set str in constructor";
    static String strStatic ="Static Str in constructor";
    {
        System.out.println("non- static block init //str=" + str);
        str = "str in non- static block init";
        strStatic ="Static Str in non-static block init";
    }

    static{
        System.out.println("static block init //str=" + strStatic);
        strStatic = "static str in static block init";
    }
    public void go(){
        System.out.println("call method non-static " + str);
        System.out.println("call method non-static " + strStatic);
        strStatic ="Static Str in method run";

    }

}
