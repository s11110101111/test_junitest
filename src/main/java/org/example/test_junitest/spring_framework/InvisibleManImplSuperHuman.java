package org.example.test_junitest.spring_framework;

import org.example.test_junitest.sobes.a01_кор_джава.enum_test.ColorANSI;

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
