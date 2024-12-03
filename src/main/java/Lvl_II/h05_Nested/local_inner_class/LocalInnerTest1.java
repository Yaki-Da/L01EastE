package Lvl_II.h05_Nested.local_inner_class;

public class LocalInnerTest1 {
//Доступ к переменным только если final или effectively final то есть значения
//переменной в коде не меняется
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}
class Math {
    public void getResult (){
        class Delenie {
            private int del1;
            private int del2;

            public int getDel1() {
                return del1;
            }

            public void setDel1(int del1) {
                this.del1 = del1;
            }

            public int getDel2() {
                return del2;
            }

            public void setDel2(int del2) {
                this.del2 = del2;
            }
            public int getChastnoe () {
                return del1/del2;
            }
            public int getOstatok () {
                return del1%del2;
            }
        }
        Delenie delenie = new Delenie();
        delenie.setDel1(21);
        delenie.setDel2(21);
        System.out.println("остаток = " + delenie.getChastnoe());
        System.out.println("частное = " + delenie.getOstatok());
    }
}