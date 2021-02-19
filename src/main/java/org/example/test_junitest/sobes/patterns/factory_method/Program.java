package org.example.test_junitest.sobes.patterns.factory_method;

import java.util.HashMap;
import java.util.Map;

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

         df=getFactory("php");
         jDev = df.createDeveloper();
         jDev.writeCode();



    }

    static DevelopersFactory getFactory(String key){
         Map<String, DevelopersFactory> mapFactory = new HashMap<String,DevelopersFactory>();
         mapFactory.put("java",new JavaDevelopersFactory());
         mapFactory.put("c++",new CPlusPlusDevelopersFactory());
         //добавим php
        mapFactory.put("php", new PhpDevelopersFactory());

        try {
          return   mapFactory.get(key);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UnsupportedOperationException(key + "is not yet");
        }

    }

}
