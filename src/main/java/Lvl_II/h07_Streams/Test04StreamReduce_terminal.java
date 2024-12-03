package Lvl_II.h07_Streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Test04StreamReduce_terminal {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int st1=5;
        list.add(st1);
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(8);
        //1-й эелемент x взаимодействует со всеми элементами y
        int result = list.stream().reduce((x,y) -> x*y).get();
        System.out.println(list + "\n" + result);
        //пример с пустым листом, умножение x y не происходит
        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((x,y) -> x*y);
        if(o.isPresent()) {
            System.out.println(o.get());
        }
        else{
            System.out.println("Not present");
        }
        //пример где указываем первое значения х, первого элемента и равен 1, метод get не нужен
        int result2 = list.stream().reduce(1,(x,y) -> x*y);
        System.out.println(list + "\n" + result2);
        Collection col = new ArrayList() {
        };
        //пример со строковым типом
        System.out.println(list);
        List<String> list3 = new ArrayList<>();
        list3.add("privet");
        list3.add("katamaran");
        list3.add("idea");
        list3.add("fantasy");
        String result3 = list3.stream().reduce((x,y) -> x + " " + y).get();
        System.out.println(result3);
    }
}
