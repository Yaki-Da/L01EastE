package Lvl_II.h05_Nested.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    static int a;

    interface I{}

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }
    void method () {
        System.out.println(Engine.countOfobject);
        Engine etest = new Engine(200);
        System.out.println(etest.countOfobject);
    }

    @Override
    public String toString() {
        return "Me car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;
        static int countOfobject;

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            System.out.println(a);

            this.horsePower = horsePower;
            countOfobject++; // подсчет созданных классов
        }
    }
}
class Test {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        System.out.println(e);
        Car car = new Car("Red", 2, e);
        System.out.println(car);

        Car.Engine e2 = new Car.Engine(128);
    }
}
class Z extends Car.Engine{
    Z() {super(200);}
}