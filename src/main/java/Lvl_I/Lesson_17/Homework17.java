package Lvl_I.Lesson_17;

public class Homework17 {
    public static boolean ravenstvo(StringBuilder st1, StringBuilder st2){
        return st1.toString().equals(st2.toString());
    }
    public static void main(String [] args) {
        StringBuilder s1 = new StringBuilder("123");
        StringBuilder s2 = new StringBuilder("123");
        StringBuilder s3 = new StringBuilder("321");
        System.out.println("Сравним 2 строки: " + s1 + " & " + s2 + " (" + ravenstvo(s1,s2) + ")");
        System.out.println("Сравним 2 строки: " + s1 + " & " + s3 + " (" + ravenstvo(s1,s3) + ")");
        System.out.println("Сравним 2 строки: " + s1 + " & " + "333" + " (" + ravenstvo(s1,new StringBuilder("333")) + ")");
        System.out.println();
    }
}