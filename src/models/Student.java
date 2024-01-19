package models;

import utils.Validator;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private float mediumScore;

    public Student() {}

    public Student(String id, String name, int age, String course, String address, float mediumScore) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumScore = mediumScore;
    }

    @Override
    public String toString() {
        return "Student ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Course: " + course +
                ", Address: " + address +
                ", Medium Score: " + mediumScore;
    }

    public void inputInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Information:");

        this.id = Validator.getString(scanner, "Student ID: ");
        this.name = Validator.getString(scanner, "Name: ");
        this.age = Validator.getInt(scanner, "Age: ");
        this.course = Validator.getString(scanner, "Course: ");
        this.address = Validator.getString(scanner, "Address: ");
        this.mediumScore = Validator.getFloat(scanner, "Medium Score: ");
    }

    public void printStudent() {
        String st = "Student ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Course: " + course +
                ", Address: " + address +
                ", Medium Score: " + mediumScore;
        System.out.println(st);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(float mediumScore) {
        this.mediumScore = mediumScore;
    }
}
