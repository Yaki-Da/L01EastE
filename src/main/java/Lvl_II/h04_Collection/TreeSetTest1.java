package Lvl_II.h04_Collection;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {
    public static void main(String[] args) {
        //При переопределении OVERRIDE a.equals(b) -> true; a.compareTo(b) -> 0;
        //TreeSet хранит элементы в отсортированном по возрастанию порядке
        //Основа TreeSet это TreeMap где значения константа заглушка
        Set<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(9);
        ts.add(7);
        //TreeSet null не хранит
        System.out.println(ts);

        TreeSet<Warrior> war = new TreeSet<>();
        Warrior wr1 = new Warrior("Zaur", 35);
        Warrior wr2 = new Warrior("Mavr", 27);
        Warrior wr3 = new Warrior("Leon", 41);
        Warrior wr4 = new Warrior("Oleg", 28);
        Warrior wr5 = new Warrior("Ivan", 40);
        war.add(wr1);
        war.add(wr2);
        war.add(wr3);
        System.out.println(war.first());
        System.out.println(war.last());
        System.out.println(war.headSet(wr4)); //выделить от этого ключа и меньше
        System.out.println(war.tailSet(wr4)); //выделить от этого ключа и выше
        System.out.println(war.subSet(wr4, wr5)); // выделить между ключами элементы
        System.out.println(war);
        System.out.println(wr3.equals(wr1));
        System.out.println("HashCodes : " + wr3.hashCode()+ " vs "
                + wr1.hashCode() + " = " + (wr3.hashCode()==wr1.hashCode()));
    }
}
class Warrior implements Comparable<Warrior>{
    String name;
    int age;

    public Warrior(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(@NotNull Warrior o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return age == warrior.age;
                //ниже описанный код убран для соблюдения правила в нашем примере
                //&& Objects.equals(name, warrior.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
        //Так как сравнение идет только по одному параметру age Objects.hash(name, age);
    }
}
