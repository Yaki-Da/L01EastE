package Lvl_II.h07_Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test01StreamMap_intermedia {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("kak dela");
        list.add("OK");
        list.add("poka");
        System.out.println(list);
// Заменяет лист, вместо текста подставляет значение его длины в формате String
//        for(int i=0; i<list.size();i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

// применение потоков, stream
        List<Integer> list2 = list.stream()     //подключение потока stream,не меняет lsit
                .map(element->element.length()) //метод map выводит длину элемента
                .collect(Collectors.toList());  //метод collect преобразовал поток в list
        System.out.println(list2);
        int[] array = {3,6,8,2,4,9};
// Лямбда выражение, если делится на 3 без остатка, число будет поделено на 3
        array = Arrays.stream(array).map(element
                -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
        return element;
        }).toArray();
        System.out.println(Arrays.toString(array));

// Поток на примере с коллекцией Set (Set содержит сортировочные значения)
        Set<String> set = new TreeSet<>();
        set.add("privet");
        set.add("kak dela");
        set.add("OK");
        set.add("poka");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(x->x.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(x->x.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);
    }
}
