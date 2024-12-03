package Lvl_II.h07_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test06StreamChaining {
    public static void main(String[] args) {
        int[] array = {3, 6, 3, 8, 6, 6, 9, 0, 4, 2};

        int result = Arrays.stream(array)
                .filter(x->x%2==1)
                .map(x->{if(x%3==0){x=x/3;} return x;})
                .reduce((x,y)->x+y).getAsInt();
        System.out.println(result);

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
// Все буквы сделали заглавными, отсортировка по полу и далее по возрасту.
        students.stream().map(element -> {element.setName(element.getName().toUpperCase());return element;})
                .filter(element -> element.getSex()=='f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .forEach(element -> System.out.println(element));
// пример потока где работа stream не обработался .collect(Collectors.toList());
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.filter(x -> {
            System.out.println("!!!");
            return x%2==0;
        });//.collect(Collectors.toList());
    }
}
