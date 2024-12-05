package Lvl_II.h08_Multistreams;

import java.util.concurrent.CountDownLatch;

public class Exmpl26CountDownLatch {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    public static void main(String[] args) throws InterruptedException {
        new People ("Шамиль", countDownLatch);
        new People ("Рустам", countDownLatch);
        new People ("Владимир", countDownLatch);
        new People ("Джабраил", countDownLatch);
        new People ("Эльдар", countDownLatch);

        marketStaffIsOnPlace();
        everyThingIsReady();
        openMarket();
    }

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Выполнен 1-ый из 3-х этапов");
        countDownLatch.countDown();
        System.out.println("---------------------= " + countDownLatch.getCount());
    }

    private static void everyThingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Выполнен 2-ый из 2-х этапов");
        countDownLatch.countDown();
        System.out.println("---------------------= " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Магазин открыт");
        countDownLatch.countDown();
        System.out.println("---------------------= " + countDownLatch.getCount());
    }
}

class People extends Thread {
    String name;
    private CountDownLatch countDownLatch;
    public People (String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " приступил к закупкам");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}