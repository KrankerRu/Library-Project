package ru.kranker.springcourse.models;

import jakarta.validation.constraints.*;


public class Person {
    private int id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 100, message = "Name should be between 2 and 30 characters")
    private String fullName;

    @Min(value = 1900, message = "Year of birth should be greater than 1900")
    private int yearOfBirth;


    public Person() {

    }

    public Person(String name, int yearOfBirth) {
        this.fullName = name;
        this.yearOfBirth = yearOfBirth;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int age) {
        this.yearOfBirth = age;
    }
}