package structural.bridge;

import structural.bridge.drawing.DrawingCar;

public class Tesla extends Car{

    public Tesla(DrawingCar drawingCar, String name) {
        super(drawingCar, name);
    }

    @Override
    public void draw2DCar() {
        getDrawingCar().draw2DCar(getName());
    }

    @Override
    public void draw3DCar() {
        getDrawingCar().draw3DCar(getName());
    }
}
