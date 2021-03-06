package model;

import enums.Language;

import java.time.Year;
import java.util.Objects;

public class Vocabulary extends Book {
    private Language languageFrom;
    private Language languageTo;

    public Vocabulary () {
    }

    public Language getLanguageFrom() {
        return languageFrom;
    }

    public void setLanguageFrom(Language languageFrom) {
        this.languageFrom = languageFrom;
    }

    public Language getLanguageTo() {
        return languageTo;
    }

    public void setLanguageTo(Language languageTo) {
        this.languageTo = languageTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vocabulary that = (Vocabulary) o;
        return languageFrom == that.languageFrom && languageTo == that.languageTo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), languageFrom, languageTo);
    }

    @Override
    public String toString() {
        return "Vocabulary{" +
                "author=" + getAuthor() +
                ", name=" + getName() +
                ", publication=" + getPublication() +
                ", yearOfPublication=" + getYearOfPublication() +
                ", languageFrom=" + languageFrom +
                ", languageTo=" + languageTo +
                "}";
    }

    public static class VocabularyBuilder {
        private Vocabulary vocabulary = new Vocabulary();

        public VocabularyBuilder setName(String name) {
            vocabulary.setName(name);
            return this;
        }

        public VocabularyBuilder setAuthor(String author) {
            vocabulary.setAuthor(author);
            return this;
        }

        public VocabularyBuilder setPublication (String publication) {
            vocabulary.setPublication(publication);
            return this;
        }

        public VocabularyBuilder setYearOfPublication(Year yearOfPublication) {
            vocabulary.setYearOfPublication(yearOfPublication);
            return this;
        }

        public VocabularyBuilder setLanguageFrom (Language languageFrom) {
            vocabulary.setLanguageFrom(languageFrom);
            return this;
        }

        public VocabularyBuilder setLanguageTo (Language languageTo) {
            vocabulary.setLanguageTo(languageTo);
            return this;
        }

        public Vocabulary build() {
            return vocabulary;
        }
    }
}
