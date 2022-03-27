package org.example.test_junitest.hacker_rank_solutions.data_structures.array_1d_part2;

/**
 *
 */

public class Array1DPart2SolutionImpl implements Array1DPart2Solution {

    @Override
    public boolean canWin(int leap, int[] game) {
        if (game == null) {
            return false;
        }

        return goToWin(leap, game, 0);
    }

    private static boolean goToWin(int leap, int[] game, int i) {
        if (i >= game.length) {
            return true;
        } else if (i < 0 || game[i] == 1) {
            return false;
        }
        game[i] = 1;
        return goToWin(leap, game, i + leap) || goToWin(leap, game, i + 1) || goToWin(leap, game,
            i - 1);
    }

}
