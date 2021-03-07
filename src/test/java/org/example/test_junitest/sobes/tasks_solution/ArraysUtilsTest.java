package org.example.test_junitest.sobes.tasks_solution;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.example.test_junitest.sobes.tasks_solution.ArraysUtils.getMapCountNumber;
import static org.junit.Assert.*;

public class ArraysUtilsTest {
String result1 ="{0=2, 1=2, 2=2, 3=3, 4=1, 5=2, 6=2, 7=1, 8=2, 9=2}";



    @Test
    public void getMapCountNumber() {
        List<Integer> input = Arrays.asList(1,1,2,3,4,5,8,7,6,6,3,9,8,0,9,0,3,2,5);
        Map mapCountNumber = ArraysUtils.getMapCountNumber(input);
        String str = mapCountNumber.toString();
        assertEquals(result1,str);


    }
}