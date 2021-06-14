package org.example.test_junitest.sobes.luxoft;

public class InterfaceFunctional_1_2_Impl implements InterfaceFunctional1, InterfaceFunctional {



    public static void main(String[] args) {
        InterfaceFunctional1 fI = new InterfaceFunctional1() {
            @Override
            public void methodFun(String sss) {
                System.out.println(sss);
            }


        };
        fI.methodFun("кактотак");
        InterfaceFunctional_1_2_Impl interfaceFunctional_1_2 = new InterfaceFunctional_1_2_Impl();
        String sser = interfaceFunctional_1_2.getFun("test  fi",(s)->s+s);
        System.out.println(sser);

    }

    public String getFun(String ss, NewFunctionl fi) {
        return fi.get(ss);
    }
    public String getRun(String ss, Runnable runnable){

        runnable.run();
        return ss;
    }

    @Override
    public void methodFun1(String sss) {

    }

    @Override
    public void methodFun(String sss) {

    }

    @Override
    public void methodFunDef(String sss) {
        InterfaceFunctional1.super.methodFunDef(sss);
    }

    @Override
    public String methodFunDef() {
        return InterfaceFunctional1.super.methodFunDef();
    }
}
