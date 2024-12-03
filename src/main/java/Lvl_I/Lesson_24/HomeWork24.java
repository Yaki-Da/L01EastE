package Lvl_I.Lesson_24;
public class HomeWork24 {
    public static void main(String[] args) {
        Mechenosec servisFish = new Mechenosec("(Рыбамечь)-Бобик");
        System.out.println("Меченосец:");
        System.out.print("-----------"); servisFish.eat();
        System.out.print("-----------"); servisFish.swim();
        System.out.print("-----------"); servisFish.sleep();
        Speakable servisBird = new Pingvin("(Пингвин)-Рико");
        System.out.println("Пингвин:");
        System.out.print("-----------");servisBird.speak();
        Animal servisLev1 = new Lev("(Лев)-Симба");
        System.out.println("Животное-Лев:");
        System.out.print("-----------"); servisLev1.eat();
        System.out.print("-----------"); servisLev1.sleep();
        Mammal servisLev2 = new Lev("(Лев)-Кутумба");
        System.out.println("Млекопитающее-Лев:");
        System.out.print("-----------"); servisLev2.run();
        System.out.print("-----------"); servisLev2.eat();
        System.out.print("-----------"); servisLev2.sleep();
        System.out.print("-----------"); servisLev2.speak();
    }
}
abstract class Animal{
    String name;
    Animal (String name) {
        this.name = name;
    }
    abstract void eat ();
    abstract void sleep ();
}
abstract class Fish extends Animal {
    Fish (String name) {
        super(name);
        this.name = name;
    };
    public void sleep (){
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }
    abstract void swim ();
}
abstract class Bird extends Animal implements Speakable {
    Bird (String name) {
        super(name);
        this.name = name;
    };
    abstract void fly ();
    public void speak (){
        System.out.println(name + " поёт");
    }
}
abstract class Mammal extends Animal implements Speakable {
    Mammal (String name) {
        super(name);
        this.name = name;
    };
    abstract void run ();
}
class Mechenosec extends Fish {
    Mechenosec (String name) {
        super(name);
        this.name = name;
    }
    public void eat (){
        System.out.println("Меченосец не хищная рыба, и она питается обычным рыбьим кормом");
    };
    public void swim (){
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    };
}
class Pingvin extends Bird {
    Pingvin (String name) {
        super(name);
        this.name = name;
    }
    public void sleep (){
        System.out.println("Пингвины спят прижавшись друг к другу!");
    };
    public void speak (){
        System.out.println("Пингвины не умеют петь как соловьи!");
    };
    public void eat (){
        System.out.println("Пингвины любят есть рыбу!");
    };
    public void fly (){
        System.out.println("Пингвины не умеют летать");
    };
}
class Lev extends Mammal {
    Lev (String name) {
        super(name);
        this.name = name;
    }
    public void eat (){
        System.out.println("Лев, как и любой хищник, любит мясо!");
    }
    public void run (){
        System.out.println("Лев - это не самая быстрая кошка!");
    }
    public void sleep (){
        System.out.println("Большую часть дня лев спит!");
    }
}
interface Speakable {
    default void speak() {
        System.out.println("Кто-то говорит");
    }
}