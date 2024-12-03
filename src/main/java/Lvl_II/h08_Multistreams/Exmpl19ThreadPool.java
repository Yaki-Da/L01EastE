package Lvl_II.h08_Multistreams;

import java.util.concurrent.*;

public class Exmpl19ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=0; i<10; i++) {
            executorService.execute(new RunnableImpl100());
        }
        executorService.shutdown(); //завершает работу потоков, снимает режим ожидания
        executorService.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main ends");
    }
}

class RunnableImpl100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
