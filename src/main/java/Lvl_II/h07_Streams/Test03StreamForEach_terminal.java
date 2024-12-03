package Lvl_II.h07_Streams;

import java.util.Arrays;

public class Test03StreamForEach_terminal {
    public static void main(String[] args) {
        int[] array = {5,9,3,8,1};
//        Пример 1
        Arrays.stream(array).forEach(x -> System.out.println(x));
//        Пример 2
        Arrays.stream(array).forEach(System.out::println);
//        Пример 3
        Arrays.stream(array).forEach(TeMethod::myMethod);
//        новый пример
        Arrays.stream(array).forEach(y -> {y*=2; System.out.println(y);
        });
    }
}
