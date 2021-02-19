package org.example.test_junitest.sobes.patterns.factory_method;

public class PhpDevelopersFactory implements DevelopersFactory {
    {
        System.out.println( "open php factory ");
    }
    @Override
    public Developers createDeveloper() {
        return new PhpDeveloper();
    }
}
