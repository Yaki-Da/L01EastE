package Lvl_II.h06_Lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class SupplierTest1 {
    public static void main(String[] args) {
// Supplier
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Mercedes-Benz","Red",312.7));
        System.out.println(ourCars);
// Consumer
        changeCar(ourCars.get(0), car -> {
            car.model="Citroen RX2";
            car.color="White";
            car.engine= 145.2;
            System.out.println("upgraded car: " + car);
        });

        System.out.println(ourCars);
    }

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for(int i=0;i<3;i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar (Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}