package pl.sdacademy.intermediate.complex.complex1;

import lombok.Getter;
import pl.sdacademy.intermediate.basic.Basic8FilesAndStreams.Genre;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Getter
class BookStore {
    //Zmodyfikuj klasę BookStore, by przechowywała set, a nie listę
    private List<Book> books;

    BookStore() {
        this.books = new BookStoreInitializer().initBookStore();
    }

    List<Book> findBookByTitle(String title) {
        return this.books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    List<Book> findBookByAuthor(String author) {
        return this.books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    List<Book> findBookByYearPushlished(int yearPushlished) {
        return this.books.stream()
                .filter(book -> book.getYearPushlished() == yearPushlished)
                .collect(Collectors.toList());
    }

    List<Book> findNumberOfPages(int numberOfPages) {
        return this.books.stream()
                .filter(book -> book.getNumberOfPages() == numberOfPages)
                .collect(Collectors.toList());
    }

    List<Book> findPrice(double price) {
        return this.books.stream()
                .filter(book -> BigDecimal.valueOf(book.getPrice()).equals(BigDecimal.valueOf(price)))
                .collect(Collectors.toList());
    }

    List<Book> findGener(Genre genre) {
        return this.books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());

    }
}
