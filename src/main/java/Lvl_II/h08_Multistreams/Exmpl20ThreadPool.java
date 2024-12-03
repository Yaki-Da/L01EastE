package Lvl_II.h08_Multistreams;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exmpl20ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        for(int i=0; i<10; i++) {
//            scheduledExecutorService.execute(new RunnableImpl200());
//        }
        scheduledExecutorService.scheduleAtFixedRate(new RunnableImpl200(),3,1, TimeUnit.SECONDS);
        Thread.sleep(10000);
        scheduledExecutorService.shutdown();
        scheduledExecutorService.scheduleWithFixedDelay(new RunnableImpl200(),3,1,TimeUnit.SECONDS);
    }
}

class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(Thread.currentThread().getName() + " end work");
    }
}