package Lvl_II.h04_Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest1 {
    public static void main(String[] args) {
        //Set(HashSet(LinkedHashSet))
        //Set(SortedSet(NavigableSet(TreeSet)))
        //Set = Множество, коллекция хранит только уникальные элементы
        //В основе Set пользуется Map (несинхронизированная коллекция)
        //HashSet в отличии от HashMap использует только ключи являющиеся и эелементами
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        //set.add(null); а так же в основне HashSet стоит HashMap
        set.remove("Zaur");
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Oleg"));//поиск наличия элемента
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(2);
        hs1.add(3);
        hs1.add(5);
        hs1.add(1);
        hs1.add(8);
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(7);
        hs2.add(4);
        hs2.add(5);
        hs2.add(3);
        hs2.add(8);
        HashSet<Integer> union = new HashSet<>(hs1);
        HashSet<Integer> intersect = new HashSet<>(hs1);
        HashSet<Integer> subtract = new HashSet<>(hs1);
        //Объединение всех элементов
        union.addAll(hs2);
        //Исключить не повторяющиеся элементы
        intersect.retainAll(hs2);
        //Исключаются все повторяющиеся элементы
        subtract.removeAll(hs2);
        System.out.println("HashSet1 = " + hs1);
        System.out.println("HashSet2 = " + hs2);
        System.out.println("HashSetUnion = " + union);
        System.out.println("intersect = " + intersect);
        System.out.println("subtract = " + subtract);
    }
}
