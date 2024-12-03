package Lvl_II.h03_Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>(); // ? супер тип, подставляет любой класс он же WildCard
        //List<? extends Number> list = new ArrayList<>();
        //List<? super Number> list = new ArrayList<>(); Верхняя граница распространения
        List<Double> list1 = new ArrayList<>();
        list1.add(5.0);
        list1.add(5.1);
        list1.add(5.2);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Привет");
        list2.add("Пока");
        list2.add("Кошка");
        showListInfo(list2);
        ArrayList<Double> ald = new ArrayList<>();
        ald.add(2.1);
        ald.add(2.3);
        ald.add(2.5);
        System.out.println(summ(ald));
    }
    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы: " + list);
    }
    public static double summ(ArrayList<? extends Number> al) {
        double summ = 0;
        for (Number n: al) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}
