package Lvl_II.h06_Lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("Привет!"));
    }

    public static void main(String[] args) {
        def((String st)->{return st.length();});
    }
}
interface I{
    int abc(String s);
}