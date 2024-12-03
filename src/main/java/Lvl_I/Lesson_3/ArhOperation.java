package Lvl_I.Lesson_3;

public class ArhOperation {
    public static void main(String[] args) {
        int a=5,b=8;
        System.out.println(a-- - --a + ++a + a++ + a);  // 4 - 4 + 5 + 5 + 5
        System.out.println(++b - b++ + ++b - --b);      // 9 - 9 + 10 - 9
        int i1=5,i2=11;
        double d1=5.5,d2=1.3,result=0;
        long l=20l;
        a=5;
        b=8;
        System.out.println(a-- - --a + ++a + a++ + a);//5 - 3 + 4 + 4 + 5
        System.out.println(++b - b++ + ++b - --b);
    }
}
