public class CarSimulator {
    public CarBuilder carBuilder;
    public Car car;

    public CarSimulator(CarBuilder carBuilder, Car car) {
        this.carBuilder = carBuilder;
        this.car = car;
    }

    public void presentation() {
        String result = String.format("%s parameters: %s wheels of %s diameter, %s engine with the power of %s", this.carBuilder.name, this.car.wheel.type,
                this.car.wheel.diameter, this.car.engine.name, this.car.engine.power);
        System.out.println(result);
    }

}

