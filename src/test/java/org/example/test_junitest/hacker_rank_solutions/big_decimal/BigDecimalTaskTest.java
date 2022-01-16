package org.example.test_junitest.hacker_rank_solutions.big_decimal;

import org.example.test_junitest.test_helper.TestHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("HackerRank solution BigDecimal task.")
class BigDecimalTaskTest {
    private BigDecimalTask bgt = TestHelper.getInstance(BigDecimalTask.class);
    String[] bigElements = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
    //  по условию задачи сперва вводится номер количества вводов сканера в массисв,
    //  но мы обработаем уже готовый массив строк с цифрами

    @Test
    void runBigDecimal() {
        String[] sortElements = bgt.runBigDecimal(bigElements);
        String actualString = Arrays.toString(sortElements);
        assertThat(actualString).isEqualTo("[90, 56.6, 50, 02.34, 0.12, .12, 0, 000.000, -100]");
    }
}