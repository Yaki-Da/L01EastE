package Lvl_II.h08_Multistreams;

public class Exmpl06 implements Runnable{
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
        //статический метод, показывает текущий поток
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Exmpl06());
        thread.start();//метод Run не запускает поток
        System.out.println("Method main. Thread name = " + Thread.currentThread().getName());
    }
}
