package Lvl_I.Lesson_14;

public class TimeTest {
    public static void TimeTest1() {
        END1: for (int h=0; h<=6; h++) {
            END2:for (int m=0; m<=59; m++) {
                if (h>1 && (m%10)==0) break END1;
                for (int s = 0; s <= 59; s++) {
                    if (s*h>m) {
                        System.out.println("minuts up");
                        continue END2;
                    }
                    System.out.println(h + ":" + m + ":" + s);
                }
            }
        }
    }
    public static void TimeTest2() {
        int h=0;
        ED1:
        while (h<=6) {
            int m=-1;
            ED2: do {
                m+=1;
                if (h>1 && (m%10)==0) break ED1;
                for (int s = 0; s <= 59; s++) {
                    if (s*h>m) {
                        System.out.println("minuts up");
                        continue ED2;
                    }
                    System.out.println(h + ":" + m + ":" + s);
                }
            } while (m<59);
            h++;
        }
    }
}
