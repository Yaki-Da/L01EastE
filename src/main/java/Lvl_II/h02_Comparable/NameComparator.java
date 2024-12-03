package Lvl_II.h02_Comparable;

import java.util.Comparator;

class NameComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.name.compareTo(o2.name);
    }
}
