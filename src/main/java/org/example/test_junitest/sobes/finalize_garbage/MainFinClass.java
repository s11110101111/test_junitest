package org.example.test_junitest.sobes.finalize_garbage;

public class MainFinClass {


    public static void main(String[] args) {

        for (int i=1;i<1000;i++) {
            TestFinClass t = new TestFinClass(i);
            t.aaa();
            t= null;
            System.gc();
            t=new TestFinClass(i);
            t.aaa();
            System.out.println("!!!done");
        }
    }

}
