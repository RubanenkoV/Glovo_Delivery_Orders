public class CarBuilder {
    String name;

    Car car = new Car(new Wheel("hexagonal", 2), new Engine("v8", 4));

    public CarBuilder(String name) {
        this.name = name;
    }

    public void setWheel(Wheel wheel) {
        this.car.wheel = wheel;
    }

    public void setEngine(Engine engine) {
        this.car.engine = engine;
    }

    public Car build() {
        return this.car;
    }
}
