package org.example.test_junitest.sobes.Parallel_Concurrent.логика_проверки_атомарных_операций;

import org.junit.Test;

import static org.junit.Assert.*;

public class КлассСПроблвемойДляМногопоточногоТестированияTest {
    @Test
    public void twoThreadsShouldFailEventually() throws Exception {
        final КлассСПроблвемойДляМногопоточногоТестирования classWithThreadingProblem = new КлассСПроблвемойДляМногопоточногоТестирования();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                classWithThreadingProblem.takeNextId();
            }
        };
        for (int i = 0; i < 50_000; ++i) {
            int startingId = classWithThreadingProblem.getLastId();
            int expectedResult = 3 + startingId;
            Thread t1 = new Thread(runnable);
            Thread t2 = new Thread(runnable);
            Thread t3 = new Thread(runnable);
            t3.start();
            t1.start();
            t2.start();
            t1.join();
            t3.join();
            t2.join();
            int endingId = classWithThreadingProblem.getLastId();
            if (endingId != expectedResult)
                return;

        }
        fail("Should have exposed a thread issue but it did not.");
    }


}