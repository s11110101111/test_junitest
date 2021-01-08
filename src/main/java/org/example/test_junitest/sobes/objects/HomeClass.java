package org.example.test_junitest.sobes.objects;

public class HomeClass implements Cloneable{
    private String name;
    FirstClass first;
    HomeClass(String name, FirstClass first){
        this.name = name;
        this.first =first;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HomeClass)) return false;

        HomeClass homeClass = (HomeClass) o;

        if (!name.equals(homeClass.name)) return false;
        return first.equals(homeClass.first);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + first.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "HomeClass{" +
                "name=" + name +
                " room "+ first.toString() +" "+
                "Class = " + super.toString();
    }
}
