//package classes;

public class Car {
    String model;
    String brand;
    String color;

    public Car(String model, String brand, String color, int year, String engine) {
        this.model = model;
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", engine='" + engine + '\'' +
                '}';
    }

    int year;

    String engine;

}
