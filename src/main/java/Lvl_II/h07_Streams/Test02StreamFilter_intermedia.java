package Lvl_II.h07_Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test02StreamFilter_intermedia {
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
        students = students.stream()
                .filter(x -> x.getAge()>22 && x.getAvgGrade()<7.2)
                .collect(Collectors.toList());
        System.out.println(students);

// альтернативный вариант
        Stream<Student> myStream = Stream.of(st1,st2,st3,st4,st5);
        myStream.filter(x -> x.getAge()>22 && x.getAvgGrade()<7.2)
                .collect(Collectors.toList());
    }
}
