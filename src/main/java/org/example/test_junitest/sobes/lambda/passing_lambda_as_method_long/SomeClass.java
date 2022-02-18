package org.example.test_junitest.sobes.lambda.passing_lambda_as_method_long;

/**
 * Класс содержит имплементацию метода, который принимает в качестве параметра ссылку на интерфейс
 * SomethingCalcFunctionalInterface предварительно формируем ссылку в виде лямбды и передаем ее в
 * метод полезен кода ламбда слишком большая The class containing the implementation of the method
 * that receives as a parameter a reference to the AverageCalcInterface interface
 */

public class SomeClass {

    public void PrintSomethingCalc(SomethingCalcFunctionalInterface ref) {
        System.out.println("Something calc = " + ref.somethingCalculate(44, 33, 3));
    }

    public static void main(String... args) {
        SomethingCalcFunctionalInterface somethingCalcRef;
        somethingCalcRef = (a, b, c) -> (a + b + c) / 3.0;
        SomeClass someClass = new SomeClass();
        someClass.PrintSomethingCalc(somethingCalcRef);

        somethingCalcRef = (a, b, c) -> (a * b * c) + 2000.0;
        someClass.PrintSomethingCalc(somethingCalcRef);
    }
}
