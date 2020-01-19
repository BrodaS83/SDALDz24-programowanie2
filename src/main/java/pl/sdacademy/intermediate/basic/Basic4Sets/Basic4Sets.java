//Stwórz klasę Car zawierającą: markę i model oraz numer VIN (pola typu String).
//Stwórz 6 obiektów klasy Car:
//
//Volkswagen Golf 1VWBH7A33DC118080 
//Audi A3 1FTSW21R08EC46917 
//Seat Leon 1FTFW1CF6EKF51253 
//Audi A3 1FMFU17538LA84228 
//Seat Ibiza 1FTFW1CF6EKF51253
//Volkswagen Passat 1VWBH7A33DC118080
//
//Wygeneruj w IntelliJ IDEA metody equals i hashCode w klasie Car, opierając je o pole VIN.
//
//Stwórz HashSet<Car> i dodaj do niego wszystkie obiekty typu Car.
//Przeiteruj się po secie i wypisz wszystkie samochody, które zawiera.
//
//Czy kolejność dodawania elementów jest zgodna z kolejnością w jakiej są wypisane?
//Zmień implementację zbioru na LinkedHashSet i ponownie wypisz wszystkie samochody - zwróć uwagę na kolejność.


package pl.sdacademy.intermediate.basic.Basic4Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Basic4Sets {
    public static void main(String[] args) {

        Car VW = new Car("Volkswagen", "Golf", "1VWBH7A33DC118080");
        Car Audi = new Car("Audi", "A3", "1FTSW21R08EC46917");
        Car Seat = new Car("Seat", "Leon", "1FTFW1CF6EKF51253");
        Car Audi1 = new Car("Audi", "A3", "1FMFU17538LA84228");
        Car Seat1 = new Car("Seat", "Ibiza", "1FTFW1CF6EKF51253");
        Car VW1 = new Car("Volkswagen", "Passat", "1VWBH7A33DC118080");

        //Stwórz HashSet<Car> i dodaj do niego wszystkie obiekty typu Car.
        Set<Car> carSet = new HashSet<>();
        carSet.add(VW);
        carSet.add(Audi);
        carSet.add(Seat);
        carSet.add(Audi1);
        carSet.add(Seat1);
        carSet.add(VW1);

        //Przeiteruj się po secie i wypisz wszystkie samochody, które zawiera.
        System.out.println("Wypisane auta z HashSet");
        for (Car car : carSet) {
            System.out.println(car);
        }
            //Zmień implementację zbioru na LinkedHashSet i ponownie wypisz wszystkie samochody - zwróć uwagę na kolejność.
            Set<Car> carLinced = new LinkedHashSet<>();
            carLinced.add(VW);
            carLinced.add(Audi);
            carLinced.add(Seat);
            carLinced.add(Audi1);
            carLinced.add(Seat1);
            carLinced.add(VW1);

            System.out.println("Wypisane auta z LincedHashSet");
            for (Car car : carLinced) {
                System.out.println(car);


            }


        }
    }
