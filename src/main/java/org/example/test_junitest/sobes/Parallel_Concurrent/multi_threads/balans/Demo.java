package org.example.test_junitest.sobes.Parallel_Concurrent.multi_threads.balans;

import org.example.test_junitest.sobes.enum_test.ColorANSI;

public class Demo {

    public static void main(String[] args) throws Exception {
        Account account = new Account(0);

        new DepositThread(account).start();

        account.waitAndWithdraw(50_000_000);

        System.out.println("waitAndWithdraw finished, end balance = " + account.getBalance());
    }


    private static class DepositThread extends Thread {

        private final Account account;

        private DepositThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 60_000_000; ++i) {
                account.deposit(1);
            }
        }
    }
}
