package Lvl_II.h04_Collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethod_1_4 {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("1_A");
        aL1.add("2_B");
        aL1.add("3_C");
        aL1.add("4_D");
        aL1.add("5_F");
        aL1.add(4,"add Fake");
        System.out.println(aL1);
        aL1.set(4,"set Fake");
        System.out.println(aL1);
        aL1.remove(4);
        System.out.println(aL1);
        ArrayList<Tank> aL2 = new ArrayList<>();
        Tank t1 = new Tank("T-34", 32, "armored", "Russia", 57500);
        Tank t2 = new Tank("T-55", 32, "armored", "Russia", 115000);
        Tank t3 = new Tank("M4A1", 32, "armored", "America", 132000);
        Tank t4 = new Tank("Panzer III", 32, "armored", "Germany", 105200);
        Tank t5 = new Tank("APC", 32, "armored", "France", 37800);
        Tank t6 = new Tank("APC", 32, "armored", "France", 37800);
        aL2.add(t1);
        aL2.add(t2);
        aL2.add(t3);
        aL2.add(t4);
        aL2.add(t5);
        System.out.println(aL2);
        aL2.remove(t6);
        System.out.println(aL2);
        ArrayList<Object> aL3 = new ArrayList<>();
        aL3.add(aL1);
        aL3.add(aL2);
        System.out.println(aL3.get(0));
        System.out.println("Элемент A1: " + ((ArrayList<String>)aL3.get(0)).get(0));
        System.out.println(aL3.indexOf(aL1));
        System.out.println(aL3.lastIndexOf(aL1));
        System.out.println(aL3.size());
        System.out.println(aL3.isEmpty());
        System.out.println(aL3.contains(aL1));
    }
}
class Tank {
    private String name;
    private int weight;
    private String type;
    private String country;
    private int price;

    @Override
    public String toString() {
        return "Tank{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                '}' + '\n';
    }

    public Tank(String name, int weight, String type, String country, int price) {
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.country = country;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tank tank = (Tank) o;
        return weight == tank.weight && price == tank.price && Objects.equals(name, tank.name) && Objects.equals(type, tank.type) && Objects.equals(country, tank.country);
    }
}
