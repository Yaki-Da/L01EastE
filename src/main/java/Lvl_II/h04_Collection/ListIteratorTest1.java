package Lvl_II.h04_Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest1 {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch:s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reversseiterator = list.listIterator(list.size());
        boolean isPalindrom = true;
        while(iterator.hasNext() && reversseiterator.hasPrevious()) {
            if (iterator.next() != reversseiterator.previous()) {
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("NOT Palindrome");
        }
    }
}
