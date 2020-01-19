package pl.sdacademy.intermediate.basic.Basic8FilesAndStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStoreInitializer {

    List<Book> initBookStore() {
        List<Book> books = new ArrayList<>();
        String booksFilePathFromResource = getClass().getClassLoader().getResource("books.txt").getFile();
        File booksFile = new File(booksFilePathFromResource);
        try {
            Scanner scanner = new Scanner(booksFile);
            while (scanner.hasNext()) {
                String bookLine = scanner.nextLine();
                String [] splitLine = bookLine.split("\\|");
                String title = splitLine[0];
                String author = splitLine[1];
                String yearPushlishedS = splitLine[2];
                int yearPushlished = Integer.parseInt(yearPushlishedS);
                String numberOfPagesS = splitLine[3];
                int numberOfPage = Integer.parseInt(numberOfPagesS);
                String priceS = splitLine[4];
                double price = Double.parseDouble(priceS);
                String genreS = splitLine[5];
                Genre genre = Genre.valueOf(genreS);

                Book book = Book.builder()
                        .title(title)
                        .author(author)
                        .yearPushlished(yearPushlished)
                        .numberOfPages(numberOfPage)
                        .price(price)
                        .genre(genre)
                        .build();  //tworzy obiekt
                System.out.println(book);
                books.add(book);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Nie znaleziono listy tytułów");
        }
        return books;

    }

}
