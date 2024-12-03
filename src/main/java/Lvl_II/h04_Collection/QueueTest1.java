package Lvl_II.h04_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1A");
        queue.add("2W");
        queue.add("3S");
        queue.add("4B");
        queue.offer("5H"); //при добавлении перехватывает ошибку
        queue.offer("6G");
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.element()); //вывод первого эелемента
        System.out.println(queue.peek()); //вывод первого элемента и перехват ошибки
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove("2W")); //удаление элемента
        System.out.println(queue.remove());
        System.out.println(queue.poll()); //при удалении ошибку перехватывает
        System.out.println(queue.poll());
    }
}
