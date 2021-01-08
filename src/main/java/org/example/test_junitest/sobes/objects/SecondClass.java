package org.example.test_junitest.sobes.objects;

public class SecondClass {
    private String name;
    private int id;


SecondClass(String name){
    this.name = name;
}

    public SecondClass() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SecondClass)) return false;

        SecondClass that = (SecondClass) o;

        if (id != that.id) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "SecondClass{" +
                "name= " + name +
                '}' +" "+
                "Class = " + super.toString();
    }
}
