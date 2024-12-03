package Lvl_II.h07_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test09StreamfindFirst {
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

// findFirst() возвращает первый элемент по порядку из Stream-a, в виде обертки Optional
        Student first = students.stream().map(x -> {x.setName(x.getName().toUpperCase());return x;})
                .filter(x -> x.getSex()=='f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(first);
    }
}
