package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.singletons;

public enum Singleton2Enum {
    INSTANCE;

    public void doWork()
    {
        System.out.println("singleton enum work ==" + getClass());
    }
}

