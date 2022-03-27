package org.example.test_junitest.hacker_rank_solutions.data_structures.array_1d_part2;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.logging.Logger;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 */

class Array1DPart2SolutionTest {

    Array1DPart2Solution array1DPart2Solution;
    Logger log = Logger.getLogger(Array1DPart2SolutionTest.class.getName());
    ;
    static int countT = 1;

    @BeforeEach
    void setUp() {
        array1DPart2Solution = new Array1DPart2SolutionImpl();

        log.info("===count test# " + countT);
        countT++;
    }

    @ParameterizedTest
    @MethodSource("getParamForGameTest")
    void isWinWithTwoArgs(int leap, int[] game, boolean isWin) {
        Assertions.assertThat(array1DPart2Solution.canWin(leap, game)).isEqualTo(isWin);

    }

    static Stream<Arguments> getParamForGameTest() {
        return Stream.of(
            arguments(3, new int[]{0, 0, 0, 0, 0}, true),
            arguments(5, new int[]{0, 0, 0, 1, 1, 1}, true),
            arguments(3, new int[]{0, 0, 1, 1, 1, 1, 0}, false),
            arguments(1, new int[]{0, 1, 0}, false));
    }

}