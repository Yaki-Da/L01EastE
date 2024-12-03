package Lvl_II.h07_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test08StreamCollect {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Niko", 'm', 28, 2, 6.4);
        Student st3 = new Student("Anna", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mary", 'f', 23, 3, 9.1);
        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

// Stream.collect(Collectors.groupingBy())
// Возвращает Map коллекцию, состоящяя из элементов в виде массивов, группированных по Course
        Map<Integer, List <Student>> map1 = list.stream().map(x -> {x.setName(x.getName().toUpperCase());return x;})
                .collect(Collectors.groupingBy(x -> x.getCourse()));

        for (Map.Entry <Integer, List<Student>> entry: map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
        System.out.println("-------------------------------------");
// Stream.collect(Collectors.partitioningBy())
// Возвращает 2 значения, ключ типа Boolean. 1-ый не соответсвующий условию, 2-й соответсвующий условию
        Map<Boolean, List <Student>> map2 = list.stream().collect(Collectors.partitioningBy(x -> x.getAvgGrade()>7));
        for (Map.Entry <Boolean, List<Student>> entry: map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
    }
}
