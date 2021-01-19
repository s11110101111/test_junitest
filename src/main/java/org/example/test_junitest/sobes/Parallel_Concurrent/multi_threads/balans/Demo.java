package org.example.test_junitest.sobes.Parallel_Concurrent.multi_threads.balans;

import org.example.test_junitest.sobes.enum_test.ColorANSI;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws Exception {
        Account account = new Account(100_000);
        System.out.println("Begin balance = " + account.getBalance());

        Thread withdrawThread = new WithdrawThread(account);
        Thread depositThread = new DepositThread(account);
        withdrawThread.start();
        depositThread.start();

        withdrawThread.join();
        depositThread.join();

        System.out.println("End balance = " + account.getBalance());
    }


    private static class WithdrawThread extends Thread {

        private final Account account;

        private WithdrawThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20_000; ++i) {
                account.withdraw(1);
                System.out.print(ColorANSI.RED.fillColor("-" + account.getBalance()));
            }
        }
    }


    private static class DepositThread extends Thread {

        private final Account account;

        private DepositThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20_000; ++i) {
                account.deposit(1);
                System.out.print(ColorANSI.YELLOW.fillColor("+" + account.getBalance()));
            }
        }
    }
}
