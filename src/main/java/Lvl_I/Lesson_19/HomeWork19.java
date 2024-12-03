package Lvl_I.Lesson_19;
public class HomeWork19 {
    public static String[] abc(String ... str) {
        String [] rts = new String[str.length];
        int i = 0;
        for (String a:str) {
            rts[i] = a;
            System.out.print(rts[i]+"["+i+"]");
            i++;
            if (i<rts.length) System.out.print(", ");
            else System.out.println(".");
        }
        return rts;
    }
    public static void main(String[] args) {
        String [] g1 = new String[] {"Хлеб", "Булка","Вода","Ведро","Швабра"};
        String [] total = new String[g1.length];
        abc(g1);
        int j=0;
        for (String a:g1) {
            int i=0;
            int status=0;
            for (String b:args) if (a.equals(b)) status=1;
            if (status==1) total[j]=null;
            else total[j]=a;
            j++;
        }
        abc(total);
    }
}
