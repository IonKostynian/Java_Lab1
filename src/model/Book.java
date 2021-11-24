package model;

import java.time.Year;
import java.util.Objects;

public abstract class Book {
    private String author;
    private String name;
    private String publication;
    private Year yearOfPublication;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public Year getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Year yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(publication, book.publication) && Objects.equals(yearOfPublication, book.yearOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, publication, yearOfPublication);
    }
}
