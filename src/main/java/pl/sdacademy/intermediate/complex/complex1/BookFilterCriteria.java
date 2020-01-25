package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;

@Builder
public class BookFilterCriteria {
    String titlePart;
    String authorPart;
    IntRange yearsRange;
    IntRange pagesRange;
    DoubleRange priceRange;

    //Napisz w klasie BookFilterCriteria metodę matches(Book book), która zwraca true lub false dla obiektu danej książki,
// w zależności od ustawionych pól kryteriów (UWAGA: jeśli mamy ustawione 3 wartości, wszystkie warunki muszą być spełnione jednocześnie).
    public void matches(Book book) {
        return; //True or false

    }
}