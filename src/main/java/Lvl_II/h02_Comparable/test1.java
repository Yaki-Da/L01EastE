package Lvl_II.h02_Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test1 {
    public static void main(String arg[]){
        List<String> list = new ArrayList<>();
        list.add("Веник");
        list.add("Струна");
        list.add("Камни");
        list.add("Эврика");
        list.add("Сектор");
        list.add("Гравитация");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
