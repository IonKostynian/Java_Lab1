import enums.Genre;
import enums.Language;
import model.Library;
import model.TextBook;
import model.Vocabulary;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.getBooks().add(
            new Vocabulary.VocabularyBuilder()
                    .setLanguageFrom(Language.UKRAINIAN)
                    .setLanguageTo(Language.ENGLISH)
                    .setName("THE WASTE LAND")
                    .setAuthor("T.S. ELIOT")
                    .setPublication("Ritual to Romance")
                    .setYearOfPublication(Year.of(1920))
                .build()
        );
        library.getBooks().add(
            new TextBook.TextBookBuilder()
                    .setAuthor("Шевченко")
                    .setName("Кобзар")
                    .setPublication("ТОУК")
                    .setYearOfPublication(Year.of(1840))
                    .setGenre(Genre.POETRY)
                .build()
        );

        System.out.println(library.toString());
    }
}
