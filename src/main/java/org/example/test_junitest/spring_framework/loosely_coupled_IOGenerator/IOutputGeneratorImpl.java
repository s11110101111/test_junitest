package org.example.test_junitest.spring_framework.loosely_coupled_IOGenerator;

import org.springframework.stereotype.Component;

@Component
public class IOutputGeneratorImpl implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("System output generator");
    }
}
