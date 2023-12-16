package structural.bridge;

import structural.bridge.drawing.DrawingCarForMac;
import structural.bridge.drawing.DrawingCarForPC;

public class MainCarDrawing {
    public static void main(String[] args) {
        DrawingCarForPC pc = new DrawingCarForPC();
        DrawingCarForMac mac = new DrawingCarForMac();

        Car tesla = new Tesla(pc, "tesla");
        Car ford = new Ford(mac, "ford");

        tesla.draw2DCar();
        ford.draw3DCar();
    }
}
