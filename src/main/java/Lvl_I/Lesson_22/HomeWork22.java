package Lvl_I.Lesson_22;
//Инкапсуляция. Super Protected
public class HomeWork22 {
    public static void main(String[] args) {
        System.out.println("----- mission 1 -----");
        Student alfa = new Student();
        alfa.setName(new StringBuilder("Кобельский"));
        alfa.setCourse((byte) 3);
        alfa.setGrade((byte) 7);
        alfa.showInfo();
        System.out.println("----- mission 2 -----");
        Dog sharik = new Dog(new StringBuilder("Шарик"));
        System.out.println("Лапки - " + sharik.tail );
        Cat boris = new Cat(new StringBuilder("Борис"));
        boris.sleep();
    }
}
