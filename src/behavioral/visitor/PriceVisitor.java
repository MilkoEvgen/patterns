package behavioral.visitor;

public class PriceVisitor implements Visitor{
    private int sumPrice = 0;
    private int count = 0;
    @Override
    public void visitCar(Car car) {
        sumPrice = sumPrice + car.getPrice();
        count++;
    }

    @Override
    public void visitWheel(Wheel wheel) {
        sumPrice = sumPrice + wheel.getPrice();
        count++;
    }

    @Override
    public void visitEngine(Engine engine) {
        sumPrice = sumPrice + engine.getPrice();
        count++;
    }

    public int getAveragePrice(){
        return sumPrice/count;
    }
}
