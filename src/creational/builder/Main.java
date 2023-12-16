package creational.builder;

import creational.builder.car_builder.VolvoBuilder;
import creational.builder.director.Director;
import creational.builder.model.Car;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.SetBuilder(new VolvoBuilder());
        Car car = director.createCar();
        System.out.println(car);
    }
}
