package org.example.test_junitest.sobes.a41_паттерны_шаблоны.patterns.factory_method;

public class CPlusPlusDevelopersFactory implements DevelopersFactory {

    {
        System.out.println("C++ factory ip open");
    }
    @Override
    public Developers createDeveloper() {
        return new CPlusPlusDeveloper();
    }
}
