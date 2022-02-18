package org.example.test_junitest.sobes.lambda.passing_lambda_as_method_directly;

/**
 * Класс содержит имплементацию метода, который принимает в качестве параметра ссылку на интерфейс
 * AverageCalcInterface
 * <p>
 * The class containing the implementation of the method that receives as a parameter a reference to
 * the AverageCalcInterface interface
 */

public class SomeClass {

    public void PrintAverage(AverageCalcInteraface referenceAvg) {
        System.out.println(
            "SomethingCalculate =" + referenceAvg.SomethingComputeThreeNumbers(33, 33, 2));
    }

    public static void main(String[] args) {
        //создадим экземпляр класса, вызовем метод и передадим в него
        //ламбда выражение как реализацию нашего интерфейса
        SomeClass calcClass = new SomeClass();
        calcClass.PrintAverage((a, b, c) -> (a * b * c));
        calcClass.PrintAverage(((a, b, c) -> (a + b + c)));
        calcClass.PrintAverage(((a, b, c) -> ((a + b + c) / 3.0)));
    }
}
