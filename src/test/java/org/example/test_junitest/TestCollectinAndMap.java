package org.example.test_junitest;


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


}
