package Lvl_II.h08_Multistreams;

public class Exmpl18InterruptedEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Запуск основного потока");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        thread.sleep(2500);
        thread.interrupt();
        thread.join();
        System.out.println("Работа основного потока завершена!");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum=0;
    public void run() {
        for (int i=1; i<=1000000000; i++) {
            if(isInterrupted()) {
                System.out.println("--= Прерывание потока! =--");
                System.out.println("(Прерывание) sqrtSum = "+sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток перехвачен, работа завершена!");
                System.out.println("(Перехват) sqrtSum = "+sqrtSum);
                return;
            }
        }
        System.out.println("sqrtSum = "+sqrtSum);
    }
}