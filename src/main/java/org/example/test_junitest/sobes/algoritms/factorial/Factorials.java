package org.example.test_junitest.sobes.algoritms.factorial;

public class Factorials {
    static int factorial (int n){

        return n == 0 ? 1 : n * factorial(n - 1);

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(factorial(n));

    }
}
