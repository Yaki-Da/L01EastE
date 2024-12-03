package Lvl_II.h08_Multistreams;

public class Exmpl03 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MeThread3());
        Thread thread2 = new Thread(new MeThread4());
        thread1.start();
        thread2.start();
    }
}

class MeThread3 implements Runnable {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            System.out.println("MeThread1: " + i);
        }
    }
}
class MeThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println("MeThread1: " + i);
        }
    }
}

//public class Exmpl03 implements Runnable {
//    public void run() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Поток 1: " + i);
//        }
//    }
//    public static void main(String[] args) {
//        Thread thread1 = new Thread(new Exmpl03());
//        thread1.start();
//    }
//}