package Lvl_II.h04_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        //ключ должен быть уникальным, при добавлени одинакового ключа, старый затирается.
        map1.put(1000, "Zaur Tregulov");
        map1.put(4250, "Bob Shnaider");
        map1.put(3327, "Bek Bekov");
        map1.put(7409, "Vasciliy Zaicev");
        //Добавить если индекс пустой
        map1.putIfAbsent(1000, "Jack London");
        map1.putIfAbsent(1001, "Jack London");
        //вывод по индексу/ключу
        System.out.println(map1.get(1000));
        //удаление по индексу
        map1.remove(1000);
        //если есть такое значение/ключ то TRUE
        System.out.println(map1.containsValue("Bek Bekov"));
        System.out.println(map1.containsKey(4250));
        //вывод всех ключей/значений
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1);
        Map<String, String> map2 = new HashMap<>();
        map2.put("Cross", "Zaur Tregulov");
        map2.put("Bosco", "Vasciliy Zaic");
        System.out.println(map2);
    }
}
