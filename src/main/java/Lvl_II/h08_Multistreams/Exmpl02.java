package Lvl_II.h08_Multistreams;

public class Exmpl02 {
    public static void main(String[] args) {
        MeThread1 mTh1 = new MeThread1();
        MeThread2 mTh2 = new MeThread2();
        mTh1.start();
        mTh2.start();
    }
}

class MeThread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("MeThread1: " + i);
        }
    }
}
class MeThread2 extends Thread {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println("MeThread1: " + i);
        }
    }
}