package Lvl_II.h08_Multistreams;

public class SynchronizedBlock1 {
    volatile static int counter = 0;

    public static void increment(){
        synchronized (SynchronizedBlock1.class){
            counter++;
        }
    }

    public static void main(String[] args) {
        MyRunnable2 runnable = new MyRunnable2();
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnable2 implements Runnable{
    private void doWork2(){
        System.out.println("doWork #2!!!");
    }

    private void doWork1() { // synchronized
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
