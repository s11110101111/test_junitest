package org.example.test_junitest.sobes.inheritance;

public class Child11GrandB extends Child1GrandB implements InterfaceGrandA{
    {
        System.out.println("create Child11GrandB " + this);
    }
    private String namePivateChild11 = "my name PrivChild11";
    public String namePublicChild11 = "my name PublicChild11";

    public class InnerClassChild11 {

        {
            System.out.println("create inner class " + this.getClass());
        }

        public void getNameFromChild11() {
            System.out.println("its name parents -" + nameDefault +
                    "\n Child11 name " + namePivateChild11 +
                    "\n Parent " + nameProtected);
        }


    }



    public void methodChild11Abstract(){

        abstract class LocalClassChild11 implements InterfaceGrandA{
           {
               System.out.println("create  abstract LocalClassChild11" );
           }

            String strLocalClass ="перменная в докальном классе";
            void print(){
                System.out.println(strLocalClass);
            }
        }


    }
    @Override
    public void methodInfGrandA() {
        System.out.println("+++++++ \ncal method InfGrandA " + this.getClass());
        System.out.println(methodStringGrandA());
    }

    @Override
    public String methodStringGrandA() {
        return "Child 11 parent B Metod grand A";
    }
}
