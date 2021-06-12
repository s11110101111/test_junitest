package org.example.test_junitest.sobes.a1_кор_джава.блоки_инициализации;

public class ПредокНаследник extends Предок{
static{
    System.out.println("статический блок ПредокНаследник");
}
    {
        System.out.println("Обычный блок ПредокНаследник");
    }
    ПредокНаследник(){
        {
            System.out.println("блок конструктоа ПредкаНасленика");
        }
    }
}
