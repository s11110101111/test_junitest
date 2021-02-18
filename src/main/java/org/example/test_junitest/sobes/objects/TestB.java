package org.example.test_junitest.sobes.objects;

public class TestB extends TestA{
    { //2 after init TestA
        System.out.println("B1");
    }
    static{ // 1 at parentsA
        System.out.println("B2");
    }
    public TestB(){//3
        System.out.println("B3");
    }
}
