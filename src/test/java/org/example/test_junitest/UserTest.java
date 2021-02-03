package org.example.test_junitest;

import lombok.SneakyThrows;
import org.example.test_junitest.sobes.sex.Sex;
import org.example.test_junitest.sobes.sex.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    private User user;
    private User user1;
    private User user2;
    private User user3;

    private User userNotAdd;
    private User getUserNotAdd1;

    @Before
   @SneakyThrows
    public void Setup() {
        user = new User("Anton", 20, Sex.MALE);
        user1 = new User("Anna", 10, Sex.FEMALE);
        user2 = new User("Hurry", 10, Sex.MALE);
        user3 = new User("Muraka", 20, Sex.FEMALE);
        userNotAdd = new User("", 0, Sex.MALE);
        userNotAdd = new User("a", 0, Sex.FEMALE);

    }

    @Test
    public void newUserNotSex() {
        for (User usr : User.getListAllUsers()) {
            if (usr.getSex()==null){
                Assert.fail("error create user with null sex.");
            }

        }

    }

    @Test
    public void newUserAgeZero() {
        for (User usr : User.getListAllUsers()) {
            if (usr.getAge() <= 0){
                Assert.fail("error create user with 0 age.");
            }
        }

    }

    @Test
    public void newUserNullName() {
        for (User usr : User.getListAllUsers()) {
            if (usr.getName() == null || usr.getName().isEmpty()|| usr.getName().isBlank() ){
                Assert.fail("error create user with null name.");
            }
        }


    }

    @Test
    public void getListAllUsers() {
        List<User> expected = User.getListAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getListUsersNotNull() {
        List<User> expected = User.getListAllUsers();
        Assert.assertNotNull(expected);

    }

    @Test
    public void testGetListAllUsers_MALE() {

        List<User> expected = User.getListAllUsers(Sex.MALE);
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetListAllUsers_FEMALE() {

        List<User> expected = User.getListAllUsers(Sex.FEMALE);
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getListUsersFemaleNoNull() {
        List<User> expected = User.getListAllUsers(Sex.FEMALE);
        Assert.assertNotNull(expected);

    }

    @Test
    public void getHowManyUsers() {

        int expected = User.getHowManyUsers();
        int actual = 4;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetHowManyUsersFEMALE() {

        int expected = User.getHowManyUsers(Sex.FEMALE);
        int actual = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSumAgeAllUsers() {

        int expected = User.getSumAgeAllUsers();
        int actual = 60;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSumAgeAllUsers() {

        int expected = User.getSumAgeAllUsers(Sex.MALE);
        int actual = 30;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageAgeAllUsers() {

        int expected = User.getAverageAgeAllUsers();
        int actual = 15;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAverageAgeAllUsers() {

        int expected = User.getAverageAgeAllUsers(Sex.MALE);
        int actual = 15;
        Assert.assertEquals(expected, actual);
    }


}