package org.example.test_junitest.sobes.patterns.singletons;

public enum Singleton2Enum {
    INSTANCE;

    public void doWork() {
        System.out.println("singleton enum work ==" + getClass());
    }
}

