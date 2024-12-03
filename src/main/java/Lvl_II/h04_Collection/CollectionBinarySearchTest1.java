package Lvl_II.h04_Collection;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class CollectionBinarySearchTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> aL = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<10; i++ ) {
            aL.add(random.nextInt(-10,10));
        }
        System.out.println("Не сортированный массив " + aL);
        Collections.sort(aL);
        System.out.println("Сортированный массив    " + aL);

        ArrayList<Worker> wL = new ArrayList<>();
        Worker w1 = new Worker(10, "Ivan", 5000);
        Worker w2 = new Worker(22, "Lena", 4700);
        Worker w3 = new Worker(15, "Tima", 8000);
        Worker w4 = new Worker(10, "Area", 6200);
        Worker w5 = new Worker(37, "Mike", 3900);
        wL.add(w1);
        wL.add(w2);
        wL.add(w3);
        wL.add(w4);
        wL.add(w5);
        System.out.println("      Без сортировки = " + wL);
        Collections.sort(wL, (a1, a2) -> a1.iD.compareTo(a2.iD));
        System.out.println("    Сортировка по iD = " + wL);
        Collections.sort(wL, (a1, a2) -> a1.name.compareTo(a2.name));
        System.out.println("  Сортировка по name = " + wL);
        Collections.sort(wL, (a1, a2) -> a1.salary.compareTo(a2.salary));
        System.out.println("Сортировка по salary = " + wL);
        Collections.sort(wL);
        System.out.println("Сортировка по iDname = " + wL);
        //бинарный поиск проводится только в отсортированном массиве
        int idx = Collections.binarySearch(wL, new Worker(37, "Mike", 3900));
        System.out.println("Поиск позиции (37)Mike 3900$ = " + idx);

        Collections.reverse(wL); // обратная сортировка
        System.out.println("Обратная сортировка  = " + wL);
        Collections.shuffle(wL); // смешивание
        System.out.println("       Размешивание  = " + wL);

        int[] aN = {4,2,6,0,5,3,-3,-5,7,0,9};
        int p = 5;
        System.out.println("Массив чисел " + Arrays.toString(aN));
        Arrays.sort(aN);
        System.out.println("  Сортировка " + Arrays.toString(aN));
        if (Arrays.binarySearch(aN, p)>=0) {
            System.out.println("Бинарный поиск числа " + p + " на позиции = " +
                    Arrays.binarySearch(aN, p));
        }
        else System.out.println("Бинарный поиск не нашел число " + p);

    }
}
class Worker implements Comparable<Worker>{
    Integer iD;
    String name;
    Integer salary;

    public Worker(int iD, String name, int salary) {
        this.iD = iD;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "(" + iD + ")" + name + " " + salary + "$";
    }

    @Override
    public int compareTo(@NotNull Worker o) {
        int result = this.iD - o.iD;
        if (result==0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}