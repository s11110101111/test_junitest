package org.example.test_junitest.sobes.lambda.example_solving_problem_lambda_to_method.maximum_value;

/**
 * Функциональный интерфейс возвращает максимальный элемент в цифровом массиве
 */

@FunctionalInterface
public interface MaximumInArray<T extends Number> {

    T max(T[] array);
}
