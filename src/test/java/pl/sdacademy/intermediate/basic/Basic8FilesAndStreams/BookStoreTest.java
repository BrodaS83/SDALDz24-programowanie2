package pl.sdacademy.intermediate.basic.Basic8FilesAndStreams;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

public class BookStoreTest {
    private static int numberOfBooksAfterInitialization = 36;
    private static int sapkowskiBooks = 8;
    private static int nomberOfBooks1999 = 3;
    private static int NUMBER_OF_BOOKS_WITH_384_PAGES = 3;
    private static int BOOKS_OF_PRICE_2999 = 5;
    private static int NUMBER_OF_BOOKS_FOR_CHILDREN = 4;
    private static BookStore bookStore;


    @BeforeClass
    public static void setUpClass() {
        bookStore = new BookStore();
    }

    @Test
    public void testBookStoreInitialized() {
        Assert.assertEquals(numberOfBooksAfterInitialization, bookStore.getBooks().size());
    }

    @Test
    public void testBookStoreTitle() {
        //given
        Book longLostBook = Book.builder()
                .title("Long Lost")
                .author("Harlan Coben")
                .yearPushlished(2009)
                .numberOfPages(195)
                .price(44.99)
                .genre(Genre.CRIME_STORY)
                .build();
        //when
        List<Book> bookByTitle = bookStore.findBookByTitle("Long Lost");
        //then
        Assert.assertEquals(1, bookByTitle.size());
        Assert.assertEquals(longLostBook, bookByTitle.get(0));
    }

    @Test
    public void testFindBookByAuthor() {
        String andrzejSapkowski = "Andrzej Sapkowski";
        List<Book> sapkowskiBook = bookStore.findBookByAuthor(andrzejSapkowski);
        Assert.assertEquals(sapkowskiBooks, sapkowskiBook.size());
        Assert.assertTrue(sapkowskiBook.stream()
                .allMatch(book -> book.getAuthor().equals(andrzejSapkowski)));
    }

    @Test
    public void testFindBookByYear() {
        int year = 1999;

        List<Book> booksbyYear = bookStore.findBookByYearPushlished(year);
        Assert.assertEquals(nomberOfBooks1999, booksbyYear.size());
        Assert.assertTrue(booksbyYear.stream()
                .allMatch(book -> book.getYearPushlished() == year));
    }

    @Test
    public void testFindBookByNumberByPages() {
        int numberOfPages = 384;

        List<Book> booksByNumberOfPages = bookStore.findNumberOfPages(numberOfPages);
        Assert.assertEquals(NUMBER_OF_BOOKS_WITH_384_PAGES, booksByNumberOfPages.size());
        Assert.assertTrue(booksByNumberOfPages.stream()
                .allMatch(book -> book.getNumberOfPages() == numberOfPages));
    }

    @Test
    public void testFindBookByPrice() {
        double priceOfBook = 29.99;
        List<Book> booksByPrice = bookStore.findPrice(priceOfBook);
        Assert.assertEquals(BOOKS_OF_PRICE_2999, booksByPrice.size());
        Assert.assertTrue(booksByPrice.stream()
                .allMatch(book -> BigDecimal.valueOf(book.getPrice()).equals(BigDecimal.valueOf(priceOfBook))));

    }

    @Test
    public void testFindBookByGener() {
        Genre genre = Genre.FOR_CHILDREN;

        List<Book> booksByGenre = bookStore.findGener(genre);
        Assert.assertEquals(NUMBER_OF_BOOKS_FOR_CHILDREN, booksByGenre.size());
        Assert.assertTrue(booksByGenre.stream()
                .allMatch(book -> book.getGenre().equals(genre)));


    }
}