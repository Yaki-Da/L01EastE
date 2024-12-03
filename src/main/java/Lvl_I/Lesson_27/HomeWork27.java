package Lvl_I.Lesson_27;
import Lvl_I.Lesson_28.*;
public class HomeWork27 {
    public static void main(String[] args) {
        Tiger t1 = new Tiger ();
        try {
            t1.eat("Мясо");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            t1.drink("Вода");
            try {
                t1.drink("Пиво");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Это пример finally block");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}