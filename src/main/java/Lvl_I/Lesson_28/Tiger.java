package Lvl_I.Lesson_28;
public class Tiger {
    public void eat(String s) {
        if (s.equalsIgnoreCase("Мясо")) System.out.println("Тигр ест мясо");
        else throw new NeMyasoException("Тигр не ест " + s);
    }
    public void drink(String s) throws NeVodaException {
        if (s.equalsIgnoreCase("Вода")) System.out.println("Тигр пьет воду");
        else throw new NeVodaException("Тигр не пьет " + s);
    }
}