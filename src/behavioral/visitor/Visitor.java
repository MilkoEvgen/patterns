package behavioral.visitor;

public interface Visitor {
    void visitCar(Car car);
    void visitWheel(Wheel wheel);
    void visitEngine(Engine engine);
}
