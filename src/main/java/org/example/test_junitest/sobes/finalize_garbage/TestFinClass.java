package org.example.test_junitest.sobes.finalize_garbage;

public class TestFinClass {

    public boolean freezeFin = true;

    public void aaa() {
        System.out.println("Hello test finalize");
    }

    TestFinClass(int i) {
        System.out.println(i + " new class -" + this + "\n   class" + this.getClass());
    }

    @Override
    protected void finalize() throws Throwable {

        int i = 1;
        while (freezeFin) {
            System.out.println("Zzzz..." + i +" => " +this);
            i++;
        }
        System.out.println("!!! call finalize");
        super.finalize();
    }
}
