//Stwórz interfejs Vehicle, który posiada metodę void accelerate() i int getSpeed();
//
//Stwórz klasy Motorbike, Bicycle i Rocket, które implementują interfejs Vehicle.
//W każdej z klas zadeklaruj pola:
//private static final int MAX_SPEED;
//private int speed = 0;
//Pole MAX_SPEED ustaw na wartości odpowiednio: 300 - motocykla, 50 - rower i Integer.MAX_VALUE - rakieta.
//Stwórz konstruktor bezparametrowy dla kazdego obiektu.
//
//W metodzie accelerate() każdej klasy zwiększaj aktualną prędkość o wartości: 30 - motocykl, 5 - rower, 10000 - rakieta.
//Sprawdź, czy pojazd może przyspieszyć (czy kolejne przyspieszenie nie przekroczy maksymalnej prędkości).
//Jeśli pojazd nie może przyspieszyć, nie zwiększaj prędkości, tylko wypisz informację na konsolę.
//
//W klasie Basic6Polymorphism stwórz metodę moveNTimesFast(Vehicle vehicle, int times), która przyspieszy pojazd N razy
//i zwróci prędkość pojazdu po wszystkich przyspieszeniach.
//
//W metodzie main() stwórz 3 referencje do typu Vehicle i przypisz do każdej inną implementację.
//Na każdej z referencji wykonaj metodę moveNTimesFast() i wypisz na konsolę ostateczną prędkość pojazdu.
//Przetestuj dla kilku wartości N.

package pl.sdacademy.intermediate.basic.Basic6Polymorphism;

public class Basic6Polymorphism {
    public static void main(String[] args) {

    //W metodzie main() stwórz 3 referencje do typu Vehicle i przypisz do każdej inną implementację.
   Vehicle vehicle1 = new Bicycle();
   Vehicle vehicle2 = new Rocket();
   Vehicle vehicle3 = new Motorbike();


        System.out.println("Prędkość roweru");
   moveNTimesFast(vehicle1, 2);
        System.out.println("Prędkość Rakiety");
   moveNTimesFast(vehicle2, 55);
        System.out.println("Prędkość Motoru");
   moveNTimesFast(vehicle3, 9);


    }
    //W klasie Basic6Polymorphism stwórz metodę moveNTimesFast(Vehicle vehicle, int times), która przyspieszy pojazd N razy
    //i zwróci prędkość pojazdu po wszystkich przyspieszeniach.

    public static void moveNTimesFast(Vehicle vehicle, int times) {
        for (int i = 0; i < times; i++) {
            vehicle.accelerate();
        }
        System.out.println(vehicle.getSpeed() + " km/h");
    }
}
