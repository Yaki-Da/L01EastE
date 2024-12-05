package Lvl_II.h08_Multistreams;

import java.util.concurrent.Semaphore;

public class Exmpl24Semaphore {
    public static void main(String[] args) {
        Semaphore callbox = new Semaphore(3);
        new Person("Ivan", callbox);
        new Person("Sero", callbox);
        new Person("Leon", callbox);
        new Person("Kris", callbox);
        new Person("Fild", callbox);

    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;
    public  Person (String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }
    public void run() {
        try {
            System.out.println(name + " ждёт...");
            this.callBox.acquire();
            System.out.println(name + " пользуется телефоном");
            sleep(1500);
            System.out.println(name + " звонок завершен");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            callBox.release();
        }
    }
}