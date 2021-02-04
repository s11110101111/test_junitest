package org.example.test_junitest.spring_framework.loosely_coupled_IOGenerator;

public class OutputHelper {

    IOutputGenerator outputGen;
public  OutputHelper(){
    outputGen = new JsonOutputGeneratorImpl();

}
public void generate(){
    outputGen.generateOutput();
}

}
