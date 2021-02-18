package org.example.test_junitest.sobes.objects;

public class TestA {
    {//2
        System.out.println("A1");
    }
    static{ //1 init first
        System.out.println("A2");
    }
    public TestA(){//3
        System.out.println("A3");
    }
}
