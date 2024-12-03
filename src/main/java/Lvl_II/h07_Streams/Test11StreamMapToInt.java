package Lvl_II.h07_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test11StreamMapToInt {
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

// Из списка StreamMax вывел массив типа Integer в новый массив, и только одну позицию по примеру Course
        List<Integer> list = students.stream()
                .mapToInt(x -> x.getCourse())
                .boxed()//переводит из Stream в
                .collect(Collectors.toList());
        System.out.println(list);

// Сумировал все курсы
        int sum = students.stream().mapToInt(x -> x.getCourse()).sum();
        System.out.println(sum);
    }
}
