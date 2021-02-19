package org.example.test_junitest.sobes.patterns.factory_method;

public class Program {



     public static void main(String[] args){

         Developers jDev = new JavaDeveloper();
        jDev.writeCode();
        jDev = new CPlusPlusDeveloper();
         jDev.writeCode();
         //теперь через фабрику
         DevelopersFactory df = new JavaDevelopersFactory();

         jDev = df.createDeveloper();
         jDev.writeCode();
         df = new CPlusPlusDevelopersFactory();
         jDev = df.createDeveloper();
         jDev.writeCode();


    }

}
