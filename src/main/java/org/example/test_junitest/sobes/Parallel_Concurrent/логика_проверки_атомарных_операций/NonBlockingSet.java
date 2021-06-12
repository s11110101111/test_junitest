package org.example.test_junitest.sobes.Parallel_Concurrent.логика_проверки_атомарных_операций;

public class NonBlockingSet {
    int variableBeginSet;

    void simulateNonBlockingSet(int newValue) {
        int currentValue;
        do {
            currentValue = variableBeginSet;
        } while (currentValue != compareAndSwap(currentValue, newValue));
    }

    synchronized int compareAndSwap(int currentValue, int newValue) {
        if (variableBeginSet == currentValue) {
            variableBeginSet = newValue;
            return currentValue;
        }
        return variableBeginSet;
    }


}
