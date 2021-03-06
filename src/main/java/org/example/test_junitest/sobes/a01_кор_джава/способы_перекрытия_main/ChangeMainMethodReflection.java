package org.example.test_junitest.sobes.a01_кор_джава.способы_перекрытия_main;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ChangeMainMethodReflection {
    public static void main(String[] args) {
        System.out.println("Wrong");

    }
//ПЕРЕКРЫТЬ МЕТОД МАЙН//Выдаст предупреждение что так делать не нужно
    //не6 смог запустить отложил на потом
    //    public static void main(String[] args) {
//        System.out.println("asaString");

//    }
static {
    disableWarning();
    try {
        String right = "Wrong";
        String fieldName="value";
        Field fd = right.getClass().getDeclaredField(fieldName);

        Class superClass = right.getClass().getSuperclass();
        while (fd == null && superClass != null) {
            try {
                fd = superClass.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                superClass = superClass.getSuperclass();
            }
        }
        if (fd == null) {
         //авот вдруг
        }

        fd.setAccessible(true);
        System.out.println(fd.canAccess(right));
//        AccessController.doPrivileged((PrivilegedAction) () -> {
//            fd.setAccessible(true);
//            System.out.println(fd.canAccess(right));
//
//            return null;
//        });
        Field modifiersField = Field.class.getDeclaredField( "modifiers" );
        modifiersField.setAccessible( true );
        modifiersField.setInt( fd, fd.getModifiers() & ~Modifier.FINAL );

        //it updates a field, but it was already inlined during compilation...
        fd.set( null, "I was updated!" );
       // fd.set(right, new String("123"));
       // fd.set(right, new char[]{'R', 'i', 'g', 'h', 't'});
    } catch (Throwable e) {
        e.printStackTrace();
    }
}
    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }

}
