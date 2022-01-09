package org.example.test_junitest.hacker_rank_solutions.big_decimal;

import java.util.Arrays;

public class BigDecimalTaskImpl implements BigDecimalTask {
    @Override
    public void runBigDecimal(String[] bigDecimalElements) {
      String expectedString =  Arrays.toString(bigDecimalElements);
        System.out.println( expectedString);
    }
}
