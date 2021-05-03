package org.example.test_junitest.sobes.inheritance;

public class ParentGrandB implements InterfaceGrandB , InterfaceGrandA {
    {
        System.out.println("create ParentGrandB " + this);
    }

    public String namePublic = "My public name PublicB";
    protected String nameProtected = "My protected name ProtectB";
    String nameDefault = "My default name DefaultB";
    private String namePrivate = "My name PrivatB";
static class InnerStaticB {
    int yy =13;

    static {
        System.out.println( "create static ");

    }
    {
        System.out.println( "create " + this);
    }
     int y = yy+10;
}

     public class InnerClassGrandB extends ParentGrandA{

        {
            System.out.println("create inner class " + this.getClass());
        }

        public void getName() {

            System.out.println("its name -" + nameDefault +
                    "\n " + namePrivate +
                    "\n " + nameProtected);
            System.out.println("its name parent local -" + pub +
                    "\n " + defPub +
                    "\n " + statPub);
        }

    }

    public void runPublic() {
            class LocalCassB{
               int  loclcls =10;
            }
        LocalCassB  lc=   new LocalCassB();


        new InnerClassGrandB().getName();


        System.out.println("+++Public++++ \n");
        methodInfGrandB();
    }



    void runDefault() {
        System.out.println("+++Default++++ \n");
        methodStringGrandB();
    }

    private void runPrivate() {
        System.out.println("private method ParentGrandB");

    }


    @Override
    public void foo() {
        System.out.println("Foo method grand FOO  = "+ InterfaceGrandB.x +"///"+  InterfaceGrandA.x);
    }

    @Override
    public void methodInfGrandA() {
        System.out.println("method grandA = "+ InterfaceGrandA.x);
    }

    @Override
    public String methodStringGrandA() {
        return "methos methodStringGrandA ";
    }

    @Override
    public void methodInfGrandB() {
        System.out.println("+++++++ \ncal method InfGrandB " + this.getClass());
        System.out.println(methodStringGrandB());
    }

    @Override
    public String methodStringGrandB() {
        return "MethodStringGrandB  return string";
    }
}
