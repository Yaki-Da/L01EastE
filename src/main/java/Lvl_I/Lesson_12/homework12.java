package Lvl_I.Lesson_12;
import Lvl_I.Lesson_11.*;
public class homework12 {
    public static void main(String[] args) {
        Car mark1 = new Car("Синий","V4", (byte) 2);
        Car mark2 = new Car("Красный","V4", (byte) 4);
        Car mark3 = new Car("Синий","V4", (byte) 2);
        System.out.println("Марка 1 " + mark1.color + "/" +  mark1.engine + "/" + mark1.numdoor);
        System.out.println("Марка 2 " + mark2.color + "/" +  mark2.engine + "/" + mark2.numdoor);
        System.out.println("Марка 3 " + mark3.color + "/" +  mark3.engine + "/" + mark3.numdoor);
        System.out.print("Сравним Марк 1 и Марк 2 и обнаружим что ");
        CarTest.Lesson12_1(mark1, mark2);
        System.out.println("------разделитель------");
        System.out.print("Если сравнить Марк 1 и Марк 2 то ");
        CarTest.Lesson12_2(mark1, mark2);
        System.out.println("------разделитель------");
        System.out.print("Если сравнить Марк 1 и Марк 3 то ");
        CarTest.Lesson12_2(mark1, mark3); //f = (b>c) ? 5:7 интересная тема.
    }
}
