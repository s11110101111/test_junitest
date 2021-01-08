package org.example.test_junitest.sobes.objects;

public class FirstClass {
    private String name;
    private int id;
     SecondClass second;

     FirstClass(String name,SecondClass second){
         this.name = name;
         this.second = second;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FirstClass)) return false;

        FirstClass that = (FirstClass) o;

        if (id != that.id) return false;
        if (!name.equals(that.name)) return false;
        return second.equals(that.second);
    }

    public FirstClass() {
        super();
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id;
        result = 31 * result + second.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "FirstClass{" +
                "name= " + name +
                " room "+ second.toString() +" "+
                "Class = " +  super.toString();
    }

}
