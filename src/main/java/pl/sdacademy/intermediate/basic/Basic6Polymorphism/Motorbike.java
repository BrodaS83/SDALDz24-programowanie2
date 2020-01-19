package pl.sdacademy.intermediate.basic.Basic6Polymorphism;

public class Motorbike implements Vehicle {
    private static final int MAX_SPEED = 300;
    private int speed = 0;

    //Stwórz konstruktor bezparametrowy dla kazdego obiektu
    public Motorbike() {

    }
    //W metodzie accelerate() każdej klasy zwiększaj aktualną prędkość o wartości: 30
    //Jeśli pojazd nie może przyspieszyć, nie zwiększaj prędkości, tylko wypisz informację na konsolę.
    @Override
    public void accelerate() {
        if (speed <= MAX_SPEED - 30) {
            speed += 30;
        }else {
            System.out.println("pojazd nie przyspiesza");
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
