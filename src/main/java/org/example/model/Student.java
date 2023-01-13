package org.example.model;

public class Student {
    private double grade;
    private int age;

    public Student(double grade, int age) {
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", age=" + age +
                '}';
    }
}
