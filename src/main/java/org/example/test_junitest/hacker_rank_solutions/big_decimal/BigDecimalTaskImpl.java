package org.example.test_junitest.hacker_rank_solutions.big_decimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimalTaskImpl implements BigDecimalTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        String[] numbers = new String[count + 2];
        for (int i = 0; i < count; i++) {
            numbers[i] = scan.next();
        }
        scan.close();

        Comparator<String> comparator= (o1, o2) -> {
            BigDecimal num1 = new BigDecimal(o1);
            BigDecimal num2 = new BigDecimal(o2);
            return num2.compareTo(num1);
        };
            Arrays.sort(numbers,0,count,comparator);
        System.out.println(Arrays.toString(numbers));
    }


    @Override
    public String[] runBigDecimal(String[] bigDecimalElements) {
        String expectedString = Arrays.toString(bigDecimalElements);
        System.out.println(expectedString);
        Comparator<String> bigDecimalComparator = (o1, o2) -> {
            BigDecimal num1 = new BigDecimal(o1);
            BigDecimal num2 = new BigDecimal(o2);

            return num2.compareTo(num1);//сортируем в порядку убывания(sort in descending order)
        };
      Arrays.sort(bigDecimalElements,bigDecimalComparator);
      return bigDecimalElements;
    }
}
