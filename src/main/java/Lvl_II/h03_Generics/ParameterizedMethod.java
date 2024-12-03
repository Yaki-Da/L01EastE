package Lvl_II.h03_Generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        int a = GetMethod.getSecondElement(al1);
        System.out.println(a);
    }
}
class GetMethod {
    public static <T> T getSecondElement(ArrayList<T> a1){
        return a1.get(0);
    }
}