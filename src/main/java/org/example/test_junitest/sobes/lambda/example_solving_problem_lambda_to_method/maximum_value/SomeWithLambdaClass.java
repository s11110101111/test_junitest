package org.example.test_junitest.sobes.lambda.example_solving_problem_lambda_to_method.maximum_value;

/**
 *
 */

public class SomeWithLambdaClass {

    public static <T extends Number> void SolutionTask(T[] array, MaximumInArray<T> ref) {

        T maxValue = ref.max(array);
        System.out.println("Max value = " + maxValue);
    }

    public static void main(String[] args) {
// реализуем лямбда интерфейс
        MaximumInArray<Integer> refInt = (array) -> {

            Integer max = array[0];
            for (Integer integer : array) {
                if (integer > max) {
                    max = integer;
                }
            }
            return max;

        };
        Integer[] givenArr = {1, 15, 2, 8, 34, 0, 22};
        SolutionTask(givenArr, refInt);
    }
}