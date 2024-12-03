package Lvl_II.h05_Nested.anonymous_class;

public class Test1 {
    private int p=5;
    public static void main(String[] args) {
        //Анонимный класс m и m2
        Math m = new Math(){
            @Override
            public int doOperation (int a, int b) {
                Test1 t1 = new Test1();
                return a+b+t1.p;
            }
        };
        Math m2 = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };

        System.out.println("m1 = " + m.doOperation(3,6));
        System.out.println("m2 = " + m2.doOperation(3,6));
    }
}
interface Math {
    int doOperation (int a, int b);
}