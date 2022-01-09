package org.example.test_junitest.hacker_rank_solutions.big_decimal;

import org.example.test_junitest.test_helper.TestHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BigDecimalTaskTest {
    private BigDecimalTask bgt = TestHelper.getInstance(BigDecimalTask.class);
    String[] bigElements = {"9","-100","50","0","56.6","90","0.12",".12","02.34","000.000"};
    // первый элемент количество элементов в массиве
    @BeforeEach
    void setUp() {

    }

    @Test
    void runBigDecimal() {
        bgt.runBigDecimal(bigElements);
        String actualString = Arrays.toString(bigElements);
        assertThat(actualString).isEqualTo("[90, 56.6, 50, 02.34, 0.12, .12, 0, 000.000, -100]");
    }
}