package org.example.test_junitest.sobes.functional_interface;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFI {

    public static void testPredicate() {
        boolean result = false;
        Predicate<String> strPredict = s -> s.length() > 0;
        Predicate<String> strPredict1 = s -> s.contains("AS");
        result = strPredict.test("ASDFG");
        System.out.println("Length >0" + result);
        result = strPredict.negate().test("ASDFG");
        System.out.println("Length !>0" + result);


        result = strPredict.and(strPredict1).test("sSDFGH");

        System.out.println(">0 и содержить AS " + result);
        result = strPredict.and(s -> s.contains("sS")).test("sSDFGH");
        System.out.println(">0 и содержить sS " + result);
    }

    public static void testConsumer() {
        Consumer<String> consumer = s -> System.out.println(s + " потребитель не спит");
        consumer.accept(" let get soap ");
        consumer = s -> {
            System.out.println(s + " потребитель не спит");
            System.out.println("============");
            s = s.toLowerCase() + LocalDate.now();
            System.out.println(s);
        };
        consumer.accept(" let get soap ");
    }

    public static void main(String[] args) {

        testPredicate();
        testConsumer();
    }
}
