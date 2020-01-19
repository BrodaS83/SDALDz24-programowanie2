package pl.sdacademy.intermediate.basic.Basic8FilesAndStreams;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
@Getter
public class Basic8FilesAndStreams {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        List<String> allauthors = bookStore.getBooks().stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());

        int numberOfAllSapkowskiBooks = bookStore.findBookByAuthor("Andrzej Sabkowski").size();

        double totalCostOfSomeFantasyBooks = bookStore.findGener(Genre.FANTASY)
                .stream()
                .filter(book -> book.getYearPushlished() >= 1990 && book.getYearPushlished() <= 1999 )
                .filter(book -> BigDecimal.valueOf(book.getPrice()).compareTo(BigDecimal.valueOf(40.0))> 0)
                .mapToDouble(Book::getPrice)            //to samo co - map(book -> book.getPrice())
                .sum();

        List<BookShortInfo> shortInfoAboutSomeCrimeBooks = bookStore.findGener(Genre.CRIME_STORY)//fineGener = findeBooksByGenner
                .stream()
                .filter(book -> book.getAuthor().equals("Harlan Coben"))
                .filter(book -> book.getNumberOfPages() <= 300)
                .skip(2)
                .map(book -> BookShortInfo.builder()
                        .title(book.getTitle())
                        .author(book.getAuthor())
                        .yearPushlished(book.getYearPushlished())
                        .build())
                .collect(Collectors.toList());

        System.out.println("All authors: " + allauthors);
        System.out.println("***************************************************");
        System.out.println("Number of all Sapkowski books: " + numberOfAllSapkowskiBooks);
        System.out.println("***************************************************");
        System.out.println("Total cost of some fantasy books: " + totalCostOfSomeFantasyBooks);
        System.out.println("***************************************************");
        System.out.println("Short info about some crime books: " + shortInfoAboutSomeCrimeBooks);




    }

    }




