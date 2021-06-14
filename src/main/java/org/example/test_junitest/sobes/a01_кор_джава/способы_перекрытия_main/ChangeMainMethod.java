package org.example.test_junitest.sobes.a01_кор_джава.способы_перекрытия_main;

public class ChangeMainMethod {
    public static void main(String[] args) {
        System.out.println("String");

    }
//ПЕРЕКРЫТЬ МЕТОД МАЙН
    //    public static void main(String[] args) {
//        System.out.println("asaString");

//    }
static {
    System.out.println("changed String");
}

}
