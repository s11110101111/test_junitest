package org.example.test_junitest.sobes.a01_кор_джава.enum_test;

public enum TestEnum {
    TEST1("test 1"){
        public int action(int a, int b){return a+b;}
    },
    TEST2("test 2"){
        public int action(int a, int b){return a*b;}
    },
    Test3("test 3"){
        public int action(int a, int b){return a|b;}
    };
    private String test;

    TestEnum(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }
public abstract int action(int a , int b);

}
