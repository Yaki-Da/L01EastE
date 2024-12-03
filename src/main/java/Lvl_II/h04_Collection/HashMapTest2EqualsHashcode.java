package Lvl_II.h04_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest2EqualsHashcode {
    public static void main(String[] args) {
        //Переопределение equals то надо переопределять Hashcode
        //Результат несколько выполнений метода hashcode для одного и того же объекта должен быть одинаковый
        //Если, согласно методу equals, два объекта равны, то и hashcode данных объектов обязательно должен быть одинаковым
        //стандартное присвоение Hashcoda учитывает адресс переменной и в связи с этим одинаковые объекты могут быть разными
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Ivanova", 1);
        Student st3 = new Student("Ivan", "Klinka", 4);
        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);
        Student st4 = new Student("Zaur", "Tregulov", 3);
        boolean result = map.containsKey(st4);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println("result = " + result);
    }
}
