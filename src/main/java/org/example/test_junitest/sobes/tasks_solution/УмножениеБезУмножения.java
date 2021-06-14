package org.example.test_junitest.sobes.tasks_solution;

public class УмножениеБезУмножения {
    static int getMultiplicationResult(int num, int multiplier) {
int result=0;

        if (multiplier == 0) {
            return 0;
        }
        if (multiplier == 1) {
           return num ;
        }

        return num + getMultiplicationResult(num, multiplier - 1);
    }

    public static void main(String[] args) {
        System.out.println("Рекурсивное сложение равно умножению) резалт: "+getMultiplicationResult(31,1));
    }

}
