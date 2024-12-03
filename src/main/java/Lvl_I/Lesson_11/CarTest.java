package Lvl_I.Lesson_11;

public class CarTest {
    public static void Test1(Car mark, byte numd){
        mark.numdoor = numd;
    }
    public static void Test2(Car unit1, Car unit2){
        String member;
        member = unit1.color;
        unit1.color = unit2.color;
        unit2.color = member;
    }
    // Для выполнения Lvl_I.Lesson_12
    public static void Lesson12_1(Car a1, Car a2) {
        if (a1.color.equals(a2.color)) System.out.print("цвета одинаковы, ");
        else System.out.print("цвета разные, ");
        if (a1.engine.equals(a2.engine)) System.out.print("двигатели одинаковы, ");
        else System.out.print("двигатели разные, ");
        if (a1.numdoor==a2.numdoor) System.out.println("количество дверей одинаково.");
        else System.out.println("количество дверей различно.");
    }
    public static void Lesson12_2(Car a1, Car a2){
        if (a1.color.equals(a2.color) && a1.engine.equals(a2.engine) && a1.numdoor==a2.numdoor)
            System.out.println("они абсолютно одинаковы.");
        else System.out.println("они имеют различия.");
    }
}
