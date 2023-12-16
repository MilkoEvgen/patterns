package creational.builder.car_builder;

import creational.builder.model.Type;

public class NissanBuilder extends AbstractCarBuilder{
    @Override
    public void buildBrand() {
        car.setBrand("Nissan");
    }
    @Override
    public void buildType() {
        car.setType(Type.SEDAN);
    }
    @Override
    public void buildYear() {
        car.setProductionYear(2021);
    }
}
