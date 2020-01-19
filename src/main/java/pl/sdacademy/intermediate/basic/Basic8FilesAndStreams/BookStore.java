package pl.sdacademy.intermediate.basic.Basic8FilesAndStreams;

import lombok.Getter;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class BookStore {
    private List<Book> books;

    BookStore(){
        this.books = new BookStoreInitializer().initBookStore();
    }
    List<Book> findBookByTitle (String title){
        return this.books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }
    List<Book> findBookByAuthor (String author) {
        return this.books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }
    List<Book> findBookByYearPushlished (int yearPushlished) {
        return this.books.stream()
                .filter(book -> book.getYearPushlished() == yearPushlished)
                .collect(Collectors.toList());
    }
    List<Book> findNumberOfPages (int numberOfPages) {
        return this.books.stream()
                .filter(book -> book.getNumberOfPages() == numberOfPages)
                .collect(Collectors.toList());
    }
    List<Book> findPrice (double price) {
        return this.books.stream()
                .filter(book -> book.getPrice() == price)
                .collect(Collectors.toList());
    }
    List<Book> findGener (Genre genre){
        return this.books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());

            }
}
