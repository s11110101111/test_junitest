package org.example.test_junitest.Spring_jdbc_transactional;


import org.example.test_junitest.sobes.enum_test.ColorANSI;


public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }



    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
  StringBuilder sb = new StringBuilder();
        sb.append("User{ ")
                .append("name='")
                .append(name)
                .append("\'")
                .append(", email='")
                .append(email)
                .append("\' }");
        return ColorANSI.YELLOW.fillColor(sb.toString());
    }
}
