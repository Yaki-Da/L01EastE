package Lvl_II.h08_Multistreams;

public class Exmpl07 {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);//задержка, указывается в миллисекундах, в 1 сек = 1000 мл.сек.
        }
        System.out.println("Поехали!!!");
    }
}
