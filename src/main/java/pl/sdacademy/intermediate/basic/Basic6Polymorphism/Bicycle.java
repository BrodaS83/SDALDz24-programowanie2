package pl.sdacademy.intermediate.basic.Basic6Polymorphism;

public class Bicycle implements Vehicle {
    private static final int MAX_SPEED = 50;
    private int speed = 0;

    //Stwórz konstruktor bezparametrowy dla kazdego obiektu
    public Bicycle() {

    }
    //W metodzie accelerate() każdej klasy zwiększaj aktualną prędkość o wartości: 5
    //Jeśli pojazd nie może przyspieszyć, nie zwiększaj prędkości, tylko wypisz informację na konsolę.
    @Override
    public void accelerate() {
        if (speed <= MAX_SPEED - 5) {
            speed += 5;
        }else {
            System.out.println("pojazd nie przyspiesza");
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
