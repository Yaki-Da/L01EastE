package Lvl_I.Lesson_23.test5;
class X {
    String s1 = "Hello";
}
class Y extends X {
    boolean bool = false;
}
public class Test {
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.s1+" "/*+x.bool*/);
    }
}
