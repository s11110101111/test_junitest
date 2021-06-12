package org.example.test_junitest.sobes.regexp;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainRegExp {

    public static void main(String[] args) {
        // проверка на соответствие шаблону
        // pattern matching
        Pattern p1 = Pattern.compile("a+y");
        Matcher m1 = p1.matcher("aaaay");
        boolean b = m1.matches();
        System.out.println(b);
        //поиск и выбор подстроки
        // substring search and selection
        String regex = "(\\w{3,})@(\\w+\\.)([a-z]{2,4})";
        String s = "адреса электронной почты : test1@test.test, alena123@gmail.com, ser@fon.don";
        p1 = Pattern.compile(regex);
        m1 = p1.matcher(s);
        while (m1.find()) {
            System.out.println("e-mail: " + m1.group());
        }
        //разбиение строки на подстроки
        // splitting a string into substrings
        Pattern p2 = Pattern.compile("\\d+\\s?");
        String[] arrayWord = p2.split("java5notNeed 77 java11only");
        System.out.println(Arrays.toString(arrayWord));
        //Использование групп, а также собственных и неполных квантификаторов
        // Using Groups and Native and Incomplete Quantifiers
        String input = "abcdefxyz";
        simpleMatches("([a-z]*)([a-z]+)",input);
        simpleMatches("([a-z]?)([a-z]+)",input);
        simpleMatches("([a-z]+)([a-z]*)",input);
        simpleMatches("([a-z]?)([a-z]?)",input);
    }

    public static void simpleMatches(String regex, String input){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(input);
        if(matcher.matches()){
            System.out.println("First group: "+matcher.group(1));
            System.out.println("Second group: "+matcher.group(2) +"\n");
        }else{
            System.out.println("Nothing((\n");
        }
    }
}
