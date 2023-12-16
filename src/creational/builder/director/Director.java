package creational.builder.director;

import creational.builder.car_builder.AbstractCarBuilder;
import creational.builder.model.Car;

public class Director {
    AbstractCarBuilder builder;

    public void SetBuilder(AbstractCarBuilder builder){
        this.builder = builder;
    }

    public Car createCar(){
        builder.createCar();
        builder.buildBrand();
        builder.buildType();
        builder.buildYear();
        return builder.buildcar();
    }
}
