package Lvl_I.Lesson_2;
public class PrimitivDate {
    public static void main(String[] args) {
        byte a1 = 10;
        byte a2 = 20;
        byte a3 = 100;
        short s1 = 5;
        short s2 = -10;
        short s3 = 0;
        int i1= 500;
        long l1 = 1000;
        long l2 = 10000000000L;
        float f1 = 3.14F;
        float f2 = 2.55f;
        float f3 = 20;
        double d1 = 5.33D;
        double d2 = 63.21;
        char c1 = 'a';
        char c2 = '$';
        char c3 = 100;
        char c4 = '\u01EE';
        boolean bool1 = true;
        boolean bool0 = false;
        int aa1=60;         // 10-ричная система счисления
        int aa2=0b111100;   // 2 -ичная система счисления
        int aa3=074;        // 8 -ричная система счисления
        int aa4=0x3c;       // 16-ричная система счисления
        int aa7 = 1_000_000;// "_" не читается, удобно в писании кода и больших чисел (андерскор)
        System.out.println(aa1+" "+aa2+" "+aa3+" "+aa4+" "+aa7);
        System.out.println("--------------------------------------------");
        byte tB1=0b1100, tB2=014, tB3=12, tB4=0xC;
        System.out.println(tB1+" "+tB2+" "+tB3+" "+tB4);
        short tS1=-0b010100010100, tS2=-02424, tS3=-1300, tS4=-0x514;
        System.out.println(tS1+" "+tS2+" "+tS3+" "+tS4);
        int tI1=0b0, tI2=00, tI3=0, tI4=-0x0;
        System.out.println(tI1+" "+tI2+" "+tI3+" "+tI4);
        long tL1=0b0111_0101_1011_1100_1101_0001_0101, tL2=0726746425, tL3=123456789, tL4=0x75BCD15;
        System.out.println(tL1+" "+tL2+" "+tL3+" "+tL4);
        float tF1=1000.0001F, tF2=5000.0F;double tD1=1000.0001, tD2=5000.0;boolean t=true, f=false;
        System.out.println(tF1+" "+tF2+" "+tD1+" "+tD2+" "+t+" "+f);
        char cC1='4',cC2='\'',cC3='G',cC4=200,cC5='\u00FF';
        System.out.println(cC1+" "+cC2+" "+cC3+" "+cC4+" "+cC5);
    }
}
