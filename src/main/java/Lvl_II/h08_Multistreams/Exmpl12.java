package Lvl_II.h08_Multistreams;

public class Exmpl12 {
    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new RunnableMobile());
        Thread t2 = new Thread(new RunnableSkype());
        Thread t3 = new Thread(new RunnableWhatsapp());
        t1.start();
        t2.start();
        t3.start();
    }

    synchronized void mobileCall() {
        synchronized (lock){
        System.out.println("Mobile call starts");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mobile call ends");
        }
    }

    synchronized void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }

    synchronized void whatsappCall() {
        synchronized (lock) {
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp call ends");
        }
    }
}

class RunnableMobile implements Runnable{

    @Override
    public void run() {
        new Exmpl12().mobileCall();
    }
}

class RunnableSkype implements Runnable{

    @Override
    public void run() {
        new Exmpl12().skypeCall();
    }
}

class RunnableWhatsapp implements Runnable{

    @Override
    public void run() {
        new Exmpl12().whatsappCall();
    }
}