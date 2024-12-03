package Lvl_I.Lesson_23.test1.p2;

import Lvl_I.Lesson_23.test1.p1.X;

public class Y extends X {
    Y() {}
    public void abc() {
        System.out.println("Y");
    }
    public static void main(String[] args) {
        Y y= new Y();
        y.abc();
    }
}
