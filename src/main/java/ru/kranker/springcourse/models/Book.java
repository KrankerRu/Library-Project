package ru.kranker.springcourse.models;

import jakarta.validation.constraints.*;

public class Book {
    private int id;
    @NotEmpty(message = "Title of book should not be empty")
    @Size(min = 2, max = 100, message = "Name should be between 2 and 100")
    private String title;

    @NotEmpty(message = "Author of book should not be empty")
    @Size(min = 2, max = 100, message = "Name should be between 2 and 100")
    private String author;


    @Min(value = 1500, message = "Year should be greater than 0")
    private int year;

    public Book() {

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
