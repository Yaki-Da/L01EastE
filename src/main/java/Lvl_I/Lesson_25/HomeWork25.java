package Lvl_I.Lesson_25;
import java.util.ArrayList;
import java.util.Arrays;
public class HomeWork25 {
    public static void main(String[] args) {
        Animal ann1 = new Mechenosec("(Рыбамечь)-Бобик_Animal");
        Animal ann2 = new Pingvin("(Пингвин)-Рико_Animal");
        Animal ann3 = new Lev("(Лев)-Симба_Animal");
        Fish fnn1 = new Mechenosec("(Рыбамечь)-Бобик_Fish");
        Bird bnn1 = new Pingvin("(Пингвин)-Рико_Bird");
        Mammal lnn1 = new Lev("(Лев)-Симба_Mammal");
        Mechenosec mmn1 = new Mechenosec("(Рыбамечь)-Бобик_Mechenosec");
        Pingvin ppn1 = new Pingvin("(Пингвин)-Рико_Pingvin");
        Lev lln1 = new Lev("(Лев)-Симба_Lev");
        Speakable spp1 = new Pingvin("(Пингвин)-Рико_Speakable");
        Speakable spp2 = new Lev("(Лев)-Симба_Speakable");
        Speakable [] spk = new Speakable[11];
        Animal [] anm = new Animal[11];
        ArrayList <Object> aLT = new ArrayList();
        aLT.addAll(Arrays.asList(ann1,ann2,ann3,fnn1,bnn1,lnn1,mmn1,ppn1,lln1,spp1,spp2));
        int i=-1, j=-1;
        for (Object ir : aLT) {
            if (ir instanceof Speakable) {
                spk[++i] = (Speakable) ir;
                System.out.print(ir.getClass().getSimpleName() + " является Speakable занесен в массив spk[" + i + "] и ");
            }
            else System.out.print(ir.getClass().getSimpleName() + " НЕ является Speakable и ");
            if (ir instanceof Animal) {
                anm[++j] = (Animal) ir;
                System.out.println("является Animal занесен в массив anm[" + j + "]");
            }
            else System.out.println(" НЕ является Animal");
        }
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