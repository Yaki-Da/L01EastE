package Lvl_II.h08_Multistreams;

public class Exmpl05 {
    public static void main(String[] args) {
        MyThread5 mThread5 = new MyThread5();
        mThread5.setName("Поток1");
        mThread5.setPriority(1); //ограничение приоритета от 1 до 10
        System.out.println("Name = " + mThread5.getName() + ", Priority = " + mThread5.getPriority());

        MyThread5 mThread6 = new MyThread5();
        System.out.println("Name = " + mThread6.getName() + ", Priority = " + mThread6.getPriority());
    }
}
class MyThread5 extends Thread{
    public void run() {
        System.out.println("Привет!5");
    }
}