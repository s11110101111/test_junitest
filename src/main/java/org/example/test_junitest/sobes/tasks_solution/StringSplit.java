package org.example.test_junitest.sobes.tasks_solution;
//разбоить  строку по два символа и дополнить _
public class StringSplit {
    public static String[] solution(String s) {
        if (s.length()%2!=0){ s +="_";}
        String[] test = new String[s.length()];

        test = s.split("(?<=\\G.{2})");

        return test;

    }
}