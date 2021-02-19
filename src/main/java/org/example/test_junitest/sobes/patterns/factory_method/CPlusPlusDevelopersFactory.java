package org.example.test_junitest.sobes.patterns.factory_method;

public class CPlusPlusDevelopersFactory implements DevelopersFactory {

    {
        System.out.println("C++ factory ip open");
    }
    @Override
    public Developers createDeveloper() {
        return new CPlusPlusDeveloper();
    }
}
