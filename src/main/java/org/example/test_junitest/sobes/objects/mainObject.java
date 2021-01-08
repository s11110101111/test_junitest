package org.example.test_junitest.sobes.objects;

import java.lang.ref.SoftReference;

public class mainObject {


    public static void main(String[] args) throws CloneNotSupportedException {
        HomeClass home1;
        HomeClass home2;
        HomeClass home = new HomeClass("Номе",new FirstClass("first", new SecondClass("second")));
         home1=(HomeClass) home.clone();
        System.out.println("create " + home);
       System.out.println((home1!=home)? "home1 != home": "home = home1");

        System.out.println((home1.first!=home.first)? "home1 first  != home firset": "home first = home1 first");
        System.out.println("create " + home);
        System.out.println("create " + home1);
        home1.first = new FirstClass("Clone first",new SecondClass("clone sec"));
        System.out.println((home1!=home)? "home1 != home": "home = home1");
        System.out.println((home1.first!=home.first)? "home1 first  != home firset": "home first = home1 first");
        System.out.println("create " + home);
        System.out.println("create " + home1);
    }
}
