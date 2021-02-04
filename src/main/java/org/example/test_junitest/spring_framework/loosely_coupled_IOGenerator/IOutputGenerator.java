package org.example.test_junitest.spring_framework.loosely_coupled_IOGenerator;


import org.springframework.stereotype.Component;

@Component()
public interface IOutputGenerator {
    void generateOutput();
}
