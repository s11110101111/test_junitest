package org.example.test_junitest.sobes.a1_кор_джава.способы_перекрытия_main;

public class ChangeMainMethodClassString {
class String{

}
    public static void main(String[] args) {
        System.out.println("String");

    }
//ПЕРЕКРЫТЬ МЕТОД МАЙН
    public static void main(java.lang.String[] args) {
        System.out.println("asaString");

    }

}
