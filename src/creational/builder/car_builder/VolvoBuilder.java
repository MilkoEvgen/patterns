package creational.builder.car_builder;

import creational.builder.model.Type;

public class VolvoBuilder extends AbstractCarBuilder{
    @Override
    public void buildBrand() {
        car.setBrand("Volvo");
    }
    @Override
    public void buildType() {
        car.setType(Type.TRUCK);
    }
    @Override
    public void buildYear() {
        car.setProductionYear(2020);
    }
}
