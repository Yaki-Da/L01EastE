package Lvl_II.h02_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//это пример Comparable
public class test2 {
    public static void main(String[] args) {
        List<Worker> list = new ArrayList<>();
        Worker w1 = new Worker(1, "Artek", "Martek", 10000);
        Worker w2 = new Worker(2, "Selen", "Quatro", 12500);
        Worker w3 = new Worker(3, "Danie", "Koreko", 9800);
        list.add(w2);
        list.add(w3);
        list.add(w1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

