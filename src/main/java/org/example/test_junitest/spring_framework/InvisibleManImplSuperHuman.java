package org.example.test_junitest.spring_framework;

import org.example.test_junitest.sobes.enum_test.ColorANSI;
import org.example.test_junitest.spring_framework.SuperHuman;

import javax.persistence.Column;

public class InvisibleManImplSuperHuman implements SuperHuman {
   private String name= "InvisibleMan";
   {
        System.out.println("** +++++++  !! "+ name + "  ктото меня калл "+ getClass().getSimpleName());
    }

    @Override
    public void tellUsAbout(String legend) {
        String msg = ColorANSI.YELLOW.fillColor(legend);
        System.out.println(ColorANSI.BLUE.fillColor("Я невидимка\n") + msg);
    }
}
