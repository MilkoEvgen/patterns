package behavioral.iterator;

public class Garage implements Collection {
    private String name;
    private Car[] cars;

    public Garage(String name, Car[] cars) {
        this.name = name;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public Iterator getIterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            return index < cars.length;
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }
}
