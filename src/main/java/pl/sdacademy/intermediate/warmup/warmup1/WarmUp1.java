//Stwórz klasę Person, która będzie posiadać prywatne pola:
//
//String name;
//String surname;
//String placeOfBirth;
//int age;
//long phone;
//
//Napisz pozostałe potrzebne metody.
//Nadpisz metodę toString(), w taki sposób, aby zwracała pełną informację o osobie,
//w poniższym formacie (zwróć uwagę na wszelkie litery, znaki specjalne, białe znaki itp):
//
//Adam Nowak (ur. 1989 r.)
//m. ur.: Łódź
//tel: 123456789
//
//W metodzie main() stwórz 2 obiekty klasy Person i wypisz o nich informacje na konsolę.
package pl.sdacademy.intermediate.warmup.warmup1;

public class WarmUp1 {
    public static void main(String[] args) {



        Person person = new Person("Adam", "Nowak", "Łódź", 37, 509948583 );
        Person person1 = new Person("Sebastian", "Brodecki", "Warszawa", 42, 6651095);

        System.out.println(person);
        System.out.println();
        System.out.println(person1);
    }
}
