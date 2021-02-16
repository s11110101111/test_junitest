package org.example.test_junitest.sobes.patterns.builder;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.example.test_junitest.sobes.enum_test.ColorANSI;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<String> languages;
    private String university;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public String getUniversity() {
        return university;
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private List<String> languages = new ArrayList<String>();
        private String university;

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
        public  StudentBuilder university(String university){
            this.university = university;
            return this;
        }

        public StudentBuilder languageAdd(String lang) {
            this.languages.add(lang);
            return this;
        }

        public StudentBuilder languages(List<String> langs) {
            this.languages = langs;
            return this;
        }
        public  Student build(){
            return new Student(this);
        }


    }

    public Student(StudentBuilder builder) {
        name = builder.name;
        age = builder.age;
        university = builder.university;
        languages = builder.languages;

    }

    @Override
    public String toString() {
        String str = "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", languages=" + languages +
                ", university='" + university + '\'' +
                '}';
        return ColorANSI.GREEN.fillColor(str);
    }
}
