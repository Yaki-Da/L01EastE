package Lvl_II.h08_Multistreams;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exmpl22CallableFutureSubmit {
    public static void main(String[] args) {
        // Создаем пул потоков с одним потоком
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Создаем задачу для подсчета суммы
        Callable<Long> sumTask = new Callable<Long>() {
            @Override
            public Long call() {
                long sum = 0;
                for (long i = 1; i <= 2000000; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        // Отправляем задачу на выполнение
        Future<Long> future = executorService.submit(sumTask);

        try {
            // Получаем результат выполнения задачи
            Long result = future.get();
            System.out.println("Сумма чисел от 1 до 2,000,000: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Завершаем работу пула потоков
            executorService.shutdown();
        }
    }
}

/*

ExecutorService: Создаем пул потоков с помощью Executors.newSingleThreadExecutor(),
    который будет выполнять задачи в одном потоке.
Callable: Определяем задачу sumTask, которая реализует интерфейс Callable и в методе
    call подсчитывает сумму чисел от 1 до 2,000,000.
submit: Отправляем задачу на выполнение с помощью метода submit, который возвращает объект Future.
    get: Используем метод get объекта Future для получения результата выполнения задачи. Этот метод
    блокирует выполнение, пока результат не будет готов.
Обработка исключений: Обрабатываем возможные исключения, такие как InterruptedException
    и ExecutionException.
shutdown: Завершаем работу пула потоков с помощью shutdown().

Запустив эту программу, вы получите сумму чисел от 1 до 2,000,000.

*/