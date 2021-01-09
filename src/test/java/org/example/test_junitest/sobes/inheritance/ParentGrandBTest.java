package org.example.test_junitest.sobes.inheritance;

import org.junit.Test;
import org.mockito.Mockito;

public class ParentGrandBTest {

@Test
        public void TestParent(){

    ParentGrandB mock = Mockito.mock(ParentGrandB.class);
mock.namePublic="PAPAPA";
Mockito.when(mock.methodStringGrandB()).thenReturn("AAAAAA");
    System.out.println(mock.methodStringGrandB());
System.out.println(mock.toString());
}


}