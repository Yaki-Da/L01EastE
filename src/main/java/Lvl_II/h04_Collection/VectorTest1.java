package Lvl_II.h04_Collection;

import java.util.Stack;
import java.util.Vector;

public class VectorTest1 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Bob");
        vector.add("AzAzA");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));

        Stack<String> stack = new Stack<>();
        stack.push ("zaur");
        stack.push ("Bar");
        stack.push ("Kinza");
        stack.push ("Kortik");
        System.out.println(stack);
//        System.out.println(stack.pop()); //удаляет элемент с вершины стека
//        while(!stack.isEmpty()) {//удаляет элемент с вершины стека c проверкой на пустоту
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
        System.out.println(stack.peek()); // вывести вершину стека на экран
    }
}
