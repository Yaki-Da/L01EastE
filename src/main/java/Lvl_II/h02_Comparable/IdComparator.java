package Lvl_II.h02_Comparable;

import java.util.Comparator;

class IdComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        if (o1.id == o2.id) return 0;
        else if (o1.id > o2.id) return 1;
        else return -1;
    }
}
