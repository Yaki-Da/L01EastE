package Lvl_II.h07_Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test07StreamMethods {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream2 = Stream.of(6,3,8,0,2);

        //Stream.concat() метод объединения 2-х потоков в один, не используется в цепочке
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::print);
        System.out.println();

        //Stream.distinct(i) выводит уникальыне значения (не повторяющиеся)
        Stream<Integer> stream4 = Stream.of(6,3,8,0,2,0,1,6,3);
        stream4.distinct().forEach(System.out::print);
        System.out.println();

        //Stream.count(t) выводит количество элементов в потоке
        Stream<Integer> stream5 = Stream.of(5,9,7,1,5,3,6,5,1,4);
        System.out.println(stream5.distinct().count());

        //Stream.peek(i) служит для промежуточных операций в потоке, обычно для отладки.
        Stream<Integer> stream6 = Stream.of(5,8,3,3,1,4);
        System.out.println(stream6.distinct().peek(System.out::print).count());

        //Stream.flatMap(i) позволяет сформировать массив, применяя функцию к каждому элементу,
        //затем уменьшает вложенность, делая этот массив плоским, и возвращает его.
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Niko", 'm', 28, 2, 6.4);
        Student st3 = new Student("Anna", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7.0);
        Student st5 = new Student("Mary", 'f', 23, 3, 9.1);
        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStdToFaculty(st1);
        f1.addStdToFaculty(st2);
        f1.addStdToFaculty(st3);
        f2.addStdToFaculty(st4);
        f2.addStdToFaculty(st5);
        List<Faculty> facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);
        facultyList.stream().flatMap(f -> f.getStdOnFaculty().stream())
                .forEach(x -> System.out.println(x.getName()));
    }
}

