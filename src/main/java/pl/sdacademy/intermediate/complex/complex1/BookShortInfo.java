package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;

import java.util.UUID;

//Zmodyfikuj klasę BookShortInfo, dodając pole UUID o nazwie „id”, jednak nie inicjalizując go i nie dodając @Builder.Default
// (powinno być przekazywane przez builder podczas tworzenia obiektu i przechowywać id danej książki).
@Builder
class BookShortInfo {
    String title;
    String author;
    int yearPushlished;
    UUID id;

}
