package org.example.test_junitest.sobes.sobec_example;

public class Main_sobes_app {
    public static void main(String[] args) {
//        System.out.println(TestClass.strStatic);
//        new TestClass().go();
//        System.out.println(TestClass.strStatic);
        StaticClass.statTop = "set static var in app start";
        System.out.println(StaticClass.statTop);
        StaticClass  staticClass = new StaticClass();
        System.out.println(staticClass.strTop );
            staticClass.go();
    }
}
