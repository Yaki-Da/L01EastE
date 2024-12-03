package Lvl_II.h07_Streams;

import java.util.ArrayList;
import java.util.List;

public class Test10StreamMinMaxLimitSkip {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Niko", 'm', 28, 2, 6.4);
        Student st3 = new Student("Anna", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mary", 'f', 23, 3, 9.1);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
// Возвращает минимальное или максимальное значение согласно условию или .compareTo
        Student min = students.stream().min((x,y) -> x.getAge()-y.getAge()).get();
        System.out.println("min = " + min);

        Student max = students.stream().max((x,y) -> x.getAge()-y.getAge()).get();
        System.out.println("max = " + max);
// Ограничивает по количеству Limit, в примере выводит 2 значения вместо 4
        students.stream().filter(x -> x.getAge()>20).limit(2).forEach(System.out::println);
// Skip Пропускает первые значения, так же как и Limit но абсолютно наоборот
        students.stream().filter(x -> x.getAge()>20).skip(2).forEach(System.out::println);
    }
}
