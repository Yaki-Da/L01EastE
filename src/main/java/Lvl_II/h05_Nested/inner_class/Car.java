package Lvl_II.h05_Nested.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }
    public void setEngine (Engine engine) {
        this.engine=engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {
        private int horsePower;

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            this.horsePower = horsePower;

        }
    }
}
class Test {
    public static void main(String[] args) {
        Car car = new Car("green", 4);
        Car.Engine engine = car.new Engine(150);
        Car.Engine engine1 = new Car("White", 2).new Engine(90);

        car.setEngine(engine);
        System.out.println(engine.toString() + '\n' + car);
    }
}