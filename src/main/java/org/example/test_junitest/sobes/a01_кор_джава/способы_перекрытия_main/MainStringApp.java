package org.example.test_junitest.sobes.a01_кор_джава.способы_перекрытия_main;

import java.util.Arrays;

public class MainStringApp {
    public static void main(String[] args) {
            String str = new String("ABCDFGHJ");
        str.chars().forEach(System.out::println);
         char cc ;
        Character c = '\u0001';
        System.out.println( "\\u" + Integer.toHexString('\n' | 0x10000).substring(1) );
        for(int i = 0 ; i<= 100;i++){

            c= (char) i;
            System.out.println("code "+i+" -> "  + c.toString() + " " +c.charValue());

String str1 = "sdff sdfsd sdfdsfds dfsa sasasa sdfg";
            int count =(int) Arrays.asList(str1.split(" ")).stream().filter(s -> s.length() == 4).count();
            System.out.println(count);

        }


    }
}
