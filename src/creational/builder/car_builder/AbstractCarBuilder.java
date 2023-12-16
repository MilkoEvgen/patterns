package creational.builder.car_builder;

import creational.builder.model.Car;

public abstract class AbstractCarBuilder {
    Car car;
    public void createCar(){
        car = new Car();
    }
    public abstract void buildBrand();
    public abstract void buildType();
    public abstract void buildYear();
    public Car buildcar(){
        return car;
    }
}
