package org.example.test_junitest.sobes.lambda;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class TestCompareTest {

    @Test
    public void TestComparatorLambda() {
        Comparator<Integer> comp = ((x, y) -> (x > y) ? 1 : ((x == y) ? 0 : -1));
        Assert.assertEquals(0,comp.compare(0,0));
        Assert.assertEquals(1,comp.compare(100,99));
        Assert.assertEquals(-1, comp.compare(99,100));

    }

}