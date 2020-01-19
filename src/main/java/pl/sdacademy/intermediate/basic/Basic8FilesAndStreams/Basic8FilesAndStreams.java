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

        int numberOfAllSpakowskiBooks = bookStore.findBookByAuthor("Andrzej Sabkowski").size();

        double totalCostOfSomeFantasyBooks = bookStore.findGener(Genre.FANTASY)
                .stream()
                .filter(book -> book.getYearPushlished() >= 1990 && book.getYearPushlished() <= 1999 )
                .filter(book -> BigDecimal.valueOf(book.getPrice()).compareTo(BigDecimal.valueOf(40.0))> 0)
                .mapToDouble(Book::getPrice)            //to samo co - map(book -> book.getPrice())
                .sum();

        List<BookShortInfo> shortInfoAbaoutSomeCrimeStory = bookStore.findGener(Genre.CRIME_STORY)//fineGener = findeBooksByGenner
                .stream()
                .filter(book -> book.getAuthor().equals("Harlan Coben"))
                .filter(book -> book.getNumberOfPages() <= 300)
                .skip(2)
                .map(book -> BookShortInfo.builder())
                                .title()
                                .author()



    }

    }




