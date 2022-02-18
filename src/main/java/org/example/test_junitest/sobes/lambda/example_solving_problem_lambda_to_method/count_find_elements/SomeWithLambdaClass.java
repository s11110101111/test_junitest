package org.example.test_junitest.sobes.lambda.example_solving_problem_lambda_to_method.count_find_elements;

/**
 *
 */

public class SomeWithLambdaClass {

    static class FindElements<T> {

        int findElements(T item, T[] array, CountFindElementInterface<T> ref) {
            return ref.countItemsIn(item, array);
        }
    }

    public static void main(String... args) {
        //Реализуем интерфейс для подсчета вхождений в строковый массив
        CountFindElementInterface<String> ref;

        ref = (item, array) -> {
            int count = 0;
            for (String element : array) {
                if (element.equals(item)) {
                    count++;
                }
            }
            return count;
        };

        String[] strings = {"abc", "sdr", "Sdf", "abc", "aBc", "gtd", "eoc", "bcdes", "bcde"};
        FindElements<String> someClass = new FindElements<String>();

        System.out.println("Найдено элементов " + someClass.findElements("abc", strings, ref));

    }

}
