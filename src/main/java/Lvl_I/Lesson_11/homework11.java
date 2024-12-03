package Lvl_I.Lesson_11;

public class homework11 {
    public static void main(String[] args) {
        Car mark1 = new Car("Синий", "V25-Mk4", (byte) 4);
        Car mark2 = new Car("Жёлтый", "T5-J", (byte) 6);
        System.out.println("Марка1 = Цвет = " + mark1.color + ", Двигатель = " + mark1.engine + ", Количество дверей = " + mark1.numdoor);
        System.out.println("Марка2 = Цвет = " + mark2.color + ", Двигатель = " + mark2.engine + ", Количество дверей = " + mark2.numdoor);
        CarTest.Test1(mark1, (byte) 3);
        CarTest.Test2(mark1, mark2);
        System.out.println("После применения методов");
        System.out.println("Марка1 = Цвет = " + mark1.color + ", Двигатель = " + mark1.engine + ", Количество дверей = " + mark1.numdoor);
        System.out.println("Марка2 = Цвет = " + mark2.color + ", Двигатель = " + mark2.engine + ", Количество дверей = " + mark2.numdoor);
    }
}
