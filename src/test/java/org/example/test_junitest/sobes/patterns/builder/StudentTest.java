package org.example.test_junitest.sobes.patterns.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
private Student student;
    @Before
    public void setUp() throws Exception {
          student = new Student.StudentBuilder()
                .name("Bill")
                .age(10)
                .languageAdd("English")
                .languageAdd("Spanish")
                .languageAdd("Indian")
                .university("Solomon  big  boss university ")
                .build();
    }

    @Test
    public void testToString() {
        System.out.println(student);
        Assert.assertEquals(student.getName(),"Bill");

    }
}