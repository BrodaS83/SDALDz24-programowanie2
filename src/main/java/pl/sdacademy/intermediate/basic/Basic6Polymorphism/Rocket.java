package pl.sdacademy.intermediate.basic.Basic6Polymorphism;

public class Rocket implements Vehicle {
    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private int speed = 0;

    //Stwórz konstruktor bezparametrowy dla kazdego obiektu
    public Rocket() {

    }
    //W metodzie accelerate() każdej klasy zwiększaj aktualną prędkość o wartości: 10000
    //Jeśli pojazd nie może przyspieszyć, nie zwiększaj prędkości, tylko wypisz informację na konsolę.
    @Override
    public void accelerate() {
      if (speed <= MAX_SPEED - 10000) {
          speed += 10000;
      }else {
          System.out.println("pojazd nie przyspiesza");
      }
    }

    @Override
    public int getSpeed() {
        return speed;
    }

}
