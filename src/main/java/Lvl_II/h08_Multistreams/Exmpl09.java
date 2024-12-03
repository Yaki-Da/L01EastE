package Lvl_II.h08_Multistreams;

public class Exmpl09 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread t1 = new Thread(new Worker());
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        t1.join(1500); // Время ожидания, после чего операция пропускается
        System.out.println(t1.getState());
        System.out.println("Method main ends");
    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begin!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends!");
    }
}