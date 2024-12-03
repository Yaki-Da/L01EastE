package Lvl_II.h02_Comparable;

import org.jetbrains.annotations.NotNull;

class Worker implements Comparable<Worker> {
    int id;
    String name;
    String surname;
    int salary;

    public Worker(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(@NotNull Worker o) {
        return this.id - o.id;
    }
}
