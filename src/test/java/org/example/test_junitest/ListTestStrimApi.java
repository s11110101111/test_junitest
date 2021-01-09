package org.example.test_junitest;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListTestStrimApi {
    @Test
    public void countDuplicates() {
        List<Integer> listInt=List.of(1,2,8,9,3,5);
        listInt.sort((x1,x2)->x1-x2);
        List<String> list = new ArrayList<>(
                List.of("PAPAYA", "ARBUZ", "MELLOn", "BLUEBERRY", "Yo-yo", "FU-Fu", "Fu-fu"));
        list.forEach(x-> System.out.println(x.toUpperCase()));
        list.sort((x,x1)->x1.length()-x.length());

        list.forEach(x-> System.out.println(x.toUpperCase()));
        int answer = list.size();

        Assert.assertEquals(7, answer);
    }

}
