package Lvl_II.h08_Multistreams;

public class Exmpl11 {
    static int counter = 0;
    public static synchronized void increment() {counter++;}

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new R());
        Thread t2 = new Thread(new R());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }

}

class R implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 100000; i++) {
            Exmpl11.increment();
        }
    }
}