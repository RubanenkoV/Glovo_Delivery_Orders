import java.util.HashMap;
import java.util.Map;

public class CarFlyweightFactory {
    private static Map<String, Car> carsCache = new HashMap<>();

    public static Car getCar(Car.Type type, Car.CarColor color, Engine engine, Wheel wheel) {
        String key = type + "-" + color + "-" + engine + "-" + wheel;

        if (!carsCache.containsKey(key)) {
            Car car = new Car(type, color, engine, wheel);
            carsCache.put(key, car);
        }

        return carsCache.get(key);
    }
}