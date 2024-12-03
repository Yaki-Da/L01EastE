package Lvl_I.Lesson_8;

class Class1 {
    static int number1;
    static int number2;
    static int med1(int a1, int a2, int a3){
        number1=a1;
        number2=a2;
        int number3=a3;
        System.out.println("произведение 3-х чисел (" + (number1*number2*number3) + ") Сработал метод 1");
        return number1*number2*number3;
    }
    static void med2(){
        System.out.println("Деление 1 и 2 числа (" + (double)number1/number2 + ") Сработал метод 2");
    }
}
class Class2 {
    static void mission1() {
        System.out.println(Class1.med1(8, 3, 5));
        Class1.med2();
        System.out.println(Class1.med1(12, 5, 3));
        Class1.med2();
    }
}
class Class3 {
    static double pl1(double radius) {
        System.out.println(Homework8.pi*radius*radius + " задание 2_1");
        return Homework8.pi*radius*radius;
    }
}
