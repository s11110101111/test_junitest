package org.example.test_junitest.sobes.algoritms.factorial;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialsTest {

    @Test
    public void factorial() {

        int result =     Factorials.factorial(10);
        Assert.assertEquals(result,3628800);
    }
}