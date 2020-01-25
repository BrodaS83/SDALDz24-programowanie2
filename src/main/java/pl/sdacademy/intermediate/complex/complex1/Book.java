//W pliku books.txt (plik będzie na Slacku) znajdują się wiersze zawierające informacje o książkach.
//Każdy wiersz dotyczy innej książki. Wartości oddzielone będą znakiem tzw. pipe "|".
//------------------------------------------------------------------
//Stwórz klasę Book, która będzie reprezentowała książkę i posiadała pola:
//String title;
//String author;
//int yearPushlished;
//int numberOfPages;
//double price;
//Genre genre; // stwórz enuma Genre, który będzie miał wartości: FOR_CHILDREN, CRIME_STORY, FANTASY.
//
//UWAGA: Do projektu dołącz Lomboka. Dodaj anotacje @Builder i @ToString i @Getter na klasie Book.
//
//Stwórz klasę BookShortInfo, która zawiera tylko tytuł, autora i rok wydania (pola takie jak w klasie Book).
//Do tworzenia obiektów BookShortInfo, możesz wykorzystać zwykły konstruktor lub lombokową anotację @Builder.
//------------------------------------------------------------------
//Stwórz klasę BookStoreInitializer, która będzie miała metodę initBookStore, zwracająca listę książek.
//W metodzie tej wczytaj plik books.txt i stwórz odpowiedni obiekt klasy Book dla każdej linii w pliku.
//Zwróć uwagę, aby odpowiednio zainicjalizować enuma.

//Stwórz klasę BookStore, która będzie posiadała pole: List<Book> books.
//W konstruktorze, użyj BookStoreInitializer, żeby przypisać wartość do pola na listę wczytaną z pliku.
//
//Napisz metody w klasie BookStore:
//- do zwrócenia wszystkich książek
//- do wyszukiwania książek po tytule
//- do wyszukiwania ksiązek po autorze
//- do wyszukiwania książek po roku wydania
//- do wyszukiwania książek po liczbie stron
//- do wyszukiwania książek po cenie
//- do wyszukiwania książek po gatunku
//Każda metoda powinna zwrócić listę wyszukanych książek.
//Metody wyszukiwania książek zaimplementuj z użyciem streamów (potrzebna będzie operacja filter).
//Jeśli do wykonania zadania będzie potrzebna dodatkowa metoda lub modyfikacja istniejącej - zaimplementuj to.
//------------------------------------------------------------------
//W klasie Basic8FilesAndStreams utwórz obiekt BookStore, a następnie (wykorzystując kolejne operacje na strumieniach),
//wypisz na konsolę:
//- wszystkich autorów
//- liczbę wszystkich książek danego autora
//- łączny koszt książek FANTASY wydanych w latach 90, droższych niż 40zł.
//- wszystkie książki z gatunku CRIME_STORY, których autorem jest Harlan Coben,
//ale nie są grubsze niż 300 stron, za wyjątkiem pierwszych dwóch książek takich książek; następnie każdą ze znalezionych książek
//zaprezentuj jako obiekt typu BookShortInfo (przekształć 1 obiekt w 2).


package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import pl.sdacademy.intermediate.basic.Basic8FilesAndStreams.BookShortInfo;
import pl.sdacademy.intermediate.basic.Basic8FilesAndStreams.Genre;

import java.util.Objects;
import java.util.UUID;

@Builder
@ToString
@Getter
class Book {

    @Builder.Default
    int amount = 3;
    private String title;
    private String author;
    private int yearPushlished;
    private int numberOfPages;
    private double price;
    private Genre genre;
    @Builder.Default
    private UUID id = UUID.randomUUID();

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
    public void toBookShortInfo() {
        Book book = new BookShorInfo;
        return book;
    }
//    public Book(String title, String author, int yearPushlished) {
//        this.title = title;
//        this.author = author;
//        this.yearPushlished = yearPushlished;

}