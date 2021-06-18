package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.factory_method;

public class JavaDevelopersFactory implements DevelopersFactory {
    {
        System.out.println("java factory ip open");
    }
    @Override
    public Developers createDeveloper() {
        return new JavaDeveloper();
    }
}
