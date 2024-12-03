package Lvl_II.h04_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod_5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder [] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        // вложенные переменные sb в array связаны с листом и являются ее частью или группой
        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("A");
        aL1.add("B");
        aL1.add("C");
        ArrayList<String> aL2 = new ArrayList<>();
        aL2.add("A");
        aL2.add("X");
        aL2.add("Y");
        System.out.println("aL1 = " + aL1 + '\n' + "aL2 = " + aL2);
        //aL1.removeAll(aL2); //удалит схожие элементы
        //aL1.retainAll(aL2); //удалит все не схожие элементы
        System.out.println("aL1 = " + aL1);

        System.out.println(aL1.containsAll(aL2)); //сравнивает наличие всех эелементов одного листа с другим

        List<String> myList = aL1.subList(0,2); //myList на самом деле есть ссылка на диапазон aL1 и является ее частью
        System.out.println("mYList (subList) = " + myList);

        Object[] objA = aL1.toArray(); //копирование массива
        String[] strA = aL1.toArray(new String[0]); //копирование массива с небольшим условием (указываем размер массива или ставим 0)
        for (String s:strA) {
            System.out.println(s);
        }

        List<Integer> l1 = List.of(3, 8, 13); //Легко создать но нельзя изменять, не имеет null
        System.out.println(l1);

        List<String> l2 = List.copyOf(aL2);
        System.out.println("list.copyof(aL2) = " + l2);
    }
}
