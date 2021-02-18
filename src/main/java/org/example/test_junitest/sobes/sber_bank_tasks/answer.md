задача 1
вариант первый
public class RefactorTest {
static class RefCreator {
static void printOperativeRef() {
System.out.println("operative ref");
}

static void printHistoricalRef() {
System.out.println("historical ref");
}
}

public static void main(String[] args) {
RefactorTest refactorTest = new RefactorTest();
refactorTest.someMethod();
refactorTest.someElseMethod();
}

public void someMethod() {
extracted(RefCreator::printOperativeRef);
}

public void someElseMethod() {
extracted(RefCreator::printHistoricalRef);
}

private void extracted(Runnable runnable) {
System.out.println("do Some usual");
System.out.println("do Some usual1");
runnable.run();
System.out.println("do Some usual2");
System.out.println("do Some usual3");
}
}
很有名 の weblog
runnable.run
Svyatoslav Panifidkin
Svyatoslav Panifidkin 13:38

Всеволод Волгин
Самим надо решать)
Это я и решил

задача 2(template method)
вариант 2
public abstract class TemplateClass {
public void showPage(){
System.out.println("do Some usual");
System.out.println("do Some usual1");
betweenMethod();
System.out.println("do Some usual2");
System.out.println("do Some usual3");
}

public abstract void betweenMethod();
}
public class ImplClassOne extends TemplateClass{

@Override
public void betweenMethod() {
System.out.println("operative ref");
}
}
public class ImplClassTwo extends TemplateClass {
@Override
public void betweenMethod() {
System.out.println("historical ref");
}
}
public class TestTemplateMethod {

public static void main(String[] args) {
TemplateClass templateClassOne = new ImplClassOne();
TemplateClass templateClassTwo = new ImplClassOne();

templateClassOne.showPage();

templateClassTwo.showPage();
}

} 

