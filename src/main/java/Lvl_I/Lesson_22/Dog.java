package Lvl_I.Lesson_22;

public class Dog extends Pet{
    public StringBuilder name;
    public Dog(StringBuilder alfa) {
        this.name = alfa;
        System.out.println("I am dog and my name is: " + this.name);
    }
    public void play () {
        System.out.println("Dog plays");
    }
}
