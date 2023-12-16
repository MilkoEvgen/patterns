package structural.bridge.drawing;

public class DrawingCarForPC implements DrawingCar{
    @Override
    public void draw2DCar(String name) {
        System.out.println("2D " + name + " was drawn for PC");
    }

    @Override
    public void draw3DCar(String name) {
        System.out.println("3D " + name + " was drawn for PC");
    }
}
