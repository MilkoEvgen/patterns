package structural.bridge;

import structural.bridge.drawing.DrawingCar;

public abstract class Car {
    private DrawingCar drawingCar;
    private String name;

    public Car(DrawingCar drawingCar, String name) {
        this.drawingCar = drawingCar;
        this.name = name;
    }

    public DrawingCar getDrawingCar() {
        return drawingCar;
    }

    public String getName() {
        return name;
    }

    public abstract void draw2DCar();
    public abstract void draw3DCar();
}
