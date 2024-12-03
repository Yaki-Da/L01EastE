package Lvl_II.h04_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest3 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mary", "Ivanovas", 1);
        Student st3 = new Student("Ivan", "Klinkara", 4);
        map.put(st1, 7.5);
        map.put(st2, 6.2);
        map.put(st3, 9.3);
        for(Map.Entry<Student, Double> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        Map<Integer, String> map1 = new HashMap<>(16, 0.75f);
    }
}
