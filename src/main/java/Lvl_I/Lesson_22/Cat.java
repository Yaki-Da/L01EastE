package Lvl_I.Lesson_22;

public class Cat extends Pet{
    public StringBuilder name;
    public Cat(StringBuilder alfa) {
        this.name = alfa;
        System.out.println("I am cat and my name is: " + this.name);
    }
    public void sleep(){
        System.out.println("Cat sleep");
    }
}
