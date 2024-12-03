package Lvl_II.h08_Multistreams;

public class Exmpl08 extends Thread {
    public void run() {
        for(int i = 1; i<=10; i++) {
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable1());
        Exmpl08 t2 = new Exmpl08();
        t1.start();
        t2.start();

        t1.join(); //ожидает окончание потока t1
        t2.join(); //ожидает окончание потока t2
        System.out.println("End!!!");
    }
}

class MyRunnable1 implements Runnable {
    public void run() {
        for(int i = 1; i<=10; i++) {
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}