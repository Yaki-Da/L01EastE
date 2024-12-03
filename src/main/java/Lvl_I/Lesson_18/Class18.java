package Lvl_I.Lesson_18;

public class Class18 {
    public static int[] sortirovka(int[] sortM, byte u) {
        for (int i = 0; i < sortM.length; i++) {
            for (int j = 0; j < sortM.length; j++) {
                if (((u == 0) && (sortM[i] > sortM[j])) || ((u == 1) && (sortM[i] < sortM[j]))) {
                    int member = sortM[j];
                    sortM[j] = sortM[i];
                    sortM[i] = member;
                }
            }
        }
        return sortM;
    }

    public static void showArray(String[][] mass) {
        System.out.print("{ ");
        for (int i=0;i<mass.length;i++) {
            System.out.print("{");
            for (int j=0;j<mass[i].length;j++) {
                System.out.print(mass[i][j]+i+j);
                if (j!=mass[i].length-1) System.out.print(", ");
                }
            System.out.print("}");
            if (i!=mass[i].length-1) System.out.print(", ");
            else System.out.print(" }");
        }
    }
}