package model;

import enums.Genre;

import java.time.Year;
import java.util.Objects;

public class TextBook extends Book{
    public Genre genre;

    public TextBook () {

    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return super.getAuthor();
    }

    public void setAuthor(String author) {
        super.setAuthor(author);
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getPublication() {
        return super.getPublication();
    }

    public void setPublication(String publication) {
        super.setPublication(publication);
    }

    public Year getYearOfPublication() {
        return super.getYearOfPublication();
    }

    public void setYearOfPublication(Year yearOfPublication) {
        super.setYearOfPublication(yearOfPublication);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextBook textBook = (TextBook) o;
        return genre == textBook.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre);
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "author=" + getAuthor() +
                ", name=" + getName() +
                ", publication=" + getPublication() +
                ", yearOfPublication=" + getYearOfPublication() +
                ", genre=" + genre +
                "}";
    }

    public static class TextBookBuilder {
        private TextBook textBook = new TextBook();

        public TextBookBuilder setName(String name) {
            textBook.setName(name);
            return this;
        }

        public TextBookBuilder setAuthor(String author) {
            textBook.setAuthor(author);
            return this;
        }

        public TextBookBuilder setPublication (String publication) {
            textBook.setPublication(publication);
            return this;
        }

        public TextBookBuilder setYearOfPublication(Year yearOfPublication) {
            textBook.setYearOfPublication(yearOfPublication);
            return this;
        }

        public TextBookBuilder setGenre(Genre genre) {
            textBook.setGenre(genre);
            return this;
        }

        public TextBook build() {
            return textBook;
        }
    }
}