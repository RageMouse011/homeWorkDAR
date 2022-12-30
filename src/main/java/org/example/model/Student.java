package org.example.model;

public class Student {
    private int id;
    private String name;
    private int educationYear;

    public Student(String name, int educationYear) {
        this.name = name;
        this.educationYear = educationYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEducationYear() {
        return educationYear;
    }

    public void setEducationYear(int educationYear) {
        this.educationYear = educationYear;
    }
}
