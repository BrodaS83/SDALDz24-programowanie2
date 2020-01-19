//Skopiuj klasę Person z zadania rozgrzewkowego.
//Stwórz Listę (ArrayList) i dodaj do niej 5 obiektów klasy Person:
//
//Piotr, Zietek, Zgierz, 28, 793522944
//Adam, Malysz, Wisla, 42, 123456789
//Ala, Makota, Warszawa, 15, 111222333
//Juliusz, Slowacki, Krakow, 40, 10203040
//Tomasz, Kowalski, Lodz, 12, 13342523
//
//Wypisz (stwórz osobną metodę do każdego podpunktu):
//a) informacje o wszystkich osobach z listy
//b) osoby, które są starsze niż 20 lat
//c) osoby, których numer telefonu jest podzielny przez 2
//d) sumę wieku wszystkich osób
//
//Stwórz nową listę będącą kopią pierwszej (użyj konstruktora przyjmującego listę).
//
//Usuń jedną osobę ze środka pierwszej listy.
//Wypisz ponownie sumę lat wszystkich osób w pierwszej liście oraz sumę lat osób z drugiej listy.
//Wypisz ilość elementów pierwszej i drugiej listy.

package pl.sdacademy.intermediate.basic.Basic2Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basic2List {
    public static void main(String[] args) {

        List<Person> myList = new ArrayList<>();

        Person person = new Person("Piotr", "Zietek", "Zgierz", 10, 793522944);
        Person person1 = new Person("Adam", "Malysz", "Wisła", 42, 123456789);
        Person person2 = new Person("Ala", "Makota", "Warszawa", 15, 111222333);
        Person person3 = new Person("Janusz", "Slowacki", "Kraków", 40, 10203040);
        Person person4 = new Person("Tomasz", "Kowalski", "Lodz", 12, 13342523);

        myList.add(person);
        myList.add(person1);
        myList.add(person2);
        myList.add(person3);
        myList.add(person4);

        System.out.println(myList);
        System.out.println("Starsi niż 20 ");
        olderThenTwenty(myList);


        System.out.println("Telefony podzielne przez 2");
        numberPhone(myList);

        sumOfPerson(myList);
    }

    public static void olderThenTwenty(List<Person> list) {
        for (Person person : list)
            if (person.getAge() > 20) {
                System.out.println(person);
            }
    }

    public static void numberPhone(List<Person> list) {
        for (Person person : list)
            if (person.getPhone() % 2 == 0) {
                System.out.println(person);
            }
    }

    public static void sumOfPerson(List<Person> list) {
        int sum = 0;

        for (Person person : list) {
            sum += person.getAge();
        }
        System.out.println(sum);
    }
}

