package org.example.test_junitest.sobes.inheritance;

public class MainInheritanceApp {

    public static void main(String[] args) {
      // ParentGrandA parentGrandA = new ParentGrandA();
ParentGrandB.InnerStaticB  stIn = new ParentGrandB.InnerStaticB();
       ParentGrandB  parentGrandB = new ParentGrandB();

parentGrandB.foo();
        System.out.println(stIn.y+ stIn.yy);

        Child1GrandB child1GrandB = new Child1GrandB();
        Child11GrandB child11GrandB1 = new Child11GrandB();
          parentGrandB.runPublic();
        var  icl = parentGrandB.new InnerClassGrandB();
        icl.getName();
            var iP =child1GrandB.new InnerClassChild1B();
        var iC1 = child11GrandB1.new InnerClassChild1B();

        var iC = child11GrandB1.new InnerClassChild11();




    }
}
