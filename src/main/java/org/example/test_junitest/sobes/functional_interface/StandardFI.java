package org.example.test_junitest.sobes.functional_interface;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class StandardFI {

    public static void testPredicate() {
        //утверждение
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
        //потребитель
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
    public static void testSupplier(){
        //поставщик
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                System.out.println("method get ok");
                return LocalDate.now().toString();
            }

        };
        System.out.println(supplier.get());

    }
    public static void testFunction(){
        Function<String,Integer> funcToInt = Integer::valueOf;
        //string to int , int to string
        Function<String,String > funcBackToString = funcToInt.andThen(String::valueOf);
        System.out.println(funcBackToString .apply("1234"));
    }
    public static void testUnaryOperator(){
        UnaryOperator<String> unaryOperator=s-> s.toUpperCase()+"===ssss";
        System.out.println(unaryOperator.apply("unaryoperator )"));
    }

    public static void main(String[] args) {

        testPredicate();
        testConsumer();
        testSupplier();
        testFunction();
        testUnaryOperator();
    }
}
