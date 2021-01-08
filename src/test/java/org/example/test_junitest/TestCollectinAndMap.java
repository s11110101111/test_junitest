package org.example.test_junitest;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TestCollectinAndMap {
    @Test
    public void whenCompareWhitEqualsTwoHashMapKey_ThenSuccess(){
        Map<String,String> autoPats1 = new HashMap<String,String>();
        autoPats1.put("japan","toyo");
        autoPats1.put("vietnam","cucu");
        Map<String,String> autoPats2 = new HashMap<String,String>();
        autoPats2.put("japan","toyo");
        autoPats2.put("vietnam","cucu");

        Map<String,String> autoPats3 = new HashMap<String,String>();
        autoPats3.put("vietnam","cucu");
        autoPats3.put("china","fufu");

        assertTrue(autoPats1.equals(autoPats2));
        assertFalse(autoPats1.equals(autoPats3));


    }
    @Test
    public void whenCompareTwoHashMapsUsingEquals_thenSuccess() {
        Map<String, String> asiaCapital1 = new HashMap<String, String>();
        asiaCapital1.put("Japan", "Tokyo");
        asiaCapital1.put("South Korea", "Seoul");

        Map<String, String> asiaCapital2 = new HashMap<String, String>();
        asiaCapital2.put("South Korea", "Seoul");
        asiaCapital2.put("Japan", "Tokyo");

        Map<String, String> asiaCapital3 = new HashMap<String, String>();
        asiaCapital3.put("Japan", "Tokyo");
        asiaCapital3.put("China", "Beijing");

        assertTrue(asiaCapital1.equals(asiaCapital2));
        assertFalse(asiaCapital1.equals(asiaCapital3));
    }

}
