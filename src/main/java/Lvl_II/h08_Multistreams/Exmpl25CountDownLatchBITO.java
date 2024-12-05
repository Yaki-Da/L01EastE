package Lvl_II.h08_Multistreams;

import java.util.concurrent.CountDownLatch;

public class Exmpl25CountDownLatchBITO {
    static CountDownLatch latch = new CountDownLatch(3);

    public static void main(String[] args) {
        // Создаем три потока для работников
        Thread worker1 = new Thread(() -> {
            System.out.println("Работник 1 на месте.");
            marketStaffIsOnPlace();
            latch.countDown(); // Уменьшаем счетчик
        });

        Thread worker2 = new Thread(() -> {
            System.out.println("Работник 2 на месте.");
            marketStaffIsOnPlace();
            latch.countDown(); // Уменьшаем счетчик
        });

        Thread worker3 = new Thread(() -> {
            System.out.println("Работник 3 на месте.");
            marketStaffIsOnPlace();
            latch.countDown(); // Уменьшаем счетчик
        });

        // Запускаем потоки
        worker1.start();
        worker2.start();
        worker3.start();

        try {
            // Ждем, пока все работники не будут на месте
            latch.await();
            everythingIsReady(); // Подготовка завершена
            openMarket(); // Открываем рынок
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void marketStaffIsOnPlace() {
        try {
            Thread.sleep(2000); // Имитация времени, необходимого работнику для подготовки
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void everythingIsReady() {
        try {
            Thread.sleep(3000); // Имитация времени подготовки
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void openMarket() {
        System.out.println("Рынок открыт");
    }
}

/*
CountDownLatch: Создается объект CountDownLatch с начальным значением 3, что означает, что три потока должны
                завершить свою работу, прежде чем основной поток продолжит выполнение.
Работники:      Создаются три потока, каждый из которых моделирует работника, который должен подготовиться, прежде чем
                рынок откроется.
Счетчик:        Каждый работник уменьшает счетчик latch на единицу после завершения своей подготовки, вызывая
                метод countDown().
Ожидание:       Основной поток вызывает latch.await(), чтобы дождаться, пока все работники не будут готовы.
Открытие рынка: После того как все работники завершили свою подготовку, основной поток продолжает выполнение и
                открывает рынок. Запустив эту программу, вы увидите, как работники подготавливаются, и в конце будет
                выведено сообщение о том, что рынок открыт.
*/
