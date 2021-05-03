package org.example.test_junitest.sobes.puzzles;

public class EqualsObjectTest {

    public boolean equals(EqualsObjectTest other) {
        System.out.println("Inside of EqualsObjectTest");
        return false;
    }

    public static void main(String[] args) {
        Object t1 = new EqualsObjectTest();
        Object t2 = new EqualsObjectTest();
        EqualsObjectTest t3 = new EqualsObjectTest();
Object o1 = new Object();
int count =0;
        System.out.println(count++); //0
        t1.equals(t2);

        System.out.println(count++);//1
        t1.equals(t3);
        System.out.println(count++);//2
        t3.equals(o1);
        /*
        * При связывании перегруженных методов используется
        *  раннее связывание (early binding).
        * Тип используемого метода определяется по типу переменной.
        * */
        System.out.println(count++);//3
        t3.equals(t3);
        System.out.println(count++);//4
        t3.equals(t2);
    }


}
