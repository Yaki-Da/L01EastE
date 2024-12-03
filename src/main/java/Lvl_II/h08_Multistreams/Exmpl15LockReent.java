package Lvl_II.h08_Multistreams;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Exmpl15LockReent {
    public static void main(String[] args) {
        Call call = new Call();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
            Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch(InterruptedException a) {
            a.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class Skype {
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch(InterruptedException a) {
            a.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

class Whatsapp {
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Whatsapp call starts");
            Thread.sleep(5000);
            System.out.println("Whatsapp call ends");
        } catch(InterruptedException a) {
            a.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}