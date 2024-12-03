package Lvl_II.h05_Nested.local_inner_class;

public class LocalInnerTest2 {
    public static void main(String[] args) {
        class Slojenie implements Math2 {
            @Override
            public int doOperation (int a, int b) {
                return a+b;
            }
        }
        Slojenie s = new Slojenie();
        System.out.println(s.doOperation(5,3));
    }
}
interface Math2 {
    int doOperation(int a, int b);
}