package pl.derela.wszib.zadanie3;

import java.util.Objects;

public class Car {

    String model;
    String color;
    int prodYear;

    public Car(String model, String color, int prodYear) {
        this.model = model;
        this.color = color;
        this.prodYear = prodYear;
    }





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return prodYear == car.prodYear && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }



    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", prodYear=" + prodYear +
                '}';
    }
}
