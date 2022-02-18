package org.example.test_junitest.sobes.lambda.example_solving_problem_lambda_to_method.count_find_elements;

/**
 * Функциональный обобщенный интерфейс для подсчета количества найденных элементов в массиве
 */

public interface CountFindElementInterface<T> {

    int countItemsIn(T item, T[] array);

}
