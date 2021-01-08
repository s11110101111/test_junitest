package org.example.test_junitest.sobes.inheritance;

public class Child1GrandB extends ParentGrandB {
    {
        System.out.println("create Child1GrandB " + this);
    }

    private String namePivateChild1 = "my name PrivChild1B";
    public String namePublicChild1 = "my name PublicChild1B";

    class InnerClassChild1B {

        {
            System.out.println("create inner class " + this.getClass());
        }

        public void getNameFromChild() {

            System.out.println("its name -" + nameDefault +
                    "\n " + namePivateChild1 +
                    "\n " + nameProtected);
        }


    }


}
