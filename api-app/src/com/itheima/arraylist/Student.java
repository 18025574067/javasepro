package com.itheima.arraylist;

public class Student {
    private String studyNumber;
    private String name;
    private int age;
    private String classNumber;

    public Student() {
    }

    public Student(String studyNumber, String name, int age, String classNumber) {
        this.studyNumber = studyNumber;
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }

    public String getStudyNumber() {
        return studyNumber;
    }

    public void setStudyNumber(String studyNumber) {
        this.studyNumber = studyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
}
