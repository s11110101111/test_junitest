package org.example.test_junitest.sobes.lambda;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.manipulation.Ordering;
import org.mockito.cglib.core.Block;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;

import static org.junit.Assert.assertThrows;

public class TestLambdaTest {

    @Test
    public void testComparatorLambda() {
        Comparator<Integer> comp = ((x, y) -> (x > y) ? 1 : ((x < y) ? -1 : 0));
        Assert.assertEquals(0,comp.compare(0,0));
        Assert.assertEquals(1,comp.compare(100,99));
        Assert.assertEquals(-1, comp.compare(99,100));

    }
    @Test
    public void testException(){
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });

    }

       int[] ints = new int[1];
        Function<Integer, String> fun =(x)-> "s- "+ (x*ints[0]);
        String str = "s- ";
    @Test
    public void testFunctionLambda(){
       ints[0]=2000;
        Assert.assertEquals("s- 2000",fun.apply(1));
        Exception t = assertThrows(NullPointerException.class, ()->fun.apply(null));

    }
   private  IntUnaryOperator fib = (n) ->
                (n<2)? n : (this.fib.applyAsInt(n-1)+this.fib.applyAsInt(n-2));
    @Test
    public void testFibonacciLambda(){
           Assert.assertEquals(1134903170,fib.applyAsInt(45));
          }

}