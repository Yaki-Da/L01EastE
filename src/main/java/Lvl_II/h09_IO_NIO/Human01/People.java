package Lvl_II.h09_IO_NIO.Human01;

import java.io.Serializable;

public class People implements Serializable {
    String name;
    int age;
    double salary;
    Automobile car;
    public People(String name, int age, double salary, Automobile car) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
