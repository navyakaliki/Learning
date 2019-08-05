//package classes;

public class Car {
    String model;
    String brand;
    String color;

//    @Override
//    public String toString() {
//        return "Car{" +
//                "model='" + model + '\'' +
//                ", brand='" + brand + '\'' +
//                ", color='" + color + '\'' +
//                ", year=" + year +
//                ", engine='" + engine + '\'' +
//                '}';
//    }

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
