package org.example.test_junitest.sobes.sobec_example;

public  class StaticClass {
    {
        System.out.println( "init top class");
    }
    String strTop ="str top class";
    static  String statTop = "static top var set";
    void go(){
        LocalStaticClass.getStatic();
        LocalStaticClass.str="set in top inner str ";
        LocalStaticClass.getStatic();
        System.out.println(statTop);
    }

     

    static class LocalStaticClass{
        private static  String str = "str inner static local";
      static   {
            System.out.println("init inner static class");
            str="sdlfjdslfjdsljfdl error";
        }

        static void getStatic(){

            System.out.println("getStatic "+ str);
            statTop ="set in top var static ";

        }
    }



}
