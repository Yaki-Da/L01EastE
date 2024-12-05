package Lvl_II.h08_Multistreams;

import java.util.concurrent.ArrayBlockingQueue;

public class Exmpl32ArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(4);

        //Producer
        new Thread(() -> {
            int i=0;
            while(true) {
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer добавил: " + i + " " + arrayBlockingQueue);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        //Consumer
        new Thread(() -> {
            int i=0;
            while(true) {
                try {
                    Integer j=arrayBlockingQueue.take();
                    System.out.println("Consumer забрал: " + j);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
