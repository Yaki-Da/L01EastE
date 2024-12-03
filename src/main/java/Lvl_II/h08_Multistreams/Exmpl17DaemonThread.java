package Lvl_II.h08_Multistreams;

public class Exmpl17DaemonThread {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу");
        UserThread userThread = new UserThread();
        userThread.setName("Поток пользователя");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("Поток демон");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Главный поток завершил работу");
    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName()+" это Демон поток: "+isDaemon());
        for (char i='A';i<='J';i++) {
            try {
                sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName()+" это Демон поток: "+isDaemon());
        for(int i=1; i<=1000; i++){
            try {
                sleep(50);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}