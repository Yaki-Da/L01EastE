package Lvl_II.h07_Streams;

import java.util.ArrayList;
import java.util.List;

public class Test12StreamPatallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
// 1-й способ использования паралельного стрима list.parallelStream(). автоматически распределяет потоки
        double resultSum = list.parallelStream().reduce((x,y) -> x+y).get();
        System.out.println(resultSum);

// 2-й способ использования паралельного стрима Stream<T> s = Stream.of(); s.parallel().
        double divisionResult = list.parallelStream().reduce((x,y) -> x/y).get();
        System.out.println(divisionResult);
    }
}