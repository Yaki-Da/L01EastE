package Lvl_II.h08_Multistreams;

public class Exmpl04 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет!1");
            }
        }).start();

        new Thread(() -> System.out.println("Привет!2")).start();
    }
}
