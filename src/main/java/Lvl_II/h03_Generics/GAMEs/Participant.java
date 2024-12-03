package Lvl_II.h03_Generics.GAMEs;

public abstract class Participant {
    private String name;
    private int age;
    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
