package any_classes;
public class RefactorTest {
public void someMethod(){
System.out.println("do Some usual");
System.out.println("do Some usual1");
RefCreator.printOperativeRef();
System.out.println("do Some usual2");
System.out.println("do Some usual3");
}
public void someElseMethod(){
System.out.println("do Some usual");
System.out.println("do Some usual1");
RefCreator.printHistoricalRef();
System.out.println("do Some usual2");
System.out.println("do Some usual3");
}
static class RefCreator{
static void printOperativeRef(){
System.out.println("operative ref");
}
static void printHistoricalRef(){
System.out.println("historical ref");
}
}
public static void main(String[] args){ RefactorTest refactorTest = new RefactorTest(); refactorTest.someMethod(); refactorTest.someElseMethod(); }
}
В предложенном классе видим дублирование кода в 2-х методах. Необходимо от него
избавиться. Сигнатуру методов необходимо оставить как есть.

первая задача

Задача 2.
1: public class Test {
2: static String str = "Hello";
3:
4: public static void change(String s) {
5: s = "world";
6: }
7:
8: public static void main(String[] args) {
9: System.out.println(str);
10: change(str);
11: System.out.println(str);
12: }
13: }
Что напечатает метод main? Почему?

Задача 3.
1: public class Test {
2: class A {
3: String str = "ab";
4:
5: A() {
6: printLength();
7: }
8:
9: void printLength() {
10: System.out.println(str.length());
11: }
12: }
13:
14: class B extends A {
15: String str = "abc";
16:
17: void printLength() {
18: System.out.println(str.length());
19: }
20: }
21: public static void main(String[] args) {
22: new Test().new B();
23: }
24: }

Что получится в результате компиляции и исполнения? Почему?

дали 30 минут, пять прошло) я вроде тут уже видел их