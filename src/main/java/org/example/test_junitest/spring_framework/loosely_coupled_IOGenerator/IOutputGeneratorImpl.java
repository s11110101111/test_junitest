package org.example.test_junitest.spring_framework.loosely_coupled_IOGenerator;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
@Repository
public class IOutputGeneratorImpl implements IOutputGenerator {
    @Override
    public void generateOutput() {
        System.out.println("System output generator");
    }
}
