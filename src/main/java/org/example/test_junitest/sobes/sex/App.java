package org.example.test_junitest.sobes.sex;

public class App {
    public static void main(String[] args) {
        new User("Anton",100,Sex.MALE);
        new User("Anna",21,Sex.FEMALE);
        new User("Hurry",100,Sex.MALE);
        new User("Muraka",100,Sex.FEMALE);
        new User("Muraka",100,Sex.FEMALE);
        System.out.println("All users.");
        User.getListAllUsers().forEach(System.out::println);
        System.out.println("All users MALE.");
        User.getListAllUsers(Sex.MALE).forEach(System.out::println);
        System.out.println("All users FEMALE.");
        User.getListAllUsers(Sex.FEMALE).forEach(System.out::println);
        System.out.println("==========");
        System.out.println("Count all users: "+User.getHowManyUsers());
        System.out.println("How many female: "+ User.getHowManyUsers(Sex.FEMALE));
        System.out.println("Average age all users: " + User.getAverageAgeAllUsers());
        System.out.println("Sum all users  age: "+User.getSumAgeAllUsers());
        System.out.println("Sum age male: "+User.getSumAgeAllUsers(Sex.MALE));
        System.out.println("Average age female: "+User.getAverageAgeAllUsers(Sex.FEMALE));
    }


}
