package pl.sdacademy.intermediate.basic.Basic4Sets;

import java.util.Objects;

public class Car {
    private String brand;
    private String model;
    private String VIN;

    public Car(String brand, String model, String VIN) {
        this.brand = brand;
        this.model = model;
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", VIN='" + VIN + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return VIN.equals(car.VIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(VIN);
    }
}
