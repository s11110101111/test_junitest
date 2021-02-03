package org.example.test_junitest.sobes.sex;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
public class User {
    private static int countID = 0;
    private static Map<Integer, User> listUsers = new HashMap<>();

    private int id;
    private String name;
    private int age;
    private Sex sex;

    public static List<User> getListAllUsers() {
        return new ArrayList<>(listUsers.values());
    }

    public static List<User> getListAllUsers(Sex sex) {
//List<User> listSex = new ArrayList<>();
//        for(User user : listUsers.values()){
//            if(user.sex == sex){
//                listSex.add(user);
//            }
//        }
        return listUsers.values().stream().filter(x -> x.getSex() == sex).collect(Collectors.toList());

    }

    public static int getHowManyUsers() {
        return listUsers.size();
    }

    public static int getHowManyUsers(Sex sex) {
        return (int) listUsers.values().stream().filter(x -> x.getSex() == sex).count();
    }

    public static int getSumAgeAllUsers() {
        return listUsers.values().stream().mapToInt(User::getAge).sum();

    }

    public static int getSumAgeAllUsers(Sex sex) {
        return listUsers.values().stream().filter(x -> x.getSex() == sex).mapToInt(User::getAge).sum();
    }

    public static int getAverageAgeAllUsers() {
        return (int) listUsers.values().stream().mapToInt(User::getAge).average().getAsDouble();
    }
public void print(){
    System.out.println(Sex.valueOf("MALE").ordinal());

}
    public static int getAverageAgeAllUsers(Sex sex) {
        return (int) listUsers.values().stream().filter(x -> x.getSex() == sex).mapToInt(User::getAge).average().getAsDouble();
    }

    public User(String name, int age, Sex sex) {
        if (listUsers == null) {
            listUsers = new HashMap<Integer, User>();
        }
        if (name != null && !name.isBlank() && !name.isEmpty() && age > 0 && sex != null) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            if (!hasUser()) {
                this.id = countID++;
                listUsers.put(this.id, this);

            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (!name.equals(user.name)) return false;
        if (sex != user.sex) return false;

        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + sex.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    private boolean hasUser() {
        if (listUsers.containsValue(this)) {
            return true;
        }

        return false;
    }


}
