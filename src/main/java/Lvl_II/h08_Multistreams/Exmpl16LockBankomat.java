package Lvl_II.h08_Multistreams;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Exmpl16LockBankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);
    }
}

class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run() {
        if (lock.tryLock())
        try {
//            System.out.println(name + " ждёт... ");
//            lock.lock();
            System.out.println(name + " пользуется банкоматом");
            Thread.sleep(2000);
            System.out.println(name + " завершил(а) свои дела");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}