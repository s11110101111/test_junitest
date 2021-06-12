package org.example.test_junitest.sobes.a1_кор_джава.блоки_инициализации;

public class Предок {
    static{
        System.out.println( "Статический блок инициализации Предок");
    }
    {
        System.out.println("Обычный блок Предок");
    }
    Предок(){
        {
            System.out.println( "Обычный блок инициализации конструктора Предка");

        }
    }
}
