package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


import java.util.Objects;
import java.util.UUID;

@Builder
@ToString
@Getter
class Book {

    private String title;
    private String author;
    private int yearPushlished;
    private int numberOfPages;
    private double price;
    private Genre genre;
    @Builder.Default
    private UUID id = UUID.randomUUID();
    @Builder.Default
    int amount = 3; //ilość egzemplarzy książki w sklepie

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    //Dodaj metodę toBookShortInfo(), która przekształci książkę w obiekt BookShortInfo i go zwróci

    BookShortInfo toBookShortInfo() {
        return BookShortInfo.builder()
                .title(title)
                .author(author)
                .yearPushlished(yearPushlished)
                .id(id)
                .build();
    }
}
