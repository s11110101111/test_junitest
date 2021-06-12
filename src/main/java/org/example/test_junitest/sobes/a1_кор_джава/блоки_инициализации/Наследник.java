package org.example.test_junitest.sobes.a1_кор_джава.блоки_инициализации;

public class Наследник extends ПредокНаследник {
    static{
        System.out.println("статический блок Наследник");
    }
    {
        System.out.println("Обычный блок Наследник");
    }
    Наследник(){
        {
            System.out.println("блок конструктоа Насленика");
        }
    }
}
