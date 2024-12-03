package Lvl_I.Lesson_18;

import java.util.Arrays;

import static Lvl_I.Lesson_18.Class18.*;

public class Homework18 {
    public static void main(String[] args) {
        int[] ar1 = {5, 2, 3, 8, -1, 0, 4, 5, 1, 9, 6};
        System.out.println(Arrays.toString(ar1));
        sortirovka(ar1, (byte) 0);
        System.out.println(Arrays.toString(ar1));
        sortirovka(ar1, (byte) 1);
        System.out.println(Arrays.toString(ar1));
        String[][] st1 = new String[3][];
        st1[0]=new String [] {"Кар","Вор","Сор","Тор","Бит"};
        st1[1]=new String [] {"Пир"};
        st1[2]=new String [] {"Пон","Гол","Лот"};
        showArray(st1);
    }
}