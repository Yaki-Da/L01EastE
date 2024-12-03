package Lvl_II.h04_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest1 {
    public static void main(String[] args) {
        ArrayList<String> aL1 = new ArrayList<>();
        aL1.add("1_A");
        aL1.add("2_B");
        aL1.add("3_C");
        aL1.add("4_D");
        aL1.add("5_F");
        Iterator<String> iterator = aL1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        //    iterator.next();
        //    iterator.remove();
        }
    }
}
