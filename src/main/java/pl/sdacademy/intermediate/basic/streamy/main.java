package pl.sdacademy.intermediate.basic.streamy;

import pl.sdacademy.intermediate.basic.Basic2Lists.Person;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {

        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

        List<Person> allPersons = Arrays.asList(person1, person2, person3);
        allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)

                // do tej pory mamy strumień elementów typu Person
                .map(person -> person.getName()) // albo z wykorzystaniem referencji do metody: Person::getName
                // teraz mamy strumień typu String!
                .forEach(name -> System.out.println("Person: " + name + " is adult."));

                allPersons
                .stream()
                .skip(1)
                .forEach(person -> System.out.println("Hello, " + person.getName()));


        allPersons
                .stream()
                .limit(2)
                .forEach(person -> System.out.println("Hello, " + person.getName()));


        allPersons
                .stream()
                .map(Person::getName)
                .sorted() // natural order, alfabetycznie
                .forEach(name -> System.out.println("Hello, " + name));

        allPersons
                .stream()
                .map(Person::getName)
                .sorted(Comparator.reverseOrder()) // alfabetycznie, odwrotnie
                .forEach(name -> System.out.println("Hello, " + name));

        allPersons
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge)) // natural order (od najmłodszego)
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        allPersons
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed()) // natural order, odwrotnie (od najstarszego)
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        allPersons
                .stream()
                .sorted(Comparator.comparing(Person::getName)) // natural order, alfabetycznie, inaczej zrobione
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        allPersons
                .stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName())) // ekwiwalent powyższego, „na piechotę”
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        boolean b2 = allPersons
                .stream()
                .anyMatch(person -> person.getAge() >= 18);
        System.out.println("anyMatch " + b2);

        boolean b1 = allPersons
                .stream()
                .allMatch(person -> person.getAge() >= 18);
        System.out.println(" allMatch " + b1);
        System.out.println(" allMatch " + b1); //do usunięcia

        boolean b = allPersons
                .stream()
                .noneMatch(person -> person.getAge() >= 18);  //aby wyświetlić na końcu dodajemy ".var" - generuje się boolean i za jego pomocom robimy SOPa
        System.out.println("nowMatch " + b);


        List<Person> adultsOnly = allPersons
                .stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());

        String namesJoinedByHyphen = allPersons
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(" – "));


        List<Integer> firstList = Arrays.asList(1, 2, 3);
        List<Integer> secondList = Arrays.asList(4, 5, 6);
        List<Integer> thirdList = Arrays.asList(7, 8, 9);

        Stream<List<Integer>> streamOfLists = Stream.of(firstList, secondList, thirdList);

        streamOfLists
                .flatMap(Collection::stream) // wskazujemy, co robimy z każdą listą, tutaj tworzymy z każdej strumień liczb
                .forEach(System.out::println);


    }
}
