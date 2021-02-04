package org.example.test_junitest.spring_framework.loosely_coupled_IOGenerator;

public class JsonOutputGeneratorImpl implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("Json output generator");
    }
}
