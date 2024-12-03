package Lvl_I.Lesson_22;

public class Pet extends Animal {
    public StringBuilder name;
    public int tail=1;
    public int paw=4;
    public Pet (){
        System.out.println("I am pet");
        eyes = 2;
    }
    public void run() {
        System.out.println("Pet runs");
    }
    public void jimp() {
        System.out.println("Pet jumps");
    }
}
